
public class CaesarShift {

    public static void caesar_shift(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'Z') {
            	System.out.print('A');
            } else if (Character.isAlphabetic(s.charAt(i))) {
            	int j = s.charAt(i) + 1;
            	System.out.print((char) j);
            } else {
            	System.out.print(s.charAt(i));
            }
        }
    }
    
	public static void main(String[] args) {
		caesar_shift("CAT");
		caesar_shift("HELLO SECRET AGENTZ");
	}

}
