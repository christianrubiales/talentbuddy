import java.util.*;

public class SortNames {

    public static void sort_names(String[] names) {
        SortedMap<String, String> map = new TreeMap<String, String>();
        
        String[] array;
        for (String name : names) {
            array = name.split("\\ ");
            map.put(array[1], name);
        }
        
        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
