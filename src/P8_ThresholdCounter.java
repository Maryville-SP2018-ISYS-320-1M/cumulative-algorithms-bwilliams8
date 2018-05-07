import java.util.Scanner;

/*
	ISYS 320
	Name(s):Brian Williams
	Date: 
*/

public class P8_ThresholdCounter {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.println("How many numbers are in the series?");
		int numbers = console.nextInt();
		System.out.println("What is the threshold?");
		int threshold = console.nextInt();
		int result = 0;
		
		for(int i = 0; i < numbers; i++) {
			System.out.println("Enter number " + (i+1));
			int number = console.nextInt();
			
			if(number > threshold) {
				result++;
			}
		}
		
		System.out.println("The count of numbers above the threshold is " + result);
		console.close();

	}

}
