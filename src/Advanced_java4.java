import java.util.Arrays;

public class Advanced_java4 {
    public static void insertionSort(char[] data) {
        int n = data.length;
        for (int i = 1; i < n; i++) {
            char currentElement = data[i];
            int j = i;
            while (j > 0 && data[j - 1] > currentElement) {
                data[j] = data[j - 1];
                j--;
            }
            data[j] = currentElement;
        }
    }

    public static void main(String[] args) {
        System.out.println("Using Array and then sort the data ");
        char[] dataarr = {'f', 'r', 'g', 's', 'h', 'j', 'r'};
        System.out.println("Before Sorting: " + Arrays.toString(dataarr));

        insertionSort(dataarr);

        System.out.println("After Sorting: " + Arrays.toString(dataarr));
    }
}
