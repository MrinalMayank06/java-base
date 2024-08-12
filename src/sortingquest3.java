import java.util.ArrayList;
import java.util.List;
public class sortingquest3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 6, 7, 9};
        int[] arr2 = {1, 2, 4, 5, 9, 10};
        int[] arr3 = {1, 4, 9, 12};

        List<Integer> commonElements = findCommonElements(arr1, arr2, arr3);
        System.out.println("Common elements in the three arrays are: " + commonElements);
    }

    public static List<Integer> findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> commonElements = new ArrayList<>();

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                commonElements.add(arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }
        return commonElements;
    }
}
