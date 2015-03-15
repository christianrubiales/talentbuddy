import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;


/**
 * Uses LinkedList and PriorityQueue. O(NlogN)
 * Does not finish in less than 2 seconds for 500,000 elements.
 */
public class TweetsPerSecond {
	
    public static void tweets_per_second(Integer[] tps, Integer k) {
    	final int max = k;
    	
    	Comparator<Integer> comparator = new Comparator<Integer>() {
    		@Override
    		public int compare(Integer o1, Integer o2) {
    			return o2.compareTo(o1);
    		}
		};
    	
    	LinkedList<Integer> list = new LinkedList<Integer>();
    	PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k, comparator);
		Integer first = null;
    	for (Integer i : tps) {
    		if (list.size() == max) {
    			first = list.get(0);
    			list.remove(first);
    			queue.remove(first);
    		}
			list.add(i);
			queue.offer(i);
			System.out.println(queue.peek());
    	}
    }

	public static void main(String[] args) {
		tweets_per_second(new Integer[]{6, 9, 4, 7, 4, 1}, 3); // 6 9 9 9 7 7
	}

}
