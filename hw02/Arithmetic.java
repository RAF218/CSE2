/////////////////////////////
//Ralph Fernandez
//hw02
//September 5, 2014
//CSE 002

public class Arithmetic{
    
    public static void main(String [ ] args) {
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //('$' is part of the variable name)
        double sockCost$=2.58;
        
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
        
        double totalSocksCost$ ; // total cost of socks
        double totalDrinkingGlasses$ ; // total cost of drinking glasses
        double totalBoxesOfEnvelopes$ ; // total cost of boxes of envelopes
        
        double taxSocks$ ; // tax on socks
        double taxDrinkingGlasses$ ; // tax on drinking glasses
        double taxBoxesOfEnvelopes$ ; // tax on envelopes
        
        totalSocksCost$=nSocks*sockCost$;
        totalDrinkingGlasses$=nGlasses*glassCost$;
        totalBoxesOfEnvelopes$=nEnvelopes*envelopeCost$;
        
        taxSocks$=totalSocksCost$*taxPercent;
        
        taxDrinkingGlasses$=totalDrinkingGlasses$*taxPercent;
        taxBoxesOfEnvelopes$=totalBoxesOfEnvelopes$*taxPercent;
        
        
        //Total cost of each item
        System.out.println(" The Total cost of the socks is " + totalSocksCost$+ " dollars" );
        System.out.println (" The Total cost of the drinking glasses is " + totalDrinkingGlasses$+ " dollars" );
        System.out.println (" The Total cost of the boxes of envelopers is " + totalBoxesOfEnvelopes$+ " dollars"  );
        
        //Sales tax on each item
        System.out.println (" The sales tax on the socks is " +(int) (taxSocks$*100)/100.0+ " dollars" );
        System.out.println (" The sales tax on the drinking glasses is  " +(int) (taxDrinkingGlasses$*100)/100.0+ " dollars"  );
        System.out.println (" The sales tax on the boxes of envelopes is " +(int) (taxBoxesOfEnvelopes$*100)/100.0+ " dollars" );
        
        //Total cost of purchases 
        System.out.println (" The total cost of purchases is " +(totalSocksCost$+totalBoxesOfEnvelopes$+totalDrinkingGlasses$)+ " dollars" );
        
        //Total sales tax
        System.out.println (" The total sales tax is " + (int) ((taxSocks$+taxDrinkingGlasses$+taxBoxesOfEnvelopes$)*100)/100.0+ " dollars" );
        
        //Total cost of the purchases including sales tax
        System.out.println (" The total cost of the purchases including sales tax is " + (int) ((totalSocksCost$+totalBoxesOfEnvelopes$+totalDrinkingGlasses$+taxSocks$+taxBoxesOfEnvelopes$+taxDrinkingGlasses$)*100)/100.0 + " dollars" );
        
    }
}


    
