import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashMap;
import java.util.Map;

public class stringquest6 {
    public static String convertoKeypadsequence(String s){
        Map<Character, String> keypadMapping = new HashMap<>();
        keypadMapping.put('A',"2");
        keypadMapping.put('B',"22");
        keypadMapping.put('C',"222");
        keypadMapping.put('D',"3");
        keypadMapping.put('E',"33");
        keypadMapping.put('F',"333");
        keypadMapping.put('G',"4");
        keypadMapping.put('H',"44");
        keypadMapping.put('I',"444");
        keypadMapping.put('J',"5");
        keypadMapping.put('K',"55");
        keypadMapping.put('L',"555");
        keypadMapping.put('M',"6");
        keypadMapping.put('N',"66");
        keypadMapping.put('O',"666");
        keypadMapping.put('P',"7");
        keypadMapping.put('Q',"77");
        keypadMapping.put('R',"777");
        keypadMapping.put('S',"7777");
        keypadMapping.put('T',"8");
        keypadMapping.put('U',"88");
        keypadMapping.put('V',"888");
        keypadMapping.put('W',"9");
        keypadMapping.put('X',"99");
        keypadMapping.put('Y',"999");
        keypadMapping.put('Z',"9999");
        keypadMapping.put('0',"0");

        s = s.toUpperCase();


        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()){
            if (keypadMapping.containsKey(c)){
                result.append(keypadMapping.get(c));
            }
        }
return result.toString();

    }

    public static void main(String[] args) {
        String sentence1= "H E L L O W O R L D";
        String sentence2= "G E E K S F O R G E E K S";
        String sentence3= "C O N V E R T  T O K E Y P A D ";

        System.out.println("sentence"+ sentence1);
        System.out.println("keypad seqence: "+ convertoKeypadsequence(sentence1));

        System.out.println("sentence : "+ sentence2);
        System.out.println("keypad sequence: "+ convertoKeypadsequence(sentence2));

        System.out.println("sentence: "+sentence3);
        System.out.println("keypad sequence : "+ convertoKeypadsequence(sentence3));

    }

}



















