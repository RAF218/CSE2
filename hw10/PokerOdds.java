////////////////////////////////////////
//Ralph Fenandez
//CSE002
//hw10
//November 18, 2014

/** This program should, but will not due to logic errors, use two methods. 
 * The method showOneHand() should generate random poker hands, prompting 
 * the user if they would like another hand to be generated (it will repeat as 
 * long the user desires). The method simulateOdds() should randomly generate 
 * 10000 hands and count the number of times that a hand with a pair of a specific
 * rank occurs, along with the number of hands that do not have a pair.
 * */

import java.util.Random;
import java.util.Scanner;
public class PokerOdds {

    public static void showHands() {
        int n=0;
        int[] deckOfCards = new int[52]; //Array deck of cards 
        int[] hand = { //Array setting hand equal to -1
            -1, -1, -1, -1, -1
        };
        int[] myDeck = new int[5]; //My hand, room for 5 cards

        for (int i = 0; i < 52; i++) { //Assigns value between 0-51
            deckOfCards[i] = i;
        }

        for (int i = 0; i < 5; i++) { //This for loop generates a random number between 1-52 and will assign a card that number
            int randomCard = (int) Math.random() * 52;
            myDeck[i] = deckOfCards[randomCard];
            n=myDeck[i];
           
        }
        
        for (int i=0; i<51; i++){ //This for loop attempts to relpace the card chosen with a negative 1
                  deckOfCards[i]=deckOfCards[i+1];
              deckOfCards[(52-1)]=-1;
          }
        
        int suit= n/13; //How to determine suit of card
        int rank=n%13; //How to determine rank of card
        
        System.out.println("Clubs");  // check for Clubs
        for(int clubs=0; clubs<5; clubs++){ 
            suit = myDeck[clubs]/13;  
            rank = myDeck[clubs]%13;
            if(suit==0){  //If the card chosen where to equal 0 after n/13, then it would be a club
                if(myDeck[rank]==0){//Various if statements to determine the rank of the card
                    System.out.print("A");
                    break;
                }
                if(myDeck[rank]==1){
                    System.out.print("K");
                    break;
                }
                if(myDeck[rank]==2){
                    System.out.print("Q");
                    break;
                }
                if(myDeck[rank]==3){
                    System.out.print("J");
                    break;
                }
                else{
                    System.out.print(myDeck[rank]);
                }
                
                } 
                break;
            }
           
        
        
        System.out.println("Diamonds"); //Check for diamonds
        for(int diamonds=0; diamonds<5; diamonds++){
             suit = myDeck[diamonds]/13;
            rank = myDeck[diamonds]%13;
            if(suit==1){ //If the card chosen where to equal 1 after n/13, then it would be a diamond
                if(myDeck[rank]==0){//Various if statements to determine the rank of the card
                    System.out.print("A");
                }
                if(myDeck[rank]==1){
                    System.out.print("K");
                }
                if(myDeck[rank]==2){
                    System.out.print("Q");
                }
                if(myDeck[rank]==3){
                    System.out.print("J");
                }
                else{
                    System.out.print(myDeck[rank]);
                }
                
                }
               break;
            }
            
        
        
        System.out.println("Hearts"); //check for hearts
        for(int hearts=0; hearts<5; hearts++){
             suit = myDeck[hearts]/13;
            rank = myDeck[hearts]%13;
            if(suit==2){ //If the card chosen where to equal 2 after n/13, then it would be a heart
                if(myDeck[rank]==0){ //Various if statements to determine the rank of the card
                    System.out.print("A");
                }
                if(myDeck[rank]==1){
                    System.out.print("K");
                }
                if(myDeck[rank]==2){
                    System.out.print("Q");
                }
                if(myDeck[rank]==3){
                    System.out.print("J");
                }
                else{
                    System.out.print(myDeck[rank]);
                }
                
                } 
               break;
            }
            
        
        
        System.out.println("Spades"); //check for spades
        for(int spades=0; spades<5; spades++){
             suit = myDeck[spades]/13;
            rank = myDeck[spades]%13;
            if(suit==3){ //If the card chosen where to equal 3 after n/13, then it would be a spade
                if(myDeck[rank]==0){//Various if statements to determine the rank of the card
                    System.out.print("A");
                }
                if(myDeck[rank]==1){
                    System.out.print("K");
                }
                if(myDeck[rank]==2){
                    System.out.print("Q");
                }
                if(myDeck[rank]==3){
                    System.out.print("J");
                }
                else{
                    System.out.print(myDeck[rank]);
                }
                
                }
              break;  
            }
    }
        

        public static void main(String[] arg) { //Main method provided by prof.
            showHands();
            simulateOdds();
        }
        public static void simulateOdds() {
           
            int[] deckOfCards = new int[52]; //New array for deck of cards
            int[] hand = {-1, -1, -1, -1, -1}; //hand is equal to -1
            String[] values = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"}; //String to list out card rank
            for (int i = 0; i < 10000; i++) { //Runs 10000 times
                for (int j = 0; j < 52; j++) { //Assigns value between 0-51
                    System.out.println(j);
                    deckOfCards[j] = j;
                }
        
            }
            for(int i=0; i<10; i++){
            System.out.println(values[i]); //Print out values
            }
        }
    }   
        