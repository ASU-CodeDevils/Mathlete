package org.codedevils.mathlete.functions;

import static org.junit.Assert.*;

import org.codedevils.mathlete.Expression;
import org.junit.Test;

public class UT_Ceiling {

	@Test
	public void testEvaluation() {
		Expression exp = new Expression(Ceiling.getOperator().getToken() + "(1.5)");
		assertEquals(Double.valueOf(2), Double.valueOf(exp.getSolution()));
	}

}
