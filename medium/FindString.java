
public class FindString {

    public static void find_string(String str1, String str2) {
		for (int i = 0; i <= str1.length() - str2.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if (str1.charAt(i + j) == str2.charAt(j)) {
					if (j == str2.length() - 1) {
                        System.out.println(i);
						return;
					}
				} else {
					break;
				}
			}
		}
		System.out.println(-1);
    }
    
	public static void main(String[] args) {
		find_string("abcdef", "abc");//0
		find_string("abcdef", "cd");//2
		find_string("abcdef", "cb");//-1
	}

}
