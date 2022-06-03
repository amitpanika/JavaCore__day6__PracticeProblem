import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);

		for (int a = scanner.nextInt(); a > 0; a /= 10) {
			int r = a % 10;
			System.out.print(r);

		}
	}

}
