package com.neopragma.fibonacci;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class FibonacciTest {
	
	public int[] expectedResult = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
	
	@Test
	public void itReturnsFibonacciSeriesTo34UsingIteration() {
		Fibonacci fibonacci = new Fibonacci(FibonacciMethod.ITERATIVE,10);
		assertArrayEquals(expectedResult, fibonacci.result());
	}
	
	@Test
	public void itReturnsFibonacciSeriesTo34UsingRecursion() {
		Fibonacci fibonacci = new Fibonacci(FibonacciMethod.RECURSIVE,10);
		assertArrayEquals(expectedResult, fibonacci.result());
	}
	
	@Test
	public void itReturnsFibonacciSeriesTo34UsingLambda() {
		Fibonacci fibonacci = new Fibonacci(FibonacciMethod.LAMBDA,10);
		assertArrayEquals(expectedResult, fibonacci.result());
	}

}
