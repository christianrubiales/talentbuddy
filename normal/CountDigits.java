
public class CountDigits {

    public static void count_digits(String s) {
    	int c = 0;
    	for (int i = 0; i < s.length(); i++) {
    		if  (Character.isDigit(s.charAt(i))) {
    			c++;
    		}
    	}
    	System.out.println(c);
    }

	public static void main(String[] args) {
		count_digits("abc123"); // 3
	}
}
