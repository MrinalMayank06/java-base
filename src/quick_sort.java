import java.util.Arrays;

public class quick_sort {
    public static void main(String[] args) {
int[] array= {5,4,6,8,9};
// sort(array,0,array.length-1);
//        System.out.println(Arrays.toString(array));
Arrays.sort(array);

    }
    static void sort(int []nums, int low, int hi){
        if(low>= hi){
            return;
        }
        int s = low;
        int e = hi;
        int m = s+(e-s) / 2;
        int pivot = nums[m];
        while (s<= e){
            while (nums[s]< pivot){
                s++;
            }
            while (nums[e]>pivot){
                e--;
            }
            if (s<=e){
                int temp = nums[s];
                nums[s]=nums[e];
                nums[e]= temp;
                s++;
                e--;
            }
        }
        sort(nums, low, e);
        sort(nums, hi,s);


    }
}
