
public class SelectSubstring {
	
    public static void select_substring(String s, Integer p1, Integer p2) {
        for (int i = p1 - 1; i < p2; i++) {
            System.out.print(s.charAt(i));
        }
    }

	public static void main(String[] args) {
		select_substring("abcdefghi", 2, 4);
	}
}
