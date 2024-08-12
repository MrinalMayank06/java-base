import  java.util.Scanner;

public class km_recursion
{
    static int factorial(int n ){
        if (n==0 || n==1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the no.");
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();

        System.out.println(" the vaule of factorial = "+ factorial(n));


    }
}
