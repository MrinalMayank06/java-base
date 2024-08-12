import java.util.HashSet;

public class sortingquest6 {

    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 4, 2};
        int targetDifference = 3;

        boolean result = hasPairWithDifference(arr, targetDifference);
        System.out.println("Pair with difference " + targetDifference + " exists: " + result);
    }

    public static boolean hasPairWithDifference(int[] arr, int targetDifference) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num + targetDifference) || set.contains(num - targetDifference)) {
                return true;
            }

            set.add(num);
        }
        return false;
    }
}
