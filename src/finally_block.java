import java.util.Scanner;




class Exception {




}
    public class finally_block  {

    public static void main(String[] args) {
        System.out.println("Finally Block Use in java");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  No.1");
         int a = sc.nextInt();

        System.out.println("Enter the  No.2");
         int b = sc.nextInt();
         int c = (a/b);

         while (true)
    {
             try {

                 System.out.println("When a divides b then the outcome = "+c);
                 try {
                     System.out.println("In nested loops . "+ (a+c)/3);
                 }
                 catch (ArithmeticException e){
                     System.out.println(e);
                 }
                 b--;
                 throw new  ArithmeticException();


             }
             finally {
                 System.out.println("the Finally block is runninng sucessfully");

                 }
             }



         }

    }


