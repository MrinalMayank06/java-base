import java.util.Scanner;

public class odd_even {
public static void Odd_EvenFinder(double no) {
    if (no % 2 == 0) {
        System.out.println("it is Even no: " + no);
    } else {
        System.out.println("it is odd no: " );
    }

}

    public static void main(String[] args) {
        System.out.println("odd Even Finder ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. = ");
        int No = sc.nextInt();

        Odd_EvenFinder(No);
        sc.close();


    }
}
