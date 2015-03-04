
public class StandardDeviation {

    public static void compute_stddev(Integer[] sample) {
    	int mean = compute_mean(sample);
    	
    	int sum = 0;
        for (Integer s : sample) {
        	sum += (s - mean) * (s - mean);
        }
        
        System.out.println((int) Math.sqrt(sum/sample.length));
    }
    
    public static int compute_mean(Integer[] sample) {
        int sum = 0;
        
        for (Integer s : sample) {
            sum += s;
        }
        return sum / sample.length;
    }

	public static void main(String[] args) {
		compute_stddev(new Integer[]{35, 45, 78, 35, 23, 66, 75, 57});
	}
}
