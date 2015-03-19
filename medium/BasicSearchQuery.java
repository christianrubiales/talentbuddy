
public class BasicSearchQuery {

    public static void search_query(String[] query, String[] pages) {
    	int count = 0;
    	
    	for (String page : pages) {
    		int i = 0;
    		boolean complete = true;
        	for (String q : query) {
        		i = page.indexOf(q, i);
        		if (i == -1) {
        			complete = false;
        			break;
        		}
        		i += q.length();
        	}
        	count += complete ? 1 : 0;
    	}
    	System.out.println(count);
    }
    
	public static void main(String[] args) {
		String[] query = new String[]{"the", "new", "store"};
		String[] pages = new String[]{"the new store is in san francisco", 
				"the boy enters a new and cool store", 
				"this boy enters a new store", 
				"The new store is in the city", 
				"the newstore is a brand", 
				"there is newton in the store" };
		search_query(query, pages);
	}

}
