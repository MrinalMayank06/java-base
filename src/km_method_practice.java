import java.util.Scanner;

public class km_method_practice {
    public static void main(String[] args) {
        System.out.println("Smallest no. finder");
        Scanner sc = new Scanner(System.in);


        System.out.println("enter the no. one");
        int num1= sc.nextInt();

        System.out.println("enter the no. two");
        int num2= sc.nextInt();

        System.out.println("Enter the no. three");
        int num3 = sc.nextInt();


        int smallestNumber= findSmallestNumber(num3,num2,num1);
        System.out.println("the smallest no. is: "+ smallestNumber);
        sc.close();
    }
    public static int findSmallestNumber(int a, int b, int c ){
        int smallest = a;
        if (b < smallest){
            smallest= b;}
    if (c< smallest){
        smallest = c;
    }return smallest;

}}
