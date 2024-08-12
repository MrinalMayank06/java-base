import java.util.Scanner;

public class greter_among_the_5 {
    public static int findGreatest(int[] nums){
        int greatest = nums[0];

        for (int i = 1; i< nums.length; i++){
            if (nums[i]>greatest){
                nums[i] =  greatest;
            }
        }
        return greatest;
    }

    public static void main(String[] args) {
        System.out.println("Find  Greater  among them =  ");

        Scanner sc = new Scanner(System.in);
        int[] inputNUmber = new int[5];

        for (int i = 1; i <5; i++){
            System.out.println("input no. "+i+1 + ": ");
             inputNUmber[i] = sc.nextInt();
        }
        int greatest = findGreatest(inputNUmber);
        System.out.println(" greatest no. "+greatest);

    }
}
