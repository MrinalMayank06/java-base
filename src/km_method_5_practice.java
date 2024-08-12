import java.util.Scanner;
public class km_method_5_practice {
    public static void main(String[] args) {
        System.out.println("find the smallest no. ");
    Scanner sc = new Scanner(System.in);

        System.out.println("Input the first no: ");
        int num1= sc.nextInt();
        System.out.println("Input the second no: ");
        int num2= sc.nextInt();
        System.out.println("Input the third no: ");
        int num3 = sc.nextInt();

        int smallestNo = findTheSmallestNo(num2,num3,num1);
        System.out.println("the smallest no is :  "+ smallestNo);
        sc.close();
    }

    public static int findTheSmallestNo(int a ,int b , int c ){
        int smallest = a;
        if (b< smallest){
            smallest = b;

        }
        if (c< smallest){
            smallest = c;
        }
        return smallest;

    }
}
