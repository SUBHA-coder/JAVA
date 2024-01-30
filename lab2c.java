import java.io.*;
import java.util.Scanner;
 
class lab2c {
   
    // Function to find the biggest of three numbers
    static int biggestOfThree(int x, int y, int z)
    {
 
        return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
    }
 
    // Main driver function
    public static void main(String[] args)
    {
        int largest;
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
 
        largest = biggestOfThree(a, b, c);
 
        // Printing the largest number
        System.out.println("NAME : SUBHADIP DAS\n"+" ROLL NO : 2230210");
        System.out.println(largest
                           + " is the largest number.");
    }
}
