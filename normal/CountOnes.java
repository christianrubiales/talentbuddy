
/**
 * Do a decimal to binary conversion, counting '1' remainders as we go.
 */
public class CountOnes {

    public static void count_one(Integer a) {
    	int c = 0;
    	while (a > 0) {
	    	if (a % 2 != 0) {
	    		c++;
	    	}
	    	a /= 2;
    	}
    	System.out.println(c);
    }
    
	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			count_one(i);
		}
	}

}
