package kr.itedu.ex10.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest {
	@Test
	void testSum() {		
		assertEquals(5, Calc.sum(2, 3));
		assertEquals(9, Calc.sum(4, 5));
		assertEquals(13, Calc.sum(7, 6));		
	}
}
