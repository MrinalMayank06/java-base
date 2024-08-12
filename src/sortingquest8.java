import java.util.Arrays;

public class sortingquest8 {
    public static int countTripletwithsmaller(int [] nums, int target){
        Arrays.sort(nums);
        int count = 0;

        for (int i =0; i < nums.length-2; i++){
            for (int j= i+1;j< nums.length-1; j++){
                for (int k = j+1; k< nums.length;k++) {
                    int sum = nums[i] + nums[j] + nums[k];

                    if (sum< target){
                        count++;
                    }else {
                        break;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9}
            ;
        int target = 10;
        int result = countTripletwithsmaller(nums,target);
        System.out.println("number of triplets with sum smaller than "+ target+" : "+ result);
    }
}
