////////////////////////////////
//Ralph Fernandez
//hw 11
//cse002
//November 5, 2014

//This code should sort a 3D Matrix, however, there is a runtime error that I could not solve.

public class MatrixSorter { //Provided Code 
    public static void main(String arg[]) {
        int mat3d[][][];
        mat3d = buildMat3d();
        show(mat3d);
        System.out.println("The smallest entry in the 3D matrix is " +
            findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]);
        show(mat3d);
    }
    
    public static int[][][] buildMat3d(){
        int[][][] array = new int [3][][]; //Initializing the matrix
        for (int s = 0; s < 3; s++){
            array[s]=new int[3+2*s][];
            for(int i = 0; i < array[s].length; i++){
                for(int j = 0; j < s + i; j++){
                    array[s][i][j] = (int)((Math.random()*99)+1); //Filling with Random Numbers
                }
            }
        }
        return array;
    }
    
    public static void show(int array[][][]){ //Show Method
        for(int s = 0; s < 3; s++){
            System.out.println("---------------------------Slab"+ (s+1)); //Adds a number to the end of slab
            for(int i = 0; i < 3+2*s; i++){
                for(int j = 0; j < s+i; j++){
                    System.out.print(array[s][i][j]+ " "); //Prints out array plus space
                }
            }
            System.out.println(); //Prints line
        }
    }
    
    public static int findMin(int array[][][]) { //Find Min Array 
        int min = array[0][0][0]; //Initiliaze Min and assign value
        for (int s = 0; s < 3; s++) {
            for (int i = 0; i < 3 + 2 * s; i++) {
                for (int j = 0; j < s + i; j++) {
                    if (array[s][i][j]<min){
                        min = array[s][i][j]; //New value for Min
                    }
                }
            }
        }
        return min; //Returns Min
    } 
    
    public static void sort(int[][] array){ //Method that attempts to sort the array
        for(int i = 0; i<array.length; i++){
            int[] small = array[i];
            int smallestIndex = i;
            for(int j = i+1; j<array.length; j++){
                    small=array[j];
                    smallestIndex=j;
                
            }
            array[i]= small;
            array[i]=array[smallestIndex];
        }
    }
    
    
}