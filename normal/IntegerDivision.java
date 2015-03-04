
public class IntegerDivision {

    public static void int_div(Integer a, Integer b) {
    	int quotient = 0;
    	
    	while (a > b) {
    		a -= b;
    		quotient++;
    	}
    	
    	System.out.println(quotient);
    }

	public static void main(String[] args) {
		int_div(7, 3);
		int_div(Integer.MAX_VALUE, 1);
	}
}
