package com.example.resources;

import com.example.services.CalculatorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.List;

@RestController
public class CalculatorResource {
    public static final String URL_PREFIX="/calculator";

	@RequestMapping(URL_PREFIX + "/random")
	/**
	 * Returns a string of integers and their computed result
	 * @param operand The operand to be used for computation
	 * @param num1 The first
	 *                number to be operated on
	 * @param num2 The second number to be operated on
	 * @return the string of integers and their computed result
	 */
	public String startApplyOp() {
		CalculatorService cs = new CalculatorService();
		 Random RAND = new Random();
		 int UPPER_BOUND = 25;
		 int num1 = RAND.nextInt(UPPER_BOUND);
		 int num2 = RAND.nextInt(UPPER_BOUND);
		 String[] operators = {"+","-","*","/"};
		 int opr = RAND.nextInt(operators.length);
		 String operand = operators[opr];
		 int ans = cs.applyOp(operand, num1, num2);
		return (num1 + operand + num2 + " = " + ans);
	}

	/**
	 * @return a list of random integers of size 10
	 */
	@RequestMapping(URL_PREFIX + "/randomlist")
	public List getRandList() {
		CalculatorService cs = new CalculatorService();
		return cs.randList();
	}

	/**
	 * @return a sorted list of ten random integers of size 10
	 */
	@RequestMapping(URL_PREFIX + "/randomSortedlist")
	public List getRandSortedList() {
		CalculatorService cs = new CalculatorService();
		return cs.sortRandList();
	}
}

