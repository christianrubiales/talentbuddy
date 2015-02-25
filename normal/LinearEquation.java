
/**
 * Solve x in a*x + b = 0
 */
public class LinearEquation {

	public static void main(String[] args) {
		solve_equation(7.0, -14.0);
		solve_equation(7.0, 0.0);
		solve_equation(0.0, 0.0);
		solve_equation(0.0, 7.0);
	}
	
    public static void solve_equation(Double a, Double b) {
    	System.out.println(a == 0.0 ? "INF" : -b/a);
    }
}
