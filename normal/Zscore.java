
public class Zscore {

	public static void main(String[] args) {
		compute_zscore(new Integer[]{35, 45, 78, 35, 23, 66, 75, 57}); // -1 -1 1 -1 -2 0 1 0
	}

    public static void compute_zscore(Integer[] sample) {
    	double mean = compute_mean(sample);
    	double stddev = compute_stddev(sample, mean);
    	
    	for (int i = 0; i < sample.length - 1; i++) {
    		System.out.print((int) Math.floor((sample[i] - mean) / stddev) + " ");
    	}
		System.out.println((int) Math.floor((sample[sample.length - 1] - mean) / stddev));
    }
    
    public static double compute_stddev(Integer[] sample, double mean) {    	
    	double sum = 0;
        for (Integer s : sample) {
        	sum += (s - mean) * (s - mean);
        }
        
        return Math.sqrt(sum/sample.length);
    }
    
    public static double compute_mean(Integer[] sample) {
    	double sum = 0;
        
        for (Integer s : sample) {
            sum += s;
        }
        return sum / sample.length;
    }
}
