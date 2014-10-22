/////////////////////////////////////////////
//Ralph Fernandez
//October 21, 2014
//CSE002
//hw07

import java.util.Scanner;

/** This class builds a pyramid out of numbers using for loops, while loops, and do while loops.*/

public class NumberStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 9-"); //Promts the user to enter a number between 1-9
        int rowCounter = input.nextInt(); //variable for the number the user entered
        int baseLength; //base length 
        int numbersInRow = 1; //number in rows for for loops
        int x = 1; //number in rows for while loops
        int y = 1; //number in rows for do while loops

        {
            System.out.println("Using for loops:"); //For loop code
            for (baseLength = 1; baseLength <= rowCounter; baseLength++) {
                int numberCounter; //Number counter 
                int nChar;//Indicates number of _
                int nLines; //Indicates number of lines
                int nindent; //Indicates number of indents


                for (numberCounter = 1; numberCounter <= baseLength; numberCounter++) { // Number counter
                    for (nindent = 9 - baseLength; nindent > 0; nindent--) { //determines indents
                        System.out.print(" ");
                    }
                    for (nLines = 0; nLines < baseLength * 2 - 1; nLines++) {//determines the number of characters on a line
                        System.out.print(baseLength);//Prints the number of bases

                    }
                    System.out.println();
                }


                for (nindent = 9 - baseLength; nindent > 0; nindent--) { //Determines the number of indents 
                    System.out.print(" ");
                }
                for (nChar = 1; nChar <= numbersInRow; nChar++) { //Prints out "_"
                    System.out.print("_");
                }

                System.out.println();
                numbersInRow = numbersInRow + 2;
            }
        }

        System.out.println("Using While Loops: "); //For while loop code
        int numberCounter;
        int nChar; //vaiable for the number of characters
        int nLines;//variable for the number of lines
        int nindent;//vaiable for the number of indents
        baseLength = 1;
        while (baseLength <= rowCounter) {

            numberCounter = 1;

            while (numberCounter <= baseLength) {
                numberCounter++;

                nindent = 9 - baseLength; //Determines indents

                while (nindent > 0) {
                    System.out.print(" "); //Prints out spaces
                    nindent--;

                }
                nLines = 0;

                while (nLines < baseLength * 2 - 1) { //Determines the number of char. in a line
                    System.out.print(baseLength);
                    nLines++;//Increases lines



                }
                System.out.println();
            }

            nindent = 9 - baseLength; //Determines the indents

            while (nindent > 0) {
                System.out.print(" ");
                nindent--; //Decreases the indents

            }
            nChar = 0;
            while (nChar <= y) {
                System.out.print("_");//Prints out "_"
                nChar++;
            }

            System.out.println();
            y = y + 2; //Determines the number of "_"

            baseLength++; //Determines the number of char in a line

        }

        System.out.println("Using Do-while loops:"); //For Do-While loops
        numberCounter = 0;
        nChar = 0; //variable for number of char
        nLines = 0;//variable for number of lines
        nindent = 0;//variable for the number of indents
        baseLength = 0;//variable to determine base length
        do {
            baseLength++; //Increases base length 

            numberCounter = 1;

            do {
                numberCounter++; //Increase number counter

                nindent = 9 - baseLength; //Determines indentation
                do {
                    nindent--; //Decrases indents
                    System.out.print(" ");
                }
                while (nindent > 0);

                nLines = 0;
                do {
                    System.out.print(baseLength); //Prints the number of characters 
                    nLines++; //Increases the number of lines
                } while (nLines < (baseLength * 2 - 1)); //Condition

                System.out.println();
            } while (numberCounter <= baseLength); //Condition

            nindent = 9 - baseLength; //Determines indentations

            do {
                nindent--; //Decreases indents
                System.out.print(" ");
            }
            while (nindent > 0); //Condition

            nChar = 1;
            do {
                nChar++; //Increases char/
                System.out.print("_");
            }
            while (nChar <= x); //Condition

            System.out.println();
            x = x + 2; //Determines the number of char on a line



        } while (baseLength < rowCounter); //Condition

    }
}
