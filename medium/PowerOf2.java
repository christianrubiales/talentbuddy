
public class PowerOf2 {

    public static void power_of_2(Integer x) {
        double y = x;
        
        while (y > 2) {
            y /= 2;
        }
        
        if (y == 2) {
            System.out.println(1);
        } else {
            System.out.println(0);        
        }
    }
	
	public static void main(String[] args) {
		power_of_2(1);
		power_of_2(2);
		power_of_2(3);
		power_of_2(4);
		power_of_2(8);
	}
	
	

}
