/*
 * KOTLIN DIAGNOSTICS SPEC TEST (POSITIVE)
 *
 * SPEC VERSION: 0.1-draft
 * PLACE: expressions, constant-literals, real-literals -> paragraph 3 -> sentence 1
 * NUMBER: 2
 * DESCRIPTION: Real literals with omitted a whole-number part and an exponent mark.
 */

// TESTCASE NUMBER: 1
val value_1 = .0e0

// TESTCASE NUMBER: 2
val value_2 = .0e-00

// TESTCASE NUMBER: 3
val value_3 = .0E000

// TESTCASE NUMBER: 4
val value_4 = .0E+0000

// TESTCASE NUMBER: 5
val value_5 = .0e+0

// TESTCASE NUMBER: 6
val value_6 = .00e00

// TESTCASE NUMBER: 7
val value_7 = .000E-000

// TESTCASE NUMBER: 8
val value_8 = .0E+1

// TESTCASE NUMBER: 9
val value_9 = .00e22

// TESTCASE NUMBER: 10
val value_10 = .000e-333

// TESTCASE NUMBER: 12
val value_12 = .0E-55555

// TESTCASE NUMBER: 15
val value_15 = .0000e-88888888

// TESTCASE NUMBER: 19
val value_19 = .345678e00000000001

// TESTCASE NUMBER: 20
val value_20 = <!FLOAT_LITERAL_CONFORMS_ZERO!>.4567E-100000000000<!>

// TESTCASE NUMBER: 21
val value_21 = .56e-0

// TESTCASE NUMBER: 22
val value_22 = .65e000000000000

// TESTCASE NUMBER: 23
val value_23 = .7654E+010

// TESTCASE NUMBER: 24
val value_24 = .876543E1

// TESTCASE NUMBER: 25
val value_25 = .98765432e-2

// TESTCASE NUMBER: 26
val value_26 = .0987654321E-3

// TESTCASE NUMBER: 27
val value_27 = .1111e4

// TESTCASE NUMBER: 28
val value_28 = .22222E-5

// TESTCASE NUMBER: 29
val value_29 = .33333e+6

// TESTCASE NUMBER: 30
val value_30 = .444444E7

// TESTCASE NUMBER: 31
val value_31 = .5555555e8

// TESTCASE NUMBER: 33
val value_33 = .777777777E-308

// TESTCASE NUMBER: 35
val value_35 = .99999999999e-309

// TESTCASE NUMBER: 37
val value_37 = .000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000e0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000

// TESTCASE NUMBER: 38
val value_38 = .000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000e-000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000

// TESTCASE NUMBER: 39
val value_39 = .000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000e+000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
