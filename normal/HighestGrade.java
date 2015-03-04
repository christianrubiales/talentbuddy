
public class HighestGrade {

    public static void max_grade(Integer[] grades) {
        int highest = grades[0];
        
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > highest) {
                highest = grades[i];    
            }
        }
        System.out.println(highest);
    }
    
	public static void main(String[] args) {
		max_grade(new Integer[]{1, 2, 8, 4, 5, 8, 3}); // 8
	}

}
