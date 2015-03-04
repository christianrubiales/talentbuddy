
public class Binary {

    public static void convert_to_binary(Integer n) {
    	StringBuilder u = new StringBuilder();
    	
    	while (n > 0) {
    		u.append(n % 2);
    		n >>= 1;
    	}
    	
    	System.out.println(u.reverse());
    }

	public static void main(String[] args) {
		convert_to_binary(156);
		for (int i = 0; i < 10; i++) {
			convert_to_binary(i);
			System.out.println(Integer.toBinaryString(i));
		}
	}
}
