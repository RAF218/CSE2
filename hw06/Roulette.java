///////////////////////////////////////
//Ralph Fernandez
//September 14, 2014
//CSE002
//hw06

import java.util.Scanner;

/** This class tells you the outcome of profits, wins, and losses when you run a simulations of a game of Roulette.*/
public class Roulette{
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter a number between 1-38 which you will bet on 100 times and a simulation will run "); //Enter a number that will run the simulation 100,000
            Double nNumber = input.nextDouble();
        
        int Q; //variable for the number of losses
        int X;//variable for the number of wins
        int count1=0;
        int profit=0; //calculates the profit
        int won=0; //calculates the wins, but no profit 
        int loss=0;//calculate the loss
        
        while(count1<1000)  {  //while for for 1000 times
        Q=0; //set losses equal to 0
        X=0;//set wins equal to 0
        int count = 0;
        while (count<100){ // while loop for the $100
            if (nNumber==Math.floor(Math.random()*38)+1) { //math random
                X++; }
            else {
                Q++; }
            count++;
        } //Exits second while loop
            if (X>=3) {
                    profit++;
                    
            }
            if (X>=1 && X<2) {
                    won++;
            }
            if (X<=1 || Q>=100) {
                    loss++;
            }
            count1++;
        }//Exits first while loop
        System.out.println("You got a profit " +profit+ " times, won but with no profit " +won+ " times, and lost "+loss+ " times");
    }
}