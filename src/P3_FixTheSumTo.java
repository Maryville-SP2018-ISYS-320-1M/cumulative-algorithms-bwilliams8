/*
	ISYS 320
	Name(s):Brian Williams
	Date: 
*/

/*
3. What problems did you identify in the sumTo method below?
The method returned no value when it was specified to return an int.
Initializing sum outside of the for-loop then returning it fixes the problem.

*/

public class P3_FixTheSumTo {

	public static void main(String[] args) {
		int totalSum = sumTo( 5 );
		System.out.println("The total sum is: " + totalSum );

	}
	
	public static int sumTo(int n) { 
	
        int sum = 0; 
	
	    for (int i = 1; i <= n; i++) {

	        sum += i;
	    }
	    
	    return sum;
	}

}
