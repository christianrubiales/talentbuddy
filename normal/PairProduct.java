
/**
 * O(n^2)
 */
public class PairProduct {

    public static void max_prod(Integer[] v) {
        int max = 0;
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length; j++) {
                if (i != j) {
                    int t = v[i] * v[j];
                    if (t % 3 == 0 && t > max) {
                        max = t;
                    }
                }
            }
        }
        System.out.println(max);
    }
    
	public static void main(String[] args) {
		max_prod(new Integer[]{6, 8, 8, 7, 2, 5});
	}

}
