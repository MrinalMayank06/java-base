import java.util.Scanner;

public class sum_ofDigits {
    public static int sumOfDigit(int num) {
        int sum = 0;
        while (num > 0) {

            int rem = num % 10;
            sum += rem;
            num /= 10;

        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println("Sum of Digit of no. ");
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();


        int result = sumOfDigit(num1);

        System.out.println(result);
        sc.close();
    }
}
