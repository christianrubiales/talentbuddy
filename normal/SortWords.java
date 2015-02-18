import java.util.*;

public class SortWords {

    public static void sort_words(String s) {
        s = s.replaceAll(",", " ");
        String[] array = s.split("\\s+");
        
        Arrays.sort(array);
        
        for (String string : array) {
            System.out.println(string);
        }
    }
}
