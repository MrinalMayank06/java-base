import java.util.Scanner;

public class km_for1Loop {
//    public static void main(String[] args) {
//        System.out.println("for loop intialisation");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        while (n<1|| n>10){
//            System.out.println(n+"is not between 1 and 10");
//            n = sc.nextInt();
//        }
//        System.out.println(n+"is in it");
//    }
//}
//public static void main(String[] args) {
//    System.out.println("For Loop");
//    for (int i =0 ; i<=5;i++){
//        for (int j = 1; j<=i; j++){
//            System.out.print("* ");
//        }
//        System.out.println();
//    }
public static void main(String[] args) {


//
//    for (int i = 1;i<=10;i++){
//        for (int j = 1;j<=10; j ++){
//            System.out.print(i*j+" ");
//        }
//        System.out.println();
//    }

//    System.out.println("print even from 1 to 100  ");
//     for (int i = 1; i<=100;i++) {
//         if (i % 2 == 0){
//             System.out.print(i +" ");
//         }

//     for (int i = 100;i>=1;i--){
//         if (i%2 ==0){
//             System.out.print(i+" ");
//         }
//
//     }
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the no: ");

//    int sum =0;
//    while (true){
//
//        sum += s.nextInt();
//        if (sum>100)
//            break;
//    }
//    System.out.println("done"+sum);
//    int n = s.nextInt();
//    int sum = 1;
//    for (int i=2;i<=n/2;i++)
//        if (n% i ==0)
//          //  System.out.print(i+" ");
//sum += i;
////    System.out.println(sum+n);
//    System.out.println(sum==1? "prime": "not prime");

//
//    System.out.println("Fibbonaci Sequence ");
//    System.out.println("Enter the  +ve Number: ");
//    int n = s.nextInt();
//    int result = 0 ;
//    int v1 =1;
//    int v2 = 1;
//    for (int i = 0; i<=(n-1);i++ ){
//        result = v1+v2;
//        v1 =v2;
//        v2 = result;
//
//    }
//    System.out.print("result: "+(result == 0 ? 1: result));

//    System.out.println("in String space ");
//    String st= "ab cd ";
//
//    for (int i = 0; i  <=st.length()-2;i++){
//        System.out.print(st.charAt(1)+" ");
//    }
//    System.out.println("Reverse the string  ");
//    String s1 = "Hello";
//    for (int i = s1.length()-1;i>=0;i--){
//        System.out.print(s1.charAt(i)+" ");
//    }

    int n = s.nextInt();

//for (int i = 1;i <=n;i++){
//    for (int j = 1;j<= i;j++){
//        System.out.print(j+i);
//    }
//    System.out.println();
//}
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n - i; j++)
            System.out.print(" ");

        for (int k = 1; k <= 1*i-1; k++)
            System.out.print("*");

        System.out.println();
    }


}
}