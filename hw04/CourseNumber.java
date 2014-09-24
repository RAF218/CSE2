///////////////////////////////
//Ralph Fernandez
//September 23, 2014
//hw04
//CSE002

import java.util.Scanner;

/**This class tells you when the course was offered and the year offered based on the course number*/
public class CourseNumber{
    public static void main(String [] args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        
        System.out.print("Enter a six digit number giving the course semester: ");
        double nCourse=myScanner.nextInt();
        
        if(nCourse<186510 || nCourse>201440){ //The range
            System.out.println("The number was outside the range [186510,201440]");
            return;
        }
        
        if(nCourse%100==10){
            System.out.println("The course was offered in the spring in the year " +(int)(nCourse/100)); //spring
        }
        else if(nCourse%100==20){
            System.out.println("The course was offered in the summer 1 in the year " +(int)(nCourse/100)); //summer 1
        }
        else if(nCourse%100==30){
            System.out.println("The course was offered in the summer 2 in the year " +(int)(nCourse/100)); //summer 2
        }
        else if(nCourse%100==40){
            System.out.println("The course was offered in the fall in the year " +(int)(nCourse/100)); //fall
        } 
        else
            System.out.println(+nCourse%100+ "is not a legitimate semester"); //not a legitimate semester
            
    }
}