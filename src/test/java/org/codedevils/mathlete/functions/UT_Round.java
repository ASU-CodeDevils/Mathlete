package org.codedevils.mathlete.functions;

import static org.junit.Assert.*;

import org.codedevils.mathlete.Expression;
import org.junit.Test;

public class UT_Round {

	@Test
	public void testEvaluation() {
		Expression exp = new Expression(Round.getOperator().getToken() + "(1.5)");
		assertEquals(Double.valueOf(2), Double.valueOf(exp.getSolution()));
		exp = new Expression(Round.getOperator().getToken() + "(1.4999)");
		assertEquals(Double.valueOf(1), Double.valueOf(exp.getSolution()));
	}

}
