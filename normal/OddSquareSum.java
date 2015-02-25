
public class OddSquareSum {

	public static void main(String[] args) {
		odd_square_sum(1, 5); // 35
	}

    public static void odd_square_sum(Integer x, Integer y) {
        int sum = 0;
        for (int i = x; i <= y; i++) {
            if (i % 2 != 0) {
                sum += (i*i);
            }
        }
        System.out.println(sum);
    }
}
