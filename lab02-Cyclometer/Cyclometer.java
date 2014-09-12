//Ralph Fernandez
//September 03, 2014
//CSE002
//Lab 02
//Cyclometer Java Program 

public class Cyclometer{
    public static void main(String [ ] args) {
        int secsTrip1=480; // Seconds in Trip 1
        int secsTrip2=3220; // Seconds in Trip 2
        int countsTrip1=1561; // Counts in Trip 1
        int countsTrip2=9037; // Counts in Trip 2
        
        double wheelDiameter=27.0, // Wheel Diameter
        PI=3.14159, // PI
        feetPerMile=5280, // Feet in a mile
        inchesPerFoot=12, // Inches in a foot
        secondsPerMinute=60; // Seconds in a minute
        double distanceTrip1, distanceTrip2, totalDistance;
        
        System.out.println ("Trip 1 took " + (secsTrip1/secondsPerMinute)+ " minutes and had " + countsTrip1 + " counts.");
        System.out.println ("Trip 2 took " + (secsTrip2/secondsPerMinute)+ " minutes and had " + countsTrip2 + " counts.");
        
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //Above gives distance in inches
        //(for each count, a rotation of the wheel travels the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; //Gives ditance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        //Print out the output data.
        System.out.println ("Trip 1 was "+distanceTrip1+" miles");
        System.out.println ("Trip 2 was "+distanceTrip2+" miles");
        System.out.println ("The total distance was "+totalDistance+" miles");
        
    }
}