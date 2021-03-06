package kr.itedu.ex10.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest {
	@Test
	void testA() {
		int n1 = 8;
		int n2 = 9;
		assertEquals(n1 + n2, Calc.sum(n1, n2));
		
		n1 = 10;
		n2 = 20;
		assertEquals(n1 + n2, Calc.sum(n1, n2));
		
		n1 = 10;
		n2 = 10;
		assertEquals(n1 + n2, Calc.sum(n1, n2));
		
		n1 = 9;
		n2 = 8;
		assertEquals(n1 + n2, Calc.sum(n1, n2));
	}	
}
