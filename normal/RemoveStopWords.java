import java.util.HashSet;
import java.util.Set;


public class RemoveStopWords {

    public static void remove_stopwords(String[] query, String[] stopwords) {
    	Set<String> set = new HashSet<String>(stopwords.length);
    	
    	for (String s :  stopwords) {
    		set.add(s);
    	}
        
        for (String s :  query) {
            if (!set.contains(s)) {
                System.out.println(s);
            }
        }
    }
    
	public static void main(String[] args) {
		remove_stopwords(new String[]{"the", "new", "store", "in", "SF"}, new String[]{"the", "in"});
	}

}
