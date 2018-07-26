
public class ExcerciseTwo {

	public static void main(String[] args) {
		
		// a int type set to 2
		int a = 2;
		// b int type set to 5
		int b = 5;
		
		// double type, this is used to store decimal values. In example, 3.14, 2.05,
		// 3.0, etc.
		double c = 2.0;
		
		// int values can have mathmatics applied to them by simplying applying the correct operation symbol.
		// * - Multiplication
		// / - Division
		// + - Addition
		// - - Subtraction
		// % - Module
		// Note :: Order of operation will be followed when a series of operations are applied to the variables.
		// Note :: For System.out.println, we must give a String value for it to print
		// 		   out, in order to print numbers, we use the '+' symbol to append it to the
		// 		   string. Please see examples below
		// Note :: If we use only ints in our computation the values will be rounded down to the nearest whole number
		System.out.println("a * b = " + a * b);
		System.out.println("a * b / (b - a) = " + a * b / (b - a));
		
		// Otherwise, if we use decimals. We are able to see the decimal values with our computation
		System.out.println("a * 1.75 = " + a * 1.75);
		
		// We can save this output value to another int variable or to the same variable used in our computations. This allows it to be reused in later in our code.
		// Applying it to a new variable will allow use to reuse the old variables we have instantiated incase they are needed to be used for anyother comparisons or computations.
		int outputValue = a * b / (b - a);
		int aTimesB = a * b;
		int aTimesTwoB = (a*(b*2));
		
		// We can than apply these operations for our Conditionals. (See Excercise 1 for examples of Conditionals).
		
		if ((a*b) >= (a*(b*2))) {
			System.out.println("a * b is greater than a*(b*2), -- Not possible. This block will not be hit.");
		} 
		// Will this be hit? Are these two variables the same as the one's given in the first if statement?
		else if (aTimesB >= aTimesTwoB) {
			System.out.println("variable aTimesB is greater than variable aTimesTwoB");
		} else {
			System.out.println("a * b is less than a * (b * 2)");
		}
		
		
		/**
		 * Assignment 2 :: Create a computation to compute the area of a Square given an
		 * int variable named width and a int variable named height. Once you have the
		 * area of the square, save the output value to an int variable named
		 * areaOfSquare and print this variable out saying "The Area of the Square is ::
		 * <givenAreaOfSquareVariable>" . Then use the area variable to see if it is a
		 * multiple of 6. If it is a multiple of 2, print out "This Area of the Square is
		 * divisible by 6." else "This Area of the Square is not divisible by 6." Hint ::
		 * Use the operation to give remainders. Estimated time :: 10 min
		 */

		/**
		 * Your code goes here. 
		 */
		
	}

}
