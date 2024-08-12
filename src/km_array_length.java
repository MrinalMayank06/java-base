public class km_array_length {
    public static void main(String[] args) {
//
       int[] marks= {45,12,45,58,99,95};
//        System.out.println(marks[4]);
//        System.out.println(marks[3]);
//        System.out.println(marks[2]);
//        System.out.println(marks[1]);
//        System.out.println(marks[0]);
        // for loop
   //     for (int i=0; i<marks.length ;i++ ){
     //       System.out.println(marks[i]);
    //    }
    for (int i = marks.length -1; i >=0; i--){
           System.out.println(marks[i]);
       }
        System.out.println("for transversed the data type");
        for (int element: marks ){
            System.out.println(element);
        }
    }
}
