
public class StudentProgress {

    public static void is_sorted(Integer[] grades) {
    	for (int i = 1; i < grades.length; i++) {
    		if (grades[i] < grades[i-1]) {
    			System.out.println(0);
    			return;
    		}
    	}
    	
    	System.out.println(1);
    }
    
	public static void main(String[] args) {
		is_sorted(new Integer[]{1, 3, 3, 7}); // 1
		is_sorted(new Integer[]{1, 3, 7, 3}); // 0
	}

}
