package com.example.resources;

import com.example.services.CalculatorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class CalculatorResource {
    public static final String URL_PREFIX="/calculator";

	@RequestMapping(URL_PREFIX + "/random")
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
}

