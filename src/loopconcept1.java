public class loopconcept1 {
    public class Loops {
        int i =0;int j=0;int k =0;
        class loop1 extends Loops{
            int l = i;
        }





    }

    public static void main(String[] args) {
Loops loops;
int n =11;
for (int i = 0; i<=n;i++ ){
    for (int j = 1; j <= n-2; j++){
        for (int k = 2; k<= n; k++){
            System.out.print(" 3 ");
        }
        System.out.print(" 2 ");
    }
    System.out.print(" 1 ");
}
        System.out.println(" ");
    }
}
