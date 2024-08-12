public class stringquest9 {
    public static void main(String[] args) {
        String input = "ABAAABC";
        int k = 1;
        int length = characterReplacement(input, k);
        System.out.println("Length of the longest substring after character replacement: "+ length);
    }
    public static int characterReplacement(String s, int k ){
        int[] charcount = new int[26];
        int maxlength = 0;
        int maxcount = 0;
        int start = 0;


        for (int end = 0; end < s.length(); end++){
            char currentchar = s.charAt(end);
            charcount[currentchar - 'A']++;
            maxcount= Math.max(maxcount,charcount[currentchar- 'A']);

            if ((end - start+1) - maxcount>k){
                charcount[s.charAt(start)-'A']--;
                start++;
            }
            maxlength = Math.max(maxlength,end - start+1);

        }
        return maxlength;
    }
}
