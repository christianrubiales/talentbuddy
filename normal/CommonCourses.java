import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class CommonCourses {

    public static void get_common_courses(Integer[] courses1, Integer[] courses2) {
        Set<Integer> set = new TreeSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        
        for (Integer i : courses2) {
            set2.add(i);
        }
        for (Integer i : courses1) {
            if (set2.contains(i)) {
                set.add(i);
            }
        }
        for (Integer i : set) {
            System.out.println(i);
        }
    }
    
	public static void main(String[] args) {
//		get_common_courses(new Integer[]{1, 2, 8, 4, 5, 8, 3}, new Integer[]{8, 2, 2, 7, 10});
		get_common_courses(new Integer[]{4, 2, 1}, new Integer[]{0, 4, 2, 1});
	}

}
