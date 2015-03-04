

public class FindCharacter {

    public static void find_chr(String c, String t) {
    	int index = -1;
    	
    	for (int i = 0; i < t.length(); i++) {
    		if (t.charAt(i) == c.charAt(0)) {
    			index = i + 1;
    			break;
    		}
    	}
    	
    	System.out.println(index);
    }

	public static void main(String[] args) {
		find_chr("d", "abcdefabcdef");
		find_chr("z", "abcdefabcdef");
		find_chr("a", "abcdefabcdef");
		find_chr("f", "abcdefabcdef");
	}
}
