
public class SwapValues {

    public static void swap_values(Integer a, Integer b) {
    	a = a ^ b;
    	b = a ^ b;
    	a = a ^ b;
    	
    	System.out.println(a + " " + b);
    }
    
	public static void main(String[] args) {
		swap_values(2, 3);
		swap_values(5, 1);
	}

}
