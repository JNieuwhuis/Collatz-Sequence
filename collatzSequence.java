package collatzSequence;
import java.util.Scanner;

public class collatzSequence {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		input.close();
			
	while (number !=1) {
		System.out.println(number); 
		if (number%2 == 0) {
			number = (number/2);
		} else {
			number = ((number*3)+1);
			}
		}
		System.out.println(number);
		}

}
 /* Things to look into:
* Work with OO
* Correct for negative entries
*/ 