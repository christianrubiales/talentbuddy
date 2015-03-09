import java.util.LinkedList;


/**
 * Use a linked list and mod.
 */
public class NthPermutation {

    public static void nth_perm(Integer[] v, Integer n) {
    	LinkedList<Integer> list = new LinkedList<Integer>();
    	
    	for (Integer i : v) {
    		list.add(i);
    	}
    	
    	for (int i = 0; i < n % list.size(); i++) {
    		list.addFirst(list.removeLast());
    	}
    	
    	for (int i = 0; i < list.size() - 1; i++) {
    		System.out.print(list.get(i) + " ");
    	}
    	System.out.println(list.getLast());
    }

	public static void main(String[] args) {
		nth_perm(new Integer[]{7, 1, 2}, 4);
	}

}
