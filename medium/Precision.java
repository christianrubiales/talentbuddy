

public class Precision {


    public static void precision(Double p1, Double p2, Integer v) {
    	double a = p1 * v;
    	
    	int c = roundHalfUp(a);
    	int d = v - c;
    	
    	System.out.println(c + " " + d);
    }
    
    public static int roundHalfUp(double x) {
    	int whole = (int) x;
    	int rounded = (int) Math.round(x);
    	
    	if (x - whole == 0.5) {
    		rounded = whole + 1;
    	}
    	
    	return rounded;
    }
    
	public static void main(String[] args) {
		precision(0.95,0.05,100); // 95 5
		precision(0.5,0.5,1); // 1 0
		precision(0.95,0.05,1);  // 1 0
	}

}
