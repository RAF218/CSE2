/////////////////////////////////////////
//Ralph Fernandez
//October 28, 2014
//CSE002
//hw08

import java.util.Scanner;

/** This class uses four different methods. The main method. The first method which determines
if the user entered the character 'Cc' and whether the user entered exactly 1 char. The second
method that requires the user to enter 'yYnN' and if the user does not enter that it will prompt
the user to ask to try again four more times before quitting. The third method asks the user to 
enter a digit 1-9.*/

public class HW8 {
	public static void main(String[] arg) { //MAIN METHOD


		char input;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 'C' or 'c' to continue, anything else to quit- "); //Prompts user to enter C or c
		input = getInput(scan, "Cc"); //CALL
		System.out.println("You entered '" + input + "'");
		
		System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
		input=getInput(scan,"yYnN",5); //give up after 5 attempts //Call
		System.out.println("You entered '" + input + "'");

		input=getInput(scan,"Choose a digit.","0123456789"); //CALL
		System.out.println("You entered '"+input+"'");
		
	}
	public static char getInput(Scanner input, String compare){ //METHOD 1; 'Cc' Program
		String i;
		while (true) { 
			i = input.next(); //i equal the char or digit the user entered
			if (i.length() == 1){ //if the length equals 1
				for (int j = 0; j< compare.length(); j++) { //FOR LOOP
					if(i.equals(""+compare.charAt(j))){ //if i equals the number of chars
						return compare.charAt(j);
					}
				}
			System.out.println("You did not enter a character from the list 'Cc'; try again");	
			}
			else {
			System.out.println("Enter exactly one character");
			}
		}
	}
	public static char getInput(Scanner input, String compare, int loops){ //METHOD 2; 'yYnN' Program
		String userinput;
		
		for(int i=0; i<loops; i++){ //FOR LOOP
			userinput = input.next(); //Userinput equals the char
			if (userinput.length() == 1){ //Determines the if the length is equal to one
				for (int j = 0; j< compare.length(); j++) { //FOR LOOP
					if(userinput.equals(""+compare.charAt(j))){ //If the user input equals the number of chars
						return compare.charAt(j);
					}
				}
			System.out.println("You did not enter a character from the list 'yYnN'; try again");	
			}
			else {
			System.out.println("Enter exactly one character");
			}
		}
		System.out.println("You failed after 5 tries");
		return(' ');
	}
	public static char getInput(Scanner input, String x, String compare ) { //METHOD 3; '0123456789' Program
		System.out.println(x);
		for(int i=0; i<compare.length(); i++){ //FOR LOOP
			System.out.print(" "+ "'"+compare.charAt(i)+"'"+","); //Printing 'chose a digit' and printing the numbers
		}
		String i;
		while (true) {
			i = input.next(); //i equal the char or digit the user entered
			if (i.length() == 1){ //if the length equals 1
				for (int j = 0; j< compare.length(); j++) {
					if(i.equals(""+compare.charAt(j))){
						return compare.charAt(j);
					}
				}
			System.out.println("You did not enter an acceptable character");	
			}
			else {
			System.out.println("Enter exactly one character");
			}
		}
	}
}