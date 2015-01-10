package com.neopragma.fibonacci;

public class Fibonacci {
	
	Generator generator;
	
	public Fibonacci(FibonacciMethod method, int passes) {
		switch (method) {
		    case ITERATIVE : generator = new IterativeGenerator(passes);
		                     break;
		    case RECURSIVE : generator = new RecursiveGenerator(passes);
		                     break;
		    default        : throw new RuntimeException("Driver passed invalid arguments to Fibonacci constructor");                 
		}
	}
	
	public void run() {
	}
	
	public int[] result() {
		return generator.result();
	}
		
}
