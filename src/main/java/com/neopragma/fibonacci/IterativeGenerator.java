package com.neopragma.fibonacci;

public class IterativeGenerator implements Generator {
	
	private int iterations;
	private int[] result;
	
	public IterativeGenerator(int iterations) {
		this.iterations = iterations;
	}

	/**
	 * Execute the algorithm to generate the Fibonacci series.
	 * The starting number is always zero.
	 * @param passes - The number of iterations to process.
	 */
	@Override
	public void run() {
		//TODO: Implement an iterative algorithm to generate the Fibonacci series.

	}

	/**
	 * Returns the list of values produced by the algorithm.
	 * @return int array containing the generated values.
	 */
	@Override
	public int[] result() {
        return new int[]{0};
	}

}
