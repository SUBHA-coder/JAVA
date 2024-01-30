import java.util.Scanner;

public class lab1b {
    public static void main (String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("name : subhadip das");
        System.out.println("roll : 2230210");
        int a = sc.nextInt();
        int b = sc.nextInt();
        double area  = a*b;
        double  perimeter = 2*(a+b);
        
        System.out.println(area);
        System.out.print(perimeter);

    }
    
}
