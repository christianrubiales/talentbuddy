
public class CountSubstrings {
	
    public static void count_substr(String s, String t) {
    	int fromIndex = 0;
    	int c = 0;
    	
    	while (fromIndex > -1) {
    		fromIndex = t.indexOf(s, fromIndex);
    		if (fromIndex > -1) {
    			c++;
    			fromIndex += s.length();
    		}
    	}
    	System.out.println(c);
    }

	public static void main(String[] args) {
		count_substr("aa", "aaabaaaaa");
		count_substr("abc", "ababcdabc");
	}

}
