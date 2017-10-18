package Lab7;
import java.util.Scanner;

public class MinMaxAvg {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean run = true;
		
		while (run = true) {
			
			System.out.println("Enter three integers");
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			System.out.println("You entered " + a + ", " + b + ", " + c);
			System.out.println("The maximum is " + max(a, b, c));
			System.out.println("The minimum is " + min(a, b, c));
			System.out.println("The average is " + average(a, b, c));
			System.out.println("Do you want to enter more numbers? (y/n)");
			String input = s.next();
			if (input.equals("n")) {
				run = false;
				System.out.println("Thanks for playing!");
				break;	
			}
		}
	}

	public static int max(int x, int y, int z) {
		int f = Math.max(x, y);
		int g = Math.max(f, z);
		return g;
	}
	
	public static int min(int x, int y, int z) {
		int f = Math.min(x, y);
		int g = Math.min(f, z);
		return g;
	}
	
	public static int average(int x, int y, int z) {
		int f = (x + y + z) / 3;
		return f;
	}
	
	
}
