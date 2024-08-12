public class sortingquest7 {
    public static int findMjorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;

                if (count == 0) {

                    candidate = nums[i];
                    count = 1;
                }
            }
        }
        count = 0;
     for (int num: nums){
         if (num == candidate ){
             count++;
         }
     }
     if (count > nums.length/2){
         return candidate;
     }else {
         return -1;
     }}
        public static void main (String[] args){
            int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
            int majorityElement = findMjorityElement(nums);
            if (majorityElement != -1) {
                System.out.println("the majority element is : " + majorityElement);
            } else {
                System.out.println("No majority element found");
            }
        }
    }

