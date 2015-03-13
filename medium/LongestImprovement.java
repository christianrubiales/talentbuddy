
/**
 * Sliding Window
 */
public class LongestImprovement {

    public static void longest_improvement(Integer[] grades) {
        for (int i = grades.length - 1; i > 0; i--) {//length of window
            for (int j = 0; j < grades.length - i; j++) {//number of slides
                if (isIncreasing(grades, j, j+i)) {
                    System.out.println(i+1);
                    return;
                }
            }
        }
    }
    
    public static boolean isIncreasing(Integer[] grades, int i, int j) {
        for (int x = i; x < j; x++) {
            if (grades[x] > grades[x+1]) {
                return false;
            }
        }
        
        return true;
    }
    
	public static void main(String[] args) {
		longest_improvement(new Integer[]{9, 7, 8, 2, 5, 5, 8, 7});
	}

}
