

public class CountWords {

	public static void main(String[] args) {
		count_words(" one, ,two three,4");
	}

    public static void count_words(String s) {
        String[] a = s.split("[\\,*|\\s*]+");
        int c = 0;
        for (String x : a) {
        	if (x.length() > 0) {
        		c++;
        	}
        }
        System.out.println(c);
    }
}
