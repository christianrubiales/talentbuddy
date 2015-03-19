import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class TupleSum {

    public static void tuple_sum(Integer[] a, Integer s) {
    	Map<Integer, List<Integer[]>> map = new LinkedHashMap<Integer, List<Integer[]>>();
    	
    	for (int i = 0; i < a.length; i++) {
        	for (int j = 0; j < a.length; j++) {
        		if (i != j) {
        			List<Integer[]> list = map.get(a[i] + a[j]);
        			if (list == null) {
        				list = new ArrayList<Integer[]>();
            			map.put(a[i] + a[j], list);
        			}
        			list.add(new Integer[]{i, j});
        		}
        	}
    	}
    	
    	Integer[] b = new Integer[4];
    	for (Integer i : map.keySet()) {
    		if (map.containsKey(s-i)) {
    			for (Integer[] c : map.get(s-i)) {
	    			
	    			b[0] = map.get(i).get(0)[0];
	    			b[1] = map.get(i).get(0)[1];
	    			b[2] = c[0];
	    			b[3] = c[1];
	    			
	    			Set<Integer> set = new HashSet<Integer>();
	    			set.add(b[0]); set.add(b[1]); set.add(b[2]); set.add(b[3]);
	    			if (set.size() == 4) {
		    			Arrays.sort(b);
		    			
		    			for (int j = 0; j < 3; j++) {
		    				System.out.print(b[j] + " ");
		    			}
		    			System.out.println(b[3]);
		    			return;
	    			}
    			}
    		}
    	}
    }
    
	public static void main(String[] args) {
		tuple_sum(new Integer[]{3,2,1,4,5,7,6,9,7,8}, 30);
	}

}
