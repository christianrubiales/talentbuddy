
public class UnsetBit {

    public static void unset_bit(Integer a, Integer n) {
    	int i = ~(1 << (n-1));
    	
    	System.out.println(a & i);
    }

	public static void main(String[] args) {
		unset_bit(7, 1);
	}

}
