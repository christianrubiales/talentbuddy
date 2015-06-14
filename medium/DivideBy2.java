
public class DivideBy2 {

    public static void divide_by_two(Integer n) {
    	System.out.println(n >> 1);
    }
    
	public static void main(String[] args) {
		divide_by_two(4);//2
		divide_by_two(7);//3
	}

}
