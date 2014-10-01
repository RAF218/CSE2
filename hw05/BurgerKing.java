//////////////////////////////////
//Ralph Fernandez
//September 30, 2014
//CSE 002
//hw05

import java.util.Scanner;

/** This class tells you your order from Burger King.*/
public class BurgerKing{
    public static void main(String [] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter a letter to indicate a choice of \nBurger (B or b) \nSoda (S or s) \nFries (F or f)"); //First Question
        String nOrder = input.next();
        
        
        switch(nOrder) {
            case("B"): //Burger Case
            case("b"):
                System.out.print("Enter A or a for all the fixins \nC or c for cheese \nN or n for none of the above"); //Burger Question
                String nBurger = input.next();
                switch(nBurger) {
                    case("A"):
                    case("a"):
                        System.out.println("You ordered a burger with all the fixens"); //Order a burger with all the fixins
                        break;
                    case("C"):
                    case("c"):
                        System.out.print("You ordered a burger with cheese"); //Ordered a burger with cheese
                        break;
                    case("N"):
                    case("n"):
                        System.out.println("You ordered a plain burger"); //Ordered a plain burger
                        break;
                    default:
                        System.out.println("You did not pick one of the options"); //One of the options were not chosen
                                }
                break;
            case("S"): //Soda Case
            case("s"):
                System.out.print("Do you want Pepsi (p or P), \nCoke (c or C), \nSprite (s or S) or \nMountain Dew (M or m)"); //Soda Question
                String nSoda = input.next();
                switch(nSoda) {
                    case("P"):
                    case("p"):
                        System.out.println("You ordered a Pepsi"); //ordered a pepsi
                        break;
                    case("C"):
                    case("c"):
                        System.out.println("You ordered a Coke"); //ordered a coke
                        break;
                    case("s"):
                    case("S"):
                        System.out.println("You ordered a Sprite"); //ordered a sprite
                        break;
                    case("m"):
                    case("M"):
                        System.out.println("You ordered a Mountain Dew"); //ordered a Mountain Dew
                        break;                    
                    default:
                        System.out.println("You did not pick one of the options"); //One of the options were not selected
                            }
                break;
            case("F"): //Fries Case
            case("f"):
                System.out.print("Do you want a large or small order of fries (l,L,s, or S)"); //Fries Question
                    String nFries = input.next();
                    switch(nFries) {
                    case("L"):
                    case("l"):
                        System.out.println("You ordered larges fries"); //ordered large fries
                        break;
                    case("s"):
                    case("S"):
                        System.out.println("You order large fries"); //ordered small fries
                        break;
                    default:
                        System.out.println("You did pick one of the options"); //one of the options were not chosen
                    }
                break;
            default: System.out.println("You did not enter any of B, b, S, s, F, or f"); //Did not pick the correct letter
        } // End of Switch
    }
}