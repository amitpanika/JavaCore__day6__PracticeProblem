import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		System.out.println("Enter the term");
		Scanner scanner = new Scanner(System.in);
		int term = scanner.nextInt();

		for (int i = 0; i <= term; ++i) {
			System.out.println(a);
			int c = a + b;
			a = b;
			b = c;
		}

	}

}
