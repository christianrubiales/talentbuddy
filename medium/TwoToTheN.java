
public class TwoToTheN {

    public static void power_of_two(Integer n) {
    	System.out.println(2 << (n-1));
    }
    
	public static void main(String[] args) {
		power_of_two(3);//8
		power_of_two(5);//32
	}

}
