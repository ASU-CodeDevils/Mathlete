package org.codedevils.mathlete.functions;

import static org.junit.Assert.*;

import org.codedevils.mathlete.Expression;
import org.junit.Test;

public class UT_Maximum {

	@Test
	public void testEvaluation() {
		Expression exp = new Expression(Maximum.getOperator().getToken() + "(1.5,15)");
		assertEquals(Double.valueOf(15), Double.valueOf(exp.getSolution()));
	}

}
