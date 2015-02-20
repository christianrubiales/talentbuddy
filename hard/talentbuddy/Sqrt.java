package talentbuddy;

public class Sqrt {

	public static void main(String[] args) {
		compute_sqrt(17);
	}
	
	public static void compute_sqrt(Integer n) {
		double t = n;
		double e = 1e-15;
		
		while (abs(t - n/t) > e * t) {
			t = (t + n/t)/2;
		}
		System.out.println((int) t);
    }
	

	public static double abs(double n) {
		if (n > 0) {
			return n;
		} else {
			return -1 * n;
		}
	}
}
