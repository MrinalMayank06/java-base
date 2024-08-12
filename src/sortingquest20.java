import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class sortingquest20 {
    public static void findsubarrays(int[] arr) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<int[]> result = new ArrayList<>();


        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                result.add(new int[]{0, i});
            }
            if (map.containsKey(sum)) {
                ArrayList<Integer> list = map.get(sum);
                for (int value : list) {
                    result.add(new int[]{value + 1, i});
                }
            }
            ArrayList<Integer> newlist = new ArrayList<>();
            newlist.add(i);
            map.put(sum, newlist);
        }

        for (int[] subarray : result) {
            System.out.println("Subarray found from index " + subarray[0] + " to " + subarray[1]);
        }
    }


    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
         findsubarrays(arr);
    }
}