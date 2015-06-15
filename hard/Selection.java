import java.util.Arrays;


public class Selection {

    public static void select_numbers(Integer[] v, Integer k) {
        Arrays.sort(v);
        
        for (int i = 0; i < k; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
    
	public static void main(String[] args) {
		select_numbers(new Integer[]{9,1,3,7,2,2}, 3);// 1 2 2
		select_numbers(new Integer[]{1,2,8,7,3,3,1}, 2);// 1 1
	}

}
