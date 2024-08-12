public class stringquest2 {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        int[] charcount = new int[26];
        for (char c: s.toCharArray()){
            charcount[c- 'a']++;
        }

        for (char c: s.toCharArray()){
            charcount[c - 'a']--;
        }
        for (char c : t.toCharArray()){
            charcount[c- 'a']--;
        }
        for (int count : charcount){
            if (count != 0){
                return false;
            }
        }
        return true;
    }




    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagram";
        String s2 = "rat";
        String t2 = "car";
        System.out.println(isAnagram(s1,t1));
        System.out.println(isAnagram(s2,t2));
    }
}