

import java.util.*;

public class VowelCount {

	public static void main(String[] args) {
		count_vowels("Get some");
	}

    public static void count_vowels(String s) {
    	Set<Character> set = new HashSet<Character>();
    	set.add('a');set.add('e');set.add('i');set.add('o');set.add('u');
    	set.add('A');set.add('E');set.add('I');set.add('O');set.add('U');
    	
    	int c = 0;
    	for (int i = 0; i < s.length(); i++) {
    		if (set.contains(s.charAt(i))) {
    			c++;
    		}
    	}
    	
    	System.out.println(c);
    }
}
