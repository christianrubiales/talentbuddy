
public class SuccessfulStudents {

    public static void count_successful_students(Integer[] grades, Integer min_grade) {
    	int count = 0;
    	for (Integer i : grades) {
    		if (i >= min_grade) {
    			count++;
    		}
    	}
    	
    	System.out.println(count);
    }
    
	public static void main(String[] args) {
		count_successful_students(new Integer[]{1, 2, 8, 4, 5, 8, 3}, 5); // 3
	}

}
