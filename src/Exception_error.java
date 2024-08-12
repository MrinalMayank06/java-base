//import java.util.Scanner;
//
//public class Exception_error {
//    public static void main(String[] args) {
//        System.out.println("Exception Handling");
//        int[] marks = new int[5];
//        marks[0] = 4;
//        marks[1] = 5;
//        marks[2] = 7;
//        marks[3] = 6;
//        marks[4] = 9;
//
//
//        System.out.println("Arrays in Row "+marks);
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the Array index");
//        int ind = sc.nextInt();
//
//        System.out.println("Enter the no. Which u want to divide with : ");
//        int number = sc.nextInt();
//
//
//        try{
//            System.out.println("the Value of the Array index "+ marks[ind]);
//            System.out.println("The value of the Array index / Number "+ marks[ind]/number);
//        }
//        catch (ArithmeticException e){
//            System.out.println("Some Exception are Occurred !");
//            System.out.println(e);
//        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Array Index out of bounds Exception ! its error");
//            System.out.println(e);
//        }
//        catch (Exception e){
//            System.out.println("Exception Error");
//        }
//    }
//}
