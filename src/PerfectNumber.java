import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		int sum = 0;
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 1; i < n; ++i) {
			if (n % i == 0) {
				sum += i;
			}
		}

		if (n == sum) {
			System.out.println("Perfect number");
		} else {
			System.out.println("Not perfect Number");
		}

	}

}
