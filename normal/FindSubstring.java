
/**
 * Brute force
 */
public class FindSubstring {

    public static void find_substr(String s, String t) {
		for (int i = 0; i <= t.length() - s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (t.charAt(i + j) == s.charAt(j)) {
					if (j == s.length() - 1) {
                        System.out.println(i + 1);
						return;
					}
				} else {
					break;
				}
			}
		}
		System.out.println(-1);
		return;
    }
    
	public static void main(String[] args) {
		find_substr("cde", "abcdefabcdef");//3
		find_substr("abd", "abcdefabcdef");//-1
	}

}
