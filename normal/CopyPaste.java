
public class CopyPaste {

    public static void copy_string(String s1, String s2, Integer p) {
    	for (int i = 0; i < p; i++) {
    		System.out.print(s1.charAt(i));
    	}
    	System.out.print(s2);
    	for (int i = p; i < s1.length(); i++) {
    		System.out.print(s1.charAt(i));
    	}
    }

	public static void main(String[] args) {
		copy_string("abcdefghi", "xyz", 3); //abcxyzdefghi
	}
}
