
public class PrimeNumbers {

    public static void get_prime_numbers(Integer n) {
    	// all are false initially
    	boolean[] primes = new boolean[n];
    	
    	// initialize all odd numbers to true
    	// all even numbers are not prime
    	for (int i = 3; i < primes.length; i += 2) {
    		primes[i] = true;
    	}
    	primes[1] = false;
    	primes[2] = true;
    	
    	for (int i = 3; i < n; i++) {
        	for (int j = i + i; j < n; j += i) {
        		if (j % i == 0) {
        			primes[j] = false;
        		}
        	}
    	}

    	StringBuilder u = new StringBuilder();
    	for (int i = 1; i < primes.length; i++) {
    		if (primes[i] == true) {
    			u.append(i + " ");
    		}
    	}
    	System.out.println(u.toString().trim());
    }
    
	public static void main(String[] args) {
		get_prime_numbers(23); // 2 3 5 7 11 13 17 19
		get_prime_numbers(100);
	}

}
