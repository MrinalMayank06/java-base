public class stringquest1 {
    public static boolean isPalindrome(String s){
        if (s== null){
            return false;
        }
        StringBuilder filtered = new StringBuilder();
        for (char c : s.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                filtered.append(c);
            }
        }
        String filteredString = filtered.toString().toLowerCase();

        int left=0;
        int right = filteredString.length()-1;
        while (left < right ){
            if (filteredString.charAt(left) != filteredString.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
String test1 = "A man, a plan, a canal : Panama";
String test2 = "A race a car";

        System.out.println(isPalindrome(test1));
        System.out.println(isPalindrome(test2));
    }
}
