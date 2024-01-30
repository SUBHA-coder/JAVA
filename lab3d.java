 import java.util.Arrays;
import java.util.Scanner;
public class lab3d {
   
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
               

		
		int a, b, j, flag;
        int i;
		System.out.printf("Enter lower bound : ");
		a = sc.nextInt(); 

		System.out.printf("\nEnter upper bound : ");
		b = sc.nextInt(); 

		
		System.out.printf("\nPrime numbers between %d and %d are: ", a, b);

	
		for (i = a; i <= b; i++) {

	
			if (i == 1 || i == 0)
								
                continue;
                flag = 1;
                

			for (j = 2; j <= i / 2; ++j) {
				if (i % j == 0) {
					flag = 0;
					break;
				}
			}

			
			if (flag == 1)
				System.out.print(","+ i);
                 int[] returnedArray = i();
                   Arrays.sort(i);
        System.out.println("\nThe sorted array is: ");
		}
	}

    private static int[] i() {
        return null;
    }
  
}

    
