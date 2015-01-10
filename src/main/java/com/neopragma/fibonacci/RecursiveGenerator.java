package com.neopragma.fibonacci;

public class RecursiveGenerator implements Generator {
	
	private int calls;
	private int result;
	
	public RecursiveGenerator(int calls) {
		this.calls = calls;
	}

	/**
	 * Execute the algorithm to generate the Fibonacci series.
	 * The starting number is always zero.
	 * @param passes - The number of recursive calls to process.
	 */
	@Override
	public void run() {
		//TODO: Implement a recursive algorithm to generate the Fibonacci series.
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
