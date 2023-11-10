//David Rosales
//Lab #11
//CSC321

import java.util.Scanner;

public class drosales11
{
	public static void main(String[] args)
	{
		int userNum;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a number: ");
		userNum = userInput.nextInt();

		System.out.println(Math.pow(userNum,2) + " Early bird gets the worm");
	}
}
