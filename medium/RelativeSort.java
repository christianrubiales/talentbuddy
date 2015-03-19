import java.util.BitSet;


/**
 * Uses BitSet
 */
public class RelativeSort {

    public static void relative_sort(Integer[] v) {
    	BitSet b = new BitSet(v.length);
    	
    	for (int i = 0; i < v.length; i++) {
    		if (v[i] < 0) {
    			b.set(i);
    		}
    	}
    	for (int i = 0; i < v.length; i++) {
    		if (b.get(i)) {
    			System.out.print(v[i] + " ");
    		}
    	}
    	for (int i = 0; i < v.length; i++) {
    		if (!b.get(i)) {
    			System.out.print(v[i] + " ");
    		}
    	}
    	System.out.println();
    }
    
	public static void main(String[] args) {
		relative_sort(new Integer[]{-5,2,1,-2,3});
	}

}
