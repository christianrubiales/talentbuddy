import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Median {

    /**
     * O(nlogn) time, O(n) space.
     * Could be O(n) time with a merge function.
     */
    public static void get_median(Integer[] A, Integer[] B) {
    	List<Integer> list = new ArrayList<Integer>();
    	
    	for (Integer i : A) {
    		list.add(i);
    	}
    	for (Integer i : B) {
    		list.add(i);
    	}
    	Collections.sort(list);
    	
		int mid = list.size() / 2;
    	if (list.size() % 2 == 0) {
    		System.out.println((list.get(mid) + list.get(mid+1))/2);
    	} else {
    		System.out.println(list.get(mid));
    	}
    }
    
	public static void main(String[] args) {
		get_median(new Integer[]{2, 4, 5, 6, 8}, new Integer[]{3, 5, 8});//5
		get_median(new Integer[]{1, 4, 7}, new Integer[]{2, 4});//4
	}

}
