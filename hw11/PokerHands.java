//////////////////////////////
//Ralph Fernandez
//CSE002
//November 5, 2014
//hw11

//The program should program that prompts the user to enter a five card poker hand
//, prints out the hand, and then prints out the rank of the hand, e.g. “Straight.”
//Ran out of time, submitted what I had. 

import java.util.Scanner;

public class PokerHands{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 'Y' or 'y' to enter a(nother) hand: "); //Prompts User
        String response = input.next();
        while(response.equals("Y")||response.equals("y")){ //Check if the user entered y or Y
        String suit = input.next();
            
            int[] myHand = new int [5];
            System.out.println("Enter the suit: 'c', 'd', 'h', or 's' "); //Prompts user to enter suit
            for(int i = 0; i<5; i++){ 
                if(!suit.equals("c") && !suit.equals("d") && !suit.equals("h") && !suit.equals("s")){ //Checks suit
                    System.out.println("You did not enter a valid response");
                }
            }
            String rank = input.next();
            for(int i = 0; i<5; i++){
            System.out.println("Enter one of 'a', 'k', 'q', 'j', '10', ...'2' "); //Prompts user to enter rank
                //Checks the rank
                if(!rank.equals("a") && !rank.equals("k") && !rank.equals("q") && !rank.equals("j") && !rank.equals("10") && !rank.equals("9") && !rank.equals("8") && !rank.equals("7") && !rank.equals("6") && !rank.equals("5") && !rank.equals("4") && !rank.equals("3") && !rank.equals("2")){
                    System.out.println("You did not enter a valid response");
                }
            }
                int value = 0;
                switch (rank) { //Switch statement that acts as counter for each rank value
                        case "a":
                            value += 0;
                            break;
                        case "k":
                            value += 1;
                            break;
                        case "q":
                            value += 2;
                            break;
                        case "j":
                            value += 3;
                            break;
                        case "10":
                            value += 4;
                            break;
                        case "9":
                            value += 5;
                            break;
                        case "8":
                            value += 6;
                            break;
                        case "7":
                            value += 7;
                            break;
                        case "6":
                            value += 8;
                            break;
                        case "5":
                            value += 9;
                            break;
                        case "4":
                            value += 10;
                            break;
                        case "3":
                            value += 11;
                            break;
                        case "2":
                            value += 12;
                            break;
                        default:
                            break;
                    }
                 switch (suit) { //switch statment for suit
                        case "c":
                            value = 0;
                            break;
                        case "d":
                            value = 13;
                            break;
                        case "h":
                            value = 26;
                            break;
                        case "s":
                            value = 39;
                            break;
                    }
   //             myHand[] = value;
        }
    }
}