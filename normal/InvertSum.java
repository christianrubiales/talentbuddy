
public class InvertSum {

	public static void main(String[] args) {
		invert_sum(3, 5);
		invert_sum(7, 3);
	}

    public static void invert_sum(Integer a, Integer b) {
    	float c = a;
    	float d = b;
    	
    	System.out.println((int) (c/d + d/c));
    }
}
