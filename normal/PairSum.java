import java.util.HashSet;
import java.util.Set;


/**
 * For each x, check for sum - x, before adding x to the set. Almost O(n) because of HashMap in Set.
 */
public class PairSum {

    public static void two_numbers_sum(Integer[] v, Integer sum) {
        char result = '0';
        Set<Integer> set = new HashSet<Integer>();
        
        for (Integer i : v) {
        	if (set.contains(sum - i)) {
        		result = '1';
        		break;
        	}
        	set.add(i);
        }
        
        System.out.println(result);
    }
    
	public static void main(String[] args) {
		two_numbers_sum(new Integer[]{2, 2, 20}, 4); // 1
		two_numbers_sum(new Integer[]{2, 2, 20}, 5); // 0
	}

}
