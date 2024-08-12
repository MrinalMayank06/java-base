public class stringquest4 {
    //remove consecutive character
    public static  String removeConsecutivechars(String s ){
        if (s == null|| s.length() == 0){
            return s;
        }
        StringBuilder result = new StringBuilder();
        char prevchar = s.charAt(0);
        result.append(prevchar);
         for (int i = 1; i< s.length(); i++){
             char currentchar = s.charAt(i);
             if (currentchar != prevchar){
                 result.append(currentchar);
                 prevchar = currentchar;
             }
         }
         return result.toString();
    }

    public static void main(String[] args) {
        String test1 = "aaaaabbbbccccaaa";
        String test2 = "aaabbbcc";
        String test3 = "abc";
        String test4 = "aaaa";
        String test5 = "aabbcc";

        System.out.println(test1 + ": "+removeConsecutivechars(test1) );
        System.out.println(test2 + ": "+removeConsecutivechars(test2) );
        System.out.println(test3 + ": "+removeConsecutivechars(test3) );
        System.out.println(test4 + ": "+removeConsecutivechars(test4) );
        System.out.println(test5 + ": "+removeConsecutivechars(test5) );


    }


}
