package talentbuddy;

public class MajorityNumber {
	
	public static void main(String[] args) {
		majority(new Integer[]{1,1,2,3,4,1,6,1,7,1,1 });
	}

    public static void majority(Integer[] v) {
    	Integer m = null;
    	int c = 0;
    	
    	for (int i = 0; i < v.length; i++) {
    		if (m == null) {
    			m = v[i];
    			c = 1;
    		} else {
    			if (v[i].equals(m)) {
    				c++;
    			} else {
        			if (c > 0) c--;
        			if (c == 0) {
        				m = null;
        			}
    			}
    		}
    	}

    	c = 0;
    	for (int i = 0; i < v.length; i++) {
    		if (v[i].equals(m)) {
    			c++;
    		}
    	}
    	
    	if (c > v.length / 2) {
    		System.out.println(m);
    	} else {
    		System.out.println("None");
    	}
    }
}
