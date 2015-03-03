
public class Bottle {

    public static void compute_time(Double cap, Double current_volume, Double in_flow, Double out_flow) {
        Double net = out_flow - in_flow;
        
        if (net == 0.0d) {
            System.out.println("LEVEL");
        } else {
            System.out.println((cap - current_volume) / net);
        }
    }
	
	public static void main(String[] args) {
		compute_time(5.0, 2.5, 1d, 1.5);
		compute_time(5.0, 2.5, 1d, 1d);
	}

}
