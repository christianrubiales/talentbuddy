

public class SortedMerge {

    public static void merge_arrays(Integer[] a, Integer[] b) {
        int i = 0;
        int j = 0;
        
        StringBuilder u = new StringBuilder();
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                u.append(a[i]).append(" ");
                i++;
            } else {
                u.append(b[j]).append(" ");
                j++;
            }
        }
        
        while (i < a.length) {
            u.append(a[i++]).append(" ");
        }
        
        while (j < b.length) {
            u.append(b[j++]).append(" ");
        }
        System.out.println(u.toString().trim());
    }
	
	public static void main(String[] args) {
		Integer[] a = new Integer[] {2,3,7,8,8};
		Integer[] b = new Integer[] {7,8,13};
		merge_arrays(a, b);
	}
}
