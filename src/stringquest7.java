import java.util.HashMap;
import java.util.Map;

public class stringquest7 {
    public static void main(String[] args) {
String input = " example input string";
printDuplicates(input);
    }
    public static void printDuplicates(String str) {
        HashMap<Character, Integer> charcountMap = new HashMap<>();

                char[] charArray = str.toCharArray();

        for (char c : charArray){
            if (charcountMap.containsKey(c)){
                charcountMap.put(c , charcountMap.get(c)+1);
            } else {
                charcountMap.put(c,1);
            }
        }
        System.out.println("Duplicate character in the input string: ");
for (Map.Entry<Character,Integer> entry : charcountMap.entrySet()){
    if (entry.getValue()> 1){
        System.out.println(entry.getKey()+" : ");
    }
}

    }
}
