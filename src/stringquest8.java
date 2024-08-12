//import javax.security.auth.callback.CallbackHandler;
//import java.util.HashMap;
//import java.util.HashSet;
//@Res
//
//public class stringquest8 {
//    public static void main(String[] args) {
//        String input = "ABAAABC";
//        int length = lengthOfLongestSubstring(input);
//        System.out.println("Length of the longest substring without repeating character: "+length);
//    }
//    public static int lengthOfLongestSubstring(String s ){
//        HashSet<Character> set = new HashSet<>();
//        int maxlength =0;
//        int start =0;
//
//        for (int end = 0; end< s.length(); end++){
//            char currentchar = s.charAt(end);
//
//            while (set.contains(currentchar)){
//                set.remove(s.charAt(start));
//                start++;
//            }
//            set.add(currentchar);
//            maxlength =Math.max(maxlength, end - start+1);
//        }
//        return maxlength;
//
//    }
//}
