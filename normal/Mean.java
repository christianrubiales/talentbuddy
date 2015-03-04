
public class Mean {

    public static void compute_mean(Integer[] sample) {
        int sum = 0;
        
        for (Integer s : sample) {
            sum += s;
        }
        System.out.println(sum / sample.length);
    }

	public static void main(String[] args) {
		compute_mean(new Integer[]{35, 45, 78, 35, 23, 66, 75, 57});
	}
}
