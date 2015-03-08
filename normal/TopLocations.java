import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TopLocations {

    public static void sort_locations(Integer a, Integer b, Integer c) {
    	List<Integer> list = new ArrayList<Integer>();
        if (a < 1000001) {
            list.add(a);
        }
        if (b < 1000001) {
            list.add(b);
        }
        if (c < 1000001) {
            list.add(c);
        }
        Collections.sort(list);
        
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println(list.get(list.size() - 1));
    }
    
	public static void main(String[] args) {
		sort_locations(1000, 25, 95); // 25 95 1000
		sort_locations(100, 125, 95); // 95 100 125
		sort_locations(100, 125, 95); // 95 100 125
		sort_locations(1, 2, 123456789); // 95 100 125
	}

}
