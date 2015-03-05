
/**
 * Compound growth (like interest): PV * (1 + r) ^ n
 */
public class Prediction {

    public static void compute_prediction(Integer n, Integer w) {
    	System.out.println((int) (n * Math.pow(1.07, w)));
    }
    
	public static void main(String[] args) {
		compute_prediction(10, 3); // 12
		compute_prediction(40, 1); // 42
	}

}
