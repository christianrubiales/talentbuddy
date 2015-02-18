
/**
 * Bubble sort
 */
public class SortingStudents {

	public static void main(String[] args) {
		sort_students(new Integer[] {1, 9, 4, 5, 7});
	}
	
    public static void sort_students(Integer[] numbers) {
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i-1] > numbers[i]) {
                    // swap
                    Integer temp = numbers[i-1];
                    numbers[i-1] = numbers[i];
                    numbers[i] = temp;
                    changed = true;
                }
            }
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(numbers[numbers.length - 1]);
    }
}
