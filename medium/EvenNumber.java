
public class EvenNumber {


    public static void is_even(Integer n) {
    	System.out.println(n & 1);
    }
	
	public static void main(String[] args) {
		for (int i = -2; i < 10; i++) {
			is_even(i);
		}
	}

}
