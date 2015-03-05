
/**
 * Iterate once, check if the number is the maximum divisible by 3, else if it is greater than other numbers.
 * O(n)
 */
public class PairProduct {

    public static void max_prod(Integer[] v) {
    	int maxDivisible = 0;
    	int maxOther = 0;
    	
    	for (Integer i : v) {
    		if (i % 3 == 0 && i > maxDivisible) {
    			maxDivisible = i;
    		} else if (i > maxOther) {
    			maxOther = i;
    		}
    	}
    	
    	System.out.println(maxDivisible * maxOther);
    }
    
	public static void main(String[] args) {
		max_prod(new Integer[]{6, 8, 8, 7, 2, 5}); // 48
		max_prod(new Integer[]{6, 9, 9, 7, 2, 5}); // 81
		max_prod(new Integer[]{8, 11, 10, 3, 9}); // 99
	}

}
