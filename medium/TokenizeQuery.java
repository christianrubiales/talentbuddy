import java.util.HashSet;
import java.util.Set;


public class TokenizeQuery {
	
    public static void tokenize_query(String query, String punctuation) {
        Set<Character> set = new HashSet<Character>();
        set.add(' ');
        
        for (int i = 0; i < punctuation.length(); i++) {
            set.add(punctuation.charAt(i));
        }
        
        for (int i = 0; i < query.length(); i++) {
            if (set.contains(query.charAt(i))) {
                System.out.println();
            } else {
                System.out.print(query.charAt(i));
            }
        }
    }

	public static void main(String[] args) {
		tokenize_query("car? dealers! bmw, audi", "?!");
	}

}
