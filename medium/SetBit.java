
public class SetBit {


    public static void set_bit(Integer a, Integer n) {
        int i = 1 << (n-1);
        
        System.out.println(a | i);
    }
	
	public static void main(String[] args) {
		set_bit(13, 2);
	}

}
