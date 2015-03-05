
/**
 * Improved O(n^2)
 */
public class PairProduct {

    public static void max_prod(Integer[] v) {
        int max = 0;
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = i+1; j < v.length; j++) {
                int t = v[i] * v[j];
                if (t % 3 == 0 && t > max) {
                    max = t;
                }
            }
        }
        System.out.println(max);
    }
    
	public static void main(String[] args) {
		max_prod(new Integer[]{6, 8, 8, 7, 2, 5});
	}

}
