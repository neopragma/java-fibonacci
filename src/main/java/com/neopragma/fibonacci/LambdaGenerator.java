package com.neopragma.fibonacci;

public class LambdaGenerator implements Generator {
	
	private int limit;
	private int[] result;
	
	public LambdaGenerator(int limit) {
		this.limit = limit;
	}

	/**
	 * Execute the algorithm to generate the Fibonacci series.
	 * The starting number is always zero.
	 * @param limit - maximum integer in the series.
	 */
	@Override
	public void run() {
		//TODO: Implement lamba-based solution to generate the Fibonacci series.

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
