
/**
 * Wrong: Get maximum number divisible by 3 and not divisible by 3, return the product.
 */
public class PairProduct {

    public static void max_prod(Integer[] v) {
    	int maxDivisible = 0;
    	int maxNotDivisible = 0;
    	
    	for (int i = 0; i < v.length; i++) {
    		if (v[i] % 3 == 0) {
    			if (v[i] > maxDivisible) {
    				maxDivisible = v[i];
    			}
    		} else {
    			if (v[i] > maxNotDivisible) {
    				maxNotDivisible = v[i];
    			}
    		}
    	}
    	
    	System.out.println(maxDivisible * maxNotDivisible);
    }
    
	public static void main(String[] args) {
		max_prod(new Integer[]{6, 8, 8, 7, 2, 5}); // 48
		max_prod(new Integer[]{6, 9, 9, 7, 2, 5}); // 81
	}

}
