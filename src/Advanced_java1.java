import java.util.*;



    import java.util.*;

    public class Advanced_java1 {
        public static void main(String[] args) {
            System.out.println(" Linkedlist  ");

            LinkedList<Integer> list= new LinkedList<>();
            LinkedList<Integer>list2 = new LinkedList<>();
            list2.add(15);
            list2.add(16);
            list2.add(17);
            list2.add(18);
            list2.add(19);
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(6);
list.addLast(65);
            list.add(0,7);
            list.add(0,1);

            list.addAll(5,list2);
            System.out.println(list.contains(19));
            System.out.println(list.indexOf(0));

            for (int i =0; i< list.size(); i++){
                System.out.print(list.get(i));
                System.out.print(" , ");

            }

        }
    }

