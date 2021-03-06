package algorithms.greedy;
/*
 * Find trailing zeros in a factorial
 */
public class TrailingZeros {

	public static void main(String[] args) {
		System.out.println(findTrailingZeros(5));
		System.out.println(findTrailingZeros(100));
	}
	
	static int findTrailingZeros(int  n)
	{
	    // Initialize result
	    int count = 0;
	 
	    // Keep dividing n by powers of 5 and update count
	    for (int i=5; n/i>=1; i *= 5)
	          count += n/i;
	 
	    return count;
	}

}
