public class sortingquest5 {
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,10,12};
        int target = 11;


        int result= findceling(arr,target);
        if (result!= -1){
            System.out.println("the celing of "+ target+ " is: "+ arr[result]);
        } else {
            System.out.println(" ceiling of  "+target + "does not exist in the array ");
        }
    }
    public static int findceling(int[] arr, int target){

        int left = 0;
        int right = arr.length-1;
        int result = -1;

        while (left<= right ){
            int mid = left+ (right - left)/2;

            if (arr[mid]== target){

                return mid;

            } else if (arr[mid]< target) {
                left = mid + 1;

            }
            else {
                result = mid;
                right = mid-1;
            }
        }

    return result;
    }

}
