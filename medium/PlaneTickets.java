import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class PlaneTickets {

    public static void get_journey(Integer[] departure_ids, Integer[] destination_ids) {
    	List<Integer[]> list = new ArrayList<Integer[]>();
    	
    	for (int i = 0; i < departure_ids.length; i++) {
    		list.add(new Integer[]{departure_ids[i], destination_ids[i]});
    	}
    	
    	LinkedList<Integer> link = new LinkedList<Integer>();
    	link.add(list.get(0)[0]);
    	link.add(list.get(0)[1]);
    	list.remove(0);
    	
    	int i = 0;
		while (true) {
			if (list.get(i)[0].equals(link.getLast())) {
				link.add(list.get(i)[1]);
				list.remove(i);
				i = 0;
			} else if (list.get(i)[1].equals(link.getFirst())) {
				link.addFirst(list.get(i)[0]);
				list.remove(i);
				i = 0;
			} else {
				i++;
			}
			if (list.isEmpty()) {
				break;
			}
    	}
    	
    	for (Integer j : link) {
    		System.out.print(j + " ");
    	}
    	System.out.println();
    }
	
	public static void main(String[] args) {
		get_journey(new Integer[]{1, 4, 5}, new Integer[]{2, 1, 4});
	}

}
