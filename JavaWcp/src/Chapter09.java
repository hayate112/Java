
public class Chapter09 {
	public static void main(String[] args) {
		int number = 1;
		while (number < 5) {
			System.out.println(number * number);
			number++;
		}
		
		int array[] = { 1, 4, 14, 25 };
		for (int number2 = 0; number2 < array.length; number2++) {
			System.out.println(array[number2]);
		}
		
		for (int val : array) {
			if (val % 2 == 0) {
				continue;
			}
			System.out.println(val);
		}
	}
}