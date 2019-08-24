import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		// Get the input from the user
		int p = in.nextInt();
		int q = in.nextInt();
		// Compare two numbers
		if(p > q)
		{
		    System.out.print("num1 is the greatest number");
		}
		else
        {
		    System.out.print("num2 is the greatest number");
		}
	}
}