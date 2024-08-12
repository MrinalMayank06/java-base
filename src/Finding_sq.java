import java.util.Scanner;

public class Finding_sq {
    public static double findSq(double no){
        return no*no;
    }

    public static void main(String[] args) {
        System.out.println("Square Finder ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. =  ");
        double No = sc.nextDouble();


        double Sq = findSq(No);
        System.out.println("Square of  "+No+" is = "+Sq);
        sc.close();
    }
}
