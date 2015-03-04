
/**
 * The arithmetic series minus the summation will return the missing number.
 */
public class MissingNumber {

    public static void find_missing_number(Integer[] v) {
        int sum = 0;
        
        for (Integer i : v) {
            sum += i;
        }
        
        int n = v.length + 1;
        System.out.println((n*(n+1)/2) - sum);
    }
    
	public static void main(String[] args) {
		find_missing_number(new Integer[]{5,4,1,2});
	}

}
