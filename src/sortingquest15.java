public class sortingquest15 {
    public static void main(String[] args) {
        int[] array = {5,10,15,20};

        int max = array[0];
        int min = array[0];

        for (int i = 1; i< array.length; i++){
            if (array[i]> max){
                max = array[i];
            }
            if (array[i]<min){
                min = array[i];
            }
        }
        int difference = max-min;

        for (int i = 0; i< array.length;i++){
            array[i]+= difference;
        }

        System.out.println("Array with all elements equal to  max: ");
        for (int num : array){
            System.out.print(num + " ");
        }
    }
}
