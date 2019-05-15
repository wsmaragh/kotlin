/*
 * Copyright 2010-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.backend.jvm

import org.jetbrains.kotlin.backend.common.LoggingContext
import org.jetbrains.kotlin.backend.common.phaser.PhaseConfig
import org.jetbrains.kotlin.codegen.*
import org.jetbrains.kotlin.codegen.state.GenerationState
import org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor
import org.jetbrains.kotlin.ir.declarations.IrModuleFragment
import org.jetbrains.kotlin.ir.util.SymbolTable
import org.jetbrains.kotlin.ir.backend.jvm.lower.serialization.ir.JvmIrDeserializer
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.psi2ir.Psi2IrTranslator
import org.jetbrains.kotlin.psi2ir.PsiSourceManager

class JvmIrCodegenFactory(private val phaseConfig: PhaseConfig) : CodegenFactory {

    /**///TODO
    val logger = object : LoggingContext {
        override var inVerbosePhase = false
        override fun log(message: () -> String) {
            println(message())
        }
    }

    override fun generateModule(state: GenerationState, files: Collection<KtFile>, errorHandler: CompilationErrorHandler) {
        val psi2ir = Psi2IrTranslator(state.languageVersionSettings)
        val psi2irContext = psi2ir.createGeneratorContext(state.module, state.bindingContext, extensions = JvmGeneratorExtensions)
        val deserializer =
            JvmIrDeserializer(state.module, logger, psi2irContext.irBuiltIns, psi2irContext.symbolTable, state.languageVersionSettings)
        val irModuleFragment = psi2ir.generateModuleFragment(psi2irContext, files, deserializer)
        JvmBackendFacade.doGenerateFilesInternal(state, errorHandler, irModuleFragment, psi2irContext, phaseConfig, deserializer)
    }

    fun generateModuleInFrontendIRMode(
        state: GenerationState,
        irModuleFragment: IrModuleFragment,
        errorHandler: CompilationErrorHandler,
        symbolTable: SymbolTable,
        sourceManager: PsiSourceManager
    ) {
        val deserializer = JvmIrDeserializer(state.module, logger, irModuleFragment.irBuiltins, symbolTable, state.languageVersionSettings)
        JvmBackendFacade.doGenerateFilesInternal(
            state, errorHandler, irModuleFragment, symbolTable, sourceManager, phaseConfig, deserializer, firMode = true
        )
    }

    override fun createPackageCodegen(state: GenerationState, files: Collection<KtFile>, fqName: FqName): PackageCodegen {
        val impl = PackageCodegenImpl(state, files, fqName)

        return object : PackageCodegen {
            override fun generate(errorHandler: CompilationErrorHandler) {
                JvmBackendFacade.doGenerateFiles(files, state, errorHandler, phaseConfig)
            }

            override fun getPackageFragment(): PackageFragmentDescriptor {
                return impl.packageFragment
            }
        }
    }

    override fun createMultifileClassCodegen(state: GenerationState, files: Collection<KtFile>, fqName: FqName): MultifileClassCodegen {
        TODO()
    }
}
