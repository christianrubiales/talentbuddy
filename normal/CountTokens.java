import java.util.HashSet;
import java.util.Set;


public class CountTokens {

    public static void count_tokens(String a, String t) {
    	Set<Character> set = new HashSet<Character>();
    	int c = 0;
    	
    	// add alphabet characters into a set
    	for (int i = 0; i < a.length(); i++) {
    		set.add(a.charAt(i));
    	}
    	
    	// change from non-member to member are counted as tokens
    	boolean prev = false;
    	boolean curr = false;
    	for (int i = 0; i < t.length(); i++) {
    		curr = set.contains(t.charAt(i));
    		
    		if (!prev && curr) {
    			c++;
    		}
    		prev = curr;
    	}
    	
    	System.out.println(c);
    }

	public static void main(String[] args) {
		count_tokens("anmo", "anatomy");
		count_tokens("elr", "hello there");
	}
}
