public class sorting_quest2 {
    public  static void countingsort(int [] arr, int max){
        int [] count = new int[max+1];
        int [] sortedArr= new int[arr.length];

        for (int num : arr){
            count[num]++;
        }
        for (int i =1; i< count.length; i++){
            count[i] +=count[i-1];
        }

        for (int i = arr.length- 1;i>=0; i--){
            sortedArr[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }
        for (int i = 0; i < arr.length; i++){
            arr[i] = sortedArr[i];
        }
    }


    public static void main(String[] args) {
        int[] arr= {4,2,2,5,7,6,6,1,1,3,4,5,6,9,7,4};

        int max =9;

        countingsort(arr, max);

        for (int num : arr){
            System.out.print(num+" ");
        }

    }





}
