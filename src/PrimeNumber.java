import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		 int count = 0;
	        System.out.println("Enter the Number");
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();

	        for(int i = 1; i <= n; ++i) {
	            if (n % i == 0) {
	                ++count;
	            }
	        }

	        if (count == 2) {
	            System.out.println("Prime number");
	        } else {
	            System.out.println("Not prime Number");
	        }

	    }
		

	}


