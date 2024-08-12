import java.util.*;
public class Advanced_java2 {
    public static void main(String[] args) {
        System.out.println("Array Dqueue");
        ArrayDeque<Character> ad = new ArrayDeque<>();
        ad.add('f');
        ad.addFirst('h');
        ad.addLast('t');
        ad.add('r');
        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());
        System.out.println(ad);
        for (int i = 0; i< ad.size();i++){
            System.out.print(ad.getLast());
            for (int j = 0; j< i ; j++ ){
                System.out.print(i);
            }
            System.out.print("  ");
        }
        ArrayDeque<Integer>ad1 = new ArrayDeque<>();
        ad1.add(1);
        ad1.addLast(3);
        ad1.add(6);
        ad1.add(4);
        ad1.addFirst(2);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());

        for (int l = 0; l<= ad1.size();l++){
            System.out.print(ad1.getLast());
            for (int k = 0; k<= l ; k++ ){
                System.out.print(k);
            }
            System.out.print(" ");
        }
    }
}
