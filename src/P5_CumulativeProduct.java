import java.util.Scanner;

/*
	ISYS 320
	Name(s):Brian Williams
	Date: 
*/

public class P5_CumulativeProduct {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.print("How many numbers will you multiply?");
		int multiply = console.nextInt();
		int result = 1;
		
		for(int i = 0; i < multiply; i++) {
			System.out.println("Enter number " + (i + 1));
			int userInput = console.nextInt();
			result *= userInput;
		}
		System.out.println("The final product is " + result);
		console.close();
		
	}

}
