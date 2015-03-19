import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;


/**
 * Use TreeSet and reverse comparator to sort suffixes by length.
 */
public class QueryTokensStemming {

    public static void token_stemming(String[] tokens, String[] suffixes) {
    	sortBySize(suffixes);
    	for (String token : tokens) {
    		boolean hasSuffix = false;
        	for (String suffix : suffixes) {
	    		if (token.endsWith(suffix)) {
	    			System.out.println(token.substring(0, token.lastIndexOf(suffix)));
	    			hasSuffix = true;
	    			break;
	    		}
        	}
        	if (!hasSuffix) {
        		System.out.println(token);
        	}
    	}
    }
    
    public static void sortBySize(String[] suffixes) {
    	Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		};
    	SortedMap<Integer, List<String>> map = new TreeMap<Integer, List<String>>(comparator);
    	
    	for (String s : suffixes) {
    		List<String> list = map.get(s.length());
    		if (list == null) {
    			list = new ArrayList<String>();
    			map.put(s.length(), list);
    		}
    		list.add(s);
    	}

    	int c = 0;
    	for (Integer i : map.keySet()) {
    		List<String> list = map.get(i);
    		for (String s : list) {
        		suffixes[c] = s;
        		c++;
    		}
    	}
    }
    
	public static void main(String[] args) {
		token_stemming(new String[]{"friendly", "outgoing", "powerful", "in"}, new String[]{"ing", "ly", "ul", "ful"});
	}

}
