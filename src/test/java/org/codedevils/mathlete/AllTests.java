package org.codedevils.mathlete;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import org.codedevils.mathlete.functions.*;
import org.codedevils.mathlete.generators.UT_ExpressionGenerator;
import org.codedevils.mathlete.operations.*;
import org.codedevils.mathlete.parser.UT_ExpressionParser;
import org.codedevils.mathlete.parser.UT_Tokenizer;

@RunWith(Suite.class)
@SuiteClasses({ UT_AbsoluteValue.class, UT_Ceiling.class, UT_Floor.class, UT_Maximum.class, UT_Minimum.class,
		UT_Round.class, UT_Addition.class, UT_Subtraction.class, UT_Multiplication.class, UT_Division.class,
		UT_Modulus.class, UT_Power.class, UT_ExpressionGenerator.class, UT_ExpressionParser.class, UT_Tokenizer.class })
public class AllTests {

}
