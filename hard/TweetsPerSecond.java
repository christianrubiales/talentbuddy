import java.util.LinkedList;


/**
 * LInkedList-based, removes the first element when max reached. 
 * O(nk), does not finish after 2 seconds for 500,000 elements.
 */
public class TweetsPerSecond {
	
    public static void tweets_per_second(Integer[] tps, Integer k) {
    	final int max = k;
    	
    	LinkedList<Integer> list = new LinkedList<Integer>();
    	for (Integer i : tps) {
    		if (list.size() == max) {
    			list.removeFirst();
    		}
			list.add(i);
			System.out.println(max(list));
    	}
    }
    
    public static Integer max(LinkedList<Integer> list) {
    	Integer m = null;
    	
    	for (Integer i : list) {
    		if (m == null || i > m) {
    			m = i;
    		}
    	}
    	
    	return m;
    }

	public static void main(String[] args) {
		tweets_per_second(new Integer[]{6, 9, 4, 7, 4, 1}, 3); // 6 9 9 9 7 7
	}

}
