public class km_variable_arguement {
//    static int sum(int a , int b){
//    return a+b;}
//    static int sum(int a , int b ,int c){
//    return a+b+c;}
//    static int sum(int a , int b ,int c, int d ){
//    return a+b+c+d;}
    static int sum(int ...arr){
        int result =0 ;
        for (int a: arr){
            result +=a ;

        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("wel to varargs ");
        System.out.println("the sum of two no. is =="+ sum(5,9));
        System.out.println("the sum of two no. is =="+ sum(5,9,8));
        System.out.println("the sum of two no. is =="+ sum(5,9,8,7));


    }
}
