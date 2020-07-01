package com.example.resources;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Random;

@RestController
public class CalculatorResource {

	public static final int UPPER_BOUND = 25;
	public static final Random RAND = new Random();

	//only make block comments
    //refactor this class - put in business logic to the service class
	@RequestMapping("/")
    /**
    *
    */
	public String index(String[] args) {
		//Random rand = new Random();
		int num1 = RAND.nextInt(UPPER_BOUND);
		int num2 = RAND.nextInt(UPPER_BOUND);
		String[] operators = {"+","-","*","/"};
		int opr = RAND.nextInt(operators.length);
		String operand = operators[opr];
		String equation = num1 + operand + num2;
		int ans = applyOp(operand, num1, num2);
		return equation + " = " + ans;
	}

	/**
	 * Returns the computed result of two integers
	 * @param operand The operand to be used for computation
	 * @param num1 The first
	 *                number to be operated on
	 * @param num2 The second number to be operated on
	 * @return the computed result
	 */
	public static int applyOp(String operand, int num1, int num2) {
		switch (operand) {
			case "+":
				return num1 + num2;
			case "-":
				return num1 - num2;
			case "*":
				return num1 * num2;
			case "/":
				if (num2 == 0)
				    throw new UnsupportedOperationException("Cannot divide by 0");
				return num1 / num2;
	    }
        return 0;
	}
}
