package com.neopragma.fibonacci;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {
	
	@Test
	public void itReturnsFibonacciSeriesTo34UsingIteration() {
		Fibonacci fibonacci = new Fibonacci(FibonacciMethod.ITERATIVE,10);
		int[] expected = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
		assertArrayEquals(expected, fibonacci.result());
	}
	
	@Test
	public void itReturnsFibonacciSeriesTo34UsingRecursion() {
		Fibonacci fibonacci = new Fibonacci(FibonacciMethod.RECURSIVE,10);
		int[] expected = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
		assertArrayEquals(expected, fibonacci.result());
	}

}
