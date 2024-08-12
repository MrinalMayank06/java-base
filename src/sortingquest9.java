public class sortingquest9 {
    public static  int maxsumsubsequence(int [] nums ){
        int inclusive = nums[0];
        int exclusive = 0 ;

        for (int i =1 ; i < nums.length;i++){
            int temp= inclusive ;

            inclusive = Math.max(inclusive, exclusive + nums[i]);
            exclusive = temp;
        }
        return Math.max(inclusive, exclusive);
    }
    public static void main(String[] args) {
        int[] nums = {4,1,2,3,1,5};
        int maxsum = maxsumsubsequence(nums);
        System.out.println("Maximum sum of sequenece with no adjacent elements: "+ maxsum);
    }
}
