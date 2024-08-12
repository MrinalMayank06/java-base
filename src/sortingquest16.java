public class sortingquest16 {
    public boolean canBesortedReversingSubarray(int[] nums){
        int n = nums.length;
        int start = -1, end = -1;

        for (int i = 0; i< n -1;i++){
            if (nums[i] > nums[i+1]){
                start = i;
                break;
            }
        }
        if (start == -1){
            return true;
        }

        for (int i = n-1; i >0; i--){
            if(nums[i]<nums[i-1]){
                end = i;
                break;
            }
        }
        reverse (nums,start, end);
        for (int i = 0; i< n-1; i++){
            if (nums[i]> nums[i+1]){
                return false;
            }
        }

        return true;

    }


    private void reverse(int[] nums, int start, int end){
        while (start < end ){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
