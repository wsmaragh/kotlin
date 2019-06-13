/*
 * KOTLIN DIAGNOSTICS SPEC TEST (NEGATIVE)
 *
 * SPEC VERSION: 0.1-draft
 * PLACE: expressions, constant-literals, real-literals -> paragraph 2 -> sentence 1
 * NUMBER: 1
 * DESCRIPTION: Real literals without digits after an exponent mark.
 */

// TESTCASE NUMBER: 1
val value_1 = <!FLOAT_LITERAL_OUT_OF_RANGE!>0.0E<!>

// TESTCASE NUMBER: 2
val value_2 = <!FLOAT_LITERAL_OUT_OF_RANGE!>00.0e<!>

// TESTCASE NUMBER: 3
val value_3 = <!FLOAT_LITERAL_OUT_OF_RANGE!>000.00e-<!>

// TESTCASE NUMBER: 4
val value_4 = <!FLOAT_LITERAL_OUT_OF_RANGE!>0000.000E+<!>

// TESTCASE NUMBER: 5
val value_5 = <!FLOAT_LITERAL_OUT_OF_RANGE!>1.0e<!>

// TESTCASE NUMBER: 6
val value_6 = <!FLOAT_LITERAL_OUT_OF_RANGE!>22.00E+<!>

// TESTCASE NUMBER: 7
val value_7 = <!FLOAT_LITERAL_OUT_OF_RANGE!>333.000e<!>

// TESTCASE NUMBER: 8
val value_8 = <!FLOAT_LITERAL_OUT_OF_RANGE!>4444.0000E<!>

// TESTCASE NUMBER: 9
val value_9 = <!FLOAT_LITERAL_OUT_OF_RANGE!>55555.0e+<!>

// TESTCASE NUMBER: 10
val value_10 = <!FLOAT_LITERAL_OUT_OF_RANGE!>666666.00E-<!>

// TESTCASE NUMBER: 11
val value_11 = <!FLOAT_LITERAL_OUT_OF_RANGE!>7777777.000e<!>

// TESTCASE NUMBER: 12
val value_12 = <!FLOAT_LITERAL_OUT_OF_RANGE!>88888888.0000e<!>

// TESTCASE NUMBER: 13
val value_13 = <!FLOAT_LITERAL_OUT_OF_RANGE!>999999999.0E-<!>

// TESTCASE NUMBER: 14
val value_14 = <!FLOAT_LITERAL_OUT_OF_RANGE!>7.888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888e+<!>

// TESTCASE NUMBER: 15
val value_15 = <!FLOAT_LITERAL_OUT_OF_RANGE!>0.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000e<!>

// TESTCASE NUMBER: 16
val value_16 = <!FLOAT_LITERAL_OUT_OF_RANGE!>0.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000e-<!>

// TESTCASE NUMBER: 17
val value_17 = <!FLOAT_LITERAL_OUT_OF_RANGE!>0.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000e+<!>
