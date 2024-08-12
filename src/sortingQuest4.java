public class sortingQuest4 {
    public static void main(String[] args) {

        int [] arr = {3,5,8,10,6};
        int target = 6;
        int k= 6;


        int result = searchedInArray(arr,target,k);
        if (result != -1){
            System.out.println("Element"+ target + " found at index "+ result);
        }
        else {
            System.out.println("Element" + target + "not found in the array.");
        }
    }
    public static int searchedInArray(int[] arr, int target, int k){
        int i = 0 ;
        while (i< arr.length){
            int diff = Math.abs(arr[i] - target);

            if (diff<= k){
                return i;
            }
            i+= diff/k;
        }
        return -1;
    }
}
