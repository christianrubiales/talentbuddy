
/**
 * For 100.0011, decimal will be:
 * (1 * 2^2) + (0 * 2^1) + (0 * 2^0) 
 * + (0 * 0/2^1) + (0 * 0/2^2) + (1 * 0/2^3) + (1 * 0/2^4)
 */
public class BinaryFloat {

    public static void print_float(String s) {
        double num = 0.0d;
        
        // find the decimal point index
        int decimalPoint = -1;
        for (int i = 0 ; i < s.length(); i++) {
            if ('.' == s.charAt(i)) {
            	decimalPoint = i;
                break;    
            }
        }
        
        int index = 0;
        // build the whole number
        decimalPoint = decimalPoint == -1 ? s.length() : decimalPoint;
        while (index < decimalPoint) {
            num += (s.charAt(index) == '1' 
                    ? Math.pow(2, decimalPoint - index - 1) : 0);
            index++;
        }
        
        // build the fractional part
        index = decimalPoint == -1 ? s.length() : decimalPoint + 1;
        while (index < s.length()) {
            num += (s.charAt(index) == '1' 
                    ? 1 / Math.pow(2, index - decimalPoint) : 0);
            index++;
        }
        
        System.out.println(num);
    }
    
	public static void main(String[] args) {
		print_float("100.0011"); // 4.1875
		print_float("100"); // 4.0
		print_float("0.0011"); // 0.1875
	}

}
