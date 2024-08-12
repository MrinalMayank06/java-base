import java.util.Arrays;
import java.util.Scanner;

public class sorting_quest {
    public static void permuteArrays(int[] arr1, int[] arr2, int k) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int ptr1 = 0;
        int ptr2 = arr2.length -1;

        while (ptr1 < arr1.length && ptr2 >= 0) {
            int sum = arr1[ptr1] + arr2[ptr2];

            if (sum >= k) {
                System.out.println(arr1[ptr1] + " " + arr2[ptr2]);
                ptr1++;
            } else {
                ptr2--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {2, 1, 3};
        int[] arr2 = {7, 8, 9};
        int k = 10;
        permuteArrays(arr1, arr2, k);
    }
}
