import java.util.Scanner;

public class ProjectFour {
	public static void main(String args[]){
		Scanner candy = new Scanner(System.in);
		double numberOne, numberTwo, numberThree;
		System.out.println("I shall do the math! So, tell me the first number!");
		numberOne = candy.nextDouble();
		System.out.println("Good, good! Now, tell me the second number you'll be using!");
		numberTwo = candy.nextDouble();
		numberThree = numberOne + numberTwo;
		System.out.println(numberThree);
		System.out.println("You chose a nice pair of numbers! Lemme know when you need to do some more adding!");
	}
}
