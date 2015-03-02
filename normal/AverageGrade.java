
public class AverageGrade {

    public static void compute_average_grade(Integer[] grades) {
        int sum = 0;
        
        for (Integer grade : grades) {
        	sum += grade;
        }
        
        System.out.println(sum / grades.length);
    }
    
	public static void main(String[] args) {
		compute_average_grade(new Integer[]{1, 2, 8, 4, 5, 8, 3});
	}

}
