import java.util.*;
public class lav2e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("NAME:SUBHADIP DAS" + " ROLL : 2230210");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrongNumber(int num) {
        int originalNumber = num;
        int numberOfDigits = countDigits(num);
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        return originalNumber == sum;
    }

    public static int countDigits(int num) {
        int count = 0;

        while (num != 0) {
            num /= 10;
            count++;
        }

        return count;
    }
}
