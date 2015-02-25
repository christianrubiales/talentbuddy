
public class Time {

	public static void main(String[] args) {
		convert_seconds(34565);
		convert_seconds(61);
		convert_seconds(Integer.MAX_VALUE);
	}
	
    public static void convert_seconds(Integer seconds) {
    	int h = 0;
    	int m = 0;
    	
    	h = seconds / 3600;
    	seconds = seconds - h * 3600;
    	
    	m = seconds / 60;
    	seconds = seconds - m * 60;
    	
    	System.out.println("" + (h < 10 ? "0" + h : h) + ":" + 
    			(m < 10 ? "0" + m : m) + ":" + 
    			(seconds < 10 ? "0" + seconds : seconds));
    }

}
