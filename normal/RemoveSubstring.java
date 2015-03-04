
public class RemoveSubstring {

    public static void remove_substring(String s, Integer p, Integer n) {
        for (int i = 0; i < p - 1; i++) {
            System.out.print(s.charAt(i));
        }
        for (int i = p + n - 1; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
    }

	public static void main(String[] args) {
		remove_substring("abcdefghi", 4, 3); // abcghi
	}
}
