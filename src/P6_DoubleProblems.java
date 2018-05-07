/*
	ISYS 320
	Name(s):Brian Williams
	Date: 
*/

//Java does not round doubles correctly. Without using absolute values, the solution to this particular problem would be to make the condition "Greater than or equal to".

public class P6_DoubleProblems {

	public static void main(String[] args) {
		double gpa = 3.2;
		if( gpa * 3 >= 9.6 ) {
			System.out.println( "You earned enough credts");
		}
	}

}
