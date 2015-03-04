

import java.util.Arrays;

/**
 * @see https://www.talentbuddy.co/challenge/5297c145c8a6c2dc91480bc9
 */
public class MergeSort {

    public static Integer[] merge_sort(Integer[] v) {
    	sort(v);
    	
    	for (int i = 0; i < v.length - 1; i++) {
    		System.out.print(v[i] + " ");
    	}
    	System.out.println(v[v.length - 1]);
    	
    	return v;
    }

    public static Integer[] sort(Integer[] v) {
    	if (v.length <= 1) {
    		return v;
    	}

		Integer[] a = new Integer[v.length / 2]; 
		Integer[] b = new Integer[v.length - a.length];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = v[i];
		}

		for (int i = 0; i < b.length; i++) {
			b[i] = v[i + a.length];
		}
		
		sort(a);
		sort(b);
		merge(a, b, v);

    	return v;
    }

    public static Integer[] merge(Integer[] a, Integer[] b, Integer[] c) {
        int i = 0;
        int j = 0;
        
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
            	c[i+j] = a[i++];
            } else {
            	c[i+j] = b[j++];
            }
        }
        
        while (i < a.length) {
        	c[i+j] = a[i++];
        }
        
        while (j < b.length) {
        	c[i+j] = b[j++];
        }
        
        return c;
    }

	public static void main(String[] args) {
		Integer[] a = new Integer[] {2,3,7,8,8};
		Integer[] b = new Integer[] {7,8,13};
		
//		System.out.println(Arrays.deepToString(merge(a, b)));
		
//		Integer[] c = new Integer[] {2,3,7,8,8,7,8,13};
//		Integer[] c = new Integer[] {4,3,5,6,2,5,2,1};
		Integer[] c = new Integer[] {2, 5, 10, 11, 3, 24, 15, 100, 65};
		System.out.println(Arrays.deepToString(merge_sort(c)));
	}
}
