

/**
 * Just print them out
 */
public class RelativeSort {

    public static void relative_sort(Integer[] v) {
    	for (Integer i : v) {
    		if (i < 0) {
    			System.out.print(i + " ");
    		}
    	}
    	for (Integer i : v) {
    		if (i > -1) {
    			System.out.print(i + " ");
    		}
    	}
    	System.out.println();
    }
    
	public static void main(String[] args) {
		relative_sort(new Integer[]{-5,2,1,-2,3});
	}

}
