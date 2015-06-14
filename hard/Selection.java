import java.util.ArrayDeque;
import java.util.Deque;


public class Selection {

    /**
     * Using heap, O(NlogN)
     */
    public static void select_numbers(Integer[] v, Integer k) {
    	Deque<Integer> heap = new ArrayDeque<Integer>();
    	
    	for (Integer i : v) {
    		if (i < k) {
    			heap.offer(i);
    		}
    	}
    	
    	while (!heap.isEmpty()) {
    		System.out.print(heap.poll());
    		if (!heap.isEmpty()) {
    			System.out.print(" ");
    		}
    	}
    	System.out.println();
    }
    
	public static void main(String[] args) {
		select_numbers(new Integer[]{9,1,3,7,2,2}, 3);// 1 2 2
		select_numbers(new Integer[]{1,2,8,7,3,3,1}, 2);// 1 1
	}

}
