public class ComputeAverage {

	public static void get_average(Integer a, Integer b) {
		while (b != 0) {
			int carry = a & b;
			a = a ^ b;
			b = carry << 1;
		}
		System.out.println(a >> 1);
	}

	public static void main(String[] args) {
		get_average(2, 3);// 2
		get_average(5, 1);// 3
	}

}
