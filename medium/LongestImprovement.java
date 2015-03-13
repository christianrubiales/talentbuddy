
/**
 * Use modified Boyer-Moore O(n).
 * Sliding Window is O(n^3).
 */
public class LongestImprovement {

    public static void longest_improvement(Integer[] grades) {
    	int c = 0;
    	int m = 0;
    	for (int i = 0; i < grades.length - 1; i++) {
    		if (grades[i] > grades[i+1]) {
    			c = 0;
    		} else {
    			c++;
    		}
			m = c > m ? c : m;
    	}
    	System.out.println(m+1);
    }
	
    public static void longest_improvement_Sliding_Window(Integer[] grades) {
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
		longest_improvement(new Integer[]{2,3,1,2,3,2,1,0});//3
		longest_improvement(new Integer[]{9, 7, 8, 2, 5, 5, 8, 7});//4
		longest_improvement(new Integer[]{3,2,1});//1
		longest_improvement(new Integer[]{3,2,1,1});//2
	}

}
