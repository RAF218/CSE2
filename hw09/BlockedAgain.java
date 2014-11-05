/////////////////////////////////
//Ralph Fernandez
//hw09
//November 4, 2014
//CSE 002


import java.util.Scanner;

/** This class uses different methods to build a stacked number pyramid.
The first method is the main method. The second method prompts the user 
to enter a number between 1 and 9. The following two methods check if the
number entered was a Int and then checked if it was in the range. The next
three methods build the stacked pyarmid by calling upon two methods. One
creating the blocks and the other one placing the "_".*/

public class BlockedAgain { 

    public static void main(String[] s) { //METHOD 1: MAIN
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt();
        allBlocks(m);
    }
    
    
    public static int getInt() { //METHOD 2 : GetInt
        System.out.print("Enter a number between 1 and 9-"); //Prompts user
        
        int y = checkInt(); //calls checkInt
        return y;
    }
    
    public static int checkInt() { //METHOD 3 CheckInt
        Scanner input = new Scanner(System.in); //Scanner
        int userInput=0;
        while(!input.hasNextInt()) { //If the input IS NOT a Int
            System.out.println("You did not enter an int in [1,9]; try again");
            input.next(); //Repeats
            
            
        }
        userInput = input.nextInt();
        userInput = checkRange(userInput); //Calls checkRange
        return userInput;

    }
    public static int checkRange(int input) { //METHOD 4 checkRange
        if(input<1 || input>9){ //Checks range between 1 and 9
            System.out.println("Number entered is not within range");
            input = checkInt();
        }
        return input;
        
    }
    
    public static void allBlocks(int x) { //METHOD 5 allBlocks
        int i;
        for(i=1; i<=x; i++) { //For loop 
            block(i);
            line(i);
        }
    }
    
    public static void block( int baseLength) { //METHOD 6 block
        int numbersInRow = 1; //number in rows for for loops
        int x = 1; //number in rows for while loops
        int y = 1; //number in rows for do while loops

        {
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
            }
        }
    public static void line (int baseLength) { //METHOD 7 line
        int nindent;
        int nChar;
        int numbersInRow= (2*baseLength)-1;
        
        for (nindent = 9 - baseLength; nindent > 0; nindent--) { //Determines the number of indents 
                    System.out.print(" ");
                }
                for (nChar = 1; nChar <= numbersInRow; nChar++) { //Prints out "_"
                    System.out.print("-");
                }

                System.out.println();
                numbersInRow = numbersInRow + 2;
    }     
}

        
        
   
        
        


    
    