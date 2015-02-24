
public class BounceRate {

	public static void main(String[] args) {
		compute_active_users(1000, 25);
		compute_active_users(835, 17);
	}

    public static void compute_active_users(Integer n, Integer b) {
        System.out.println((int) (n * (1 - ((float) b/100.0))));
    }
}
