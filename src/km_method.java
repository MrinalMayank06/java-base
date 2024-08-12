import java.util.Scanner;
public class km_method {
//static int logic (int a , int b ) {
//        int c;
//        if (a > b) {
//                c = a + b;
//        } else {
//                c = a * b;
//        }
//        return c;
//
//
//}
//
//        public static void main(String[] args) {
//                System.out.println("methods");
//
//                Scanner sc = new Scanner(System.in);
//                System.out.println(" enter a no.");
//                int a1 = sc.nextInt();
//                System.out.println(" enter a no.");
//                int b1 = sc.nextInt();
//
//                int c1 ;
//                System.out.println(" result");
//                c1= logic(a1,b1);
//                System.out.println(c1);
//
//
//
//
//        }
//}
  int logic (int a , int b ) {
        int c;
        if (a > b) {
                c = a + b;
        } else {
                c = a * b;
        }
        return c;


}

        public static void main(String[] args) {
                System.out.println("methods");

                Scanner sc = new Scanner(System.in);
                System.out.println(" enter a no.");
                int a1 = sc.nextInt();
                System.out.println(" enter a no.");
                int b1 = sc.nextInt();

                int c1 ;
                System.out.println(" result");
                km_method obj = new km_method();
                c1=obj.logic(a1,b1);
                System.out.println(c1);




        }
}



