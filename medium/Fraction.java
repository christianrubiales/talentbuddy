
public class Fraction {

    public static void compute_fraction(String s) {
    	int c = 1;
    	float f1 = Float.parseFloat(s);
    	float f2 = f1;
    	
    	while (f2 - ((int) f2) > 1e-15) {
    		f2 += f1;
    		c++;
    	}
    	System.out.println(((int) (c*f1)) + "/" + c);
    }
    
	public static void main(String[] args) {
		compute_fraction("1.6");// 8/5
	}

}
