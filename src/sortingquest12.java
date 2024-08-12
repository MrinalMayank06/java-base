public class sortingquest12 {
    public static void findduplicate(int[] nums){

        for (int i= 0; i< nums.length;i++){
            int index = Math.abs(nums[i])-1;
            if (nums[index]>0){
                nums[index] = -nums[index];
            }else {
                System.out.println("Duplicate found: "+ Math.abs(nums[i]));
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        findduplicate(nums);
    }
}
