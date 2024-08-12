import java.util.Scanner;

public class Find_SimpleInterest {
    static double si;

    public static double Si(double p, double r, double t){
        return si = ((p*r*t)/100);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal Amt= ");
        double p =sc.nextDouble();
        System.out.print("Enter the rate = ");
double r = sc.nextDouble();
        System.out.print("Enter the time = ");
        double t = sc.nextDouble();

        double SI = Si(p,r,t);
        System.out.println("SI= "+SI);
double totalamt = p+SI;
        System.out.println("End Balance = "+totalamt);


    }
}
