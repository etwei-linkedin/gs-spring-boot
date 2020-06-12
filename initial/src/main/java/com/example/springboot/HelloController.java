package com.example.springboot;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Random;

@RestController
public class HelloController {

	@RequestMapping("/")
	//create algorithm under controller to send the calculated value to the server
	public String index(String[] args) {
		Random rand = new Random();
		int upperbound = 25;
		int num1 = rand.nextInt(upperbound);
		int num2 = rand.nextInt(upperbound);
		String[] randOpr = {"+","-","*","/"};
		int opr = rand.nextInt(randOpr.length);
		String operand = randOpr[opr];
		String equation = num1 + operand + num2;
		int ans = applyOp(operand, num1, num2);
		return equation + " = " + ans;
	}
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
