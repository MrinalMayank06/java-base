import java.util.Scanner;

public class primechecker {
    public static boolean isprime(int num){
        if (num<=1){
            return false;
        }
        for (int i = 2; i<= Math.sqrt(num);i++){
            if (num % i == 0 ){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a positive integer to check if it's prime: ");
        int Num = scanner.nextInt();


        boolean result = isprime(Num);

        if (result) {
            System.out.println(Num + " is a prime number.");
        } else {
            System.out.println(Num + " is not a prime number.");
        }
    }
}
