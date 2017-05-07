package org.codedevils.mathlete.generators;

import org.codedevils.mathlete.operations.Addition;
import org.codedevils.mathlete.operations.Division;
import org.codedevils.mathlete.operations.Modulus;
import org.codedevils.mathlete.operations.Multiplication;
import org.codedevils.mathlete.operations.Operation;
import org.codedevils.mathlete.operations.Power;
import org.codedevils.mathlete.operations.Subtraction;

/**
 * The types of operations that can be used in building a math expression.
 */
public enum OperationType {
	ADDITION {
		@Override
		public Operation getOperator() {
			return Addition.getOperator();
		}
	},
	SUBTRACTION {
		@Override
		public Operation getOperator() {
			return Subtraction.getOperator();
		}
	},
	MULTIPLICATION {
		@Override
		public Operation getOperator() {
			return Multiplication.getOperator();
		}
	},
	DIVISION {
		@Override
		public Operation getOperator() {
			return Division.getOperator();
		}
	},
	MODULUS {
		@Override
		public Operation getOperator() {
			return Modulus.getOperator();
		}
	},
	POWER {
		@Override
		public Operation getOperator() {
			return Power.getOperator();
		}
	};

	/**
	 * @return Returns the symbol to use in a math expression.
	 */
	public abstract Operation getOperator();
}
