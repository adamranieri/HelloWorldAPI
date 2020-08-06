package dev.ranieri.servicetests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dev.ranieri.services.Calculator;

class CalculatorTests {

	@Test
	void test() {
		Calculator c = new Calculator();
		int sum = c.add(2, 2);
		Assertions.assertEquals(4, sum);
	}

}
