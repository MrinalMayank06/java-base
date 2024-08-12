public class stringquest5 {
    public static String longestcommonprefix(String[] strs){
        if (strs == null || strs.length == 0){
            return " ";
        }
        String prefix = strs[0];

        for (int i = 1; i < strs.length;i++){
            while (strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
                if (prefix.isEmpty()){
                    return " ";
                }
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
String[] test1 = {"flower", "flow","flight"};
String[] test2 = {"dog", "racecar","car"};
String[] test3 = {"interspecies", "interstellar","interstate"};
String[] test4 = { "throne","dungeon"};
String[] test5 = {"throne", "throne"};

        System.out.println("test1"+ longestcommonprefix(test1));
        System.out.println("test2"+ longestcommonprefix(test2));
        System.out.println("test3"+ longestcommonprefix(test3));
        System.out.println("test4"+ longestcommonprefix(test4));
        System.out.println("test5"+ longestcommonprefix(test5));

    }
}



















