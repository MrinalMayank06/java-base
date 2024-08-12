import java.util.Stack;

public class stringquest3 {
    public static boolean isvalid(String s){
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()){
            if (c == '('||c == '{'||c == '[' ){
                stack.push(c);
            }
            else {
                if (stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if ((c == ')'&& top != '(')||
                        (c == '}'&& top != '{')||
                        (c == ']'&& top != '[')
                ){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
String test1 = "()";
String test2 = "()[]{}";
String test3 = "(]";
String test4 = "([)]";
String test5 = "{[]}";
        System.out.println(test1+" : "+isvalid(test1));
        System.out.println(test2+" : "+isvalid(test2));
        System.out.println(test3+" : "+isvalid(test3));
        System.out.println(test4+" : "+isvalid(test4));
        System.out.println(test5+" : "+isvalid(test5));
    }
}




















