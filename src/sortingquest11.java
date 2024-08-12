public class sortingquest11 {
    public static long countInversions(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    public static long mergeSort(int[] arr, int low, int high) {
        long count = 0;
        if (low < high) {
            int mid = low + (high - low) / 2;
            count += mergeSort(arr, low, mid);
            count += mergeSort(arr, mid + 1, high);
            count += merge(arr, low, mid, high);
        }
        return count;
    }

    public static long merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low, j = mid + 1;
        long count = 0;
        int k = 0;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += mid - i + 1; // Count inversions
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= high) {
            temp[k++] = arr[j++];
        }

        for (i = low, k = 0; i <= high; i++, k++) {
            arr[i] = temp[k];
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 20, 6, 4, 5,45,78,12,1000};
        long inversions = countInversions(arr);
        System.out.println("Number of inversions: " + inversions);
    }
}
