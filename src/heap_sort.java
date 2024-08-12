import javax.swing.*;

//import java.util.Random;
//
//public  class heap_sort {
//    public static int findKthSmallest(int[]array,int k){
//        if(array==null|| array.length ==0 || k<=0 || k>array.length){
//            return -1;
//        }
//        return quickselect(array,0,array.length-1,k-1);
//    }
//private static int quickselect(int[]array, int left, int right, int k){
//        if (left==right){
//            return array[left];
//        }
//int pivotindex = partition(array,left,right);
//        if (k== pivotindex){
//            return array[k];
//        } else if (k< pivotindex) {
//            return quickselect(array,left,pivotindex-1,k);
//        }else {
//            return quickselect(array,pivotindex+1, right,k);
//        }
//}
//private static int partition(int[]array,int left, int right){
//        int randomIndex = new Random().nextInt(right - left +1)+left;
//        swap(array,randomIndex, right);
//        int pivot = array[right];
//        int i = left-1;
//
//        for (int j= left;j<right;j++){
//            if (array[j]<=pivot){
//                i++;
//                swap(array,i,j);
//            }
//        }
//
//         swap(array,i+1,right);
//        return i+1;
//}
//
//private static void swap(int[]array, int i, int j){
//        int temp = array[i];
//        array[i] = array[j];
//        array[j]= temp;
//}
//
//
//    public static void main(String[] args) {
//        System.out.println("Heap sort Algorithm");
//        System.out.println("kth smallest element");
//int [] array = {6,4,2,3,8,9,15};
//int k= 3;
//
//int kthsmallest = findKthSmallest(array,k);
//        System.out.println("the "+ k+ "th smallest element is :  "+ kthsmallest);
//
//
//    }
//}
//
//import java.util.Arrays;
//
//public class heap_sort{
//    public static int sumbetkthsamllest(int[]arr,int k1, int k2){
//        if (arr==  null|| arr.length== 0|| k1 <= 0|| k2 <=0 || k1 >= arr.length|| k2 >= arr.length|| k1>=k2){
//            return -1;
//        }
//        Arrays.sort(arr);
//        int sum = 0 ;
//        for (int i = k1; i <k2 -1; i++){
//            sum+= arr[i];
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        int [] arr = {5,6,4,2,8,7,9};
//        int k1 = 2;
//        int k2 = 5;
//        int sum  = sumbetkthsamllest(arr,k1,k2);
//        System.out.println("The sum of element between the "+ k1 + "th and" + k2+ "smallest element is : "+ sum);
//
//    }
//public class heap_sort {
//    public void sort(int arr[]){
//        int n = arr.length;
//        for (int i = n/2 -1; i>= 0; i--)
//            heapify(arr,n,i);
//
//        for (int i= n-1; i>0; i--){
//            int temp = arr[0];
//            arr[0] = arr[i];
//            arr[i]= temp;
//
//            heapify(arr,i,0);
//        }
//    }
//    void heapify(int arr[], int n, int i){
//        int largest = i ;
//        int l = 2*i+1;
//        int r= 2*i+2;
//
//
//        if (l<n&& arr[l]>arr[largest])
//            largest=1;
//
//        if (r<n&& arr[r] > arr[largest])
//        largest= r;
//
//        if (largest != i) {
//            int swap = arr[i];
//            arr[i] = arr[largest];
//            arr[largest]= swap;
//
//            heapify(arr,n,largest);
//        }
//    }
//    static void printarray(int  arr[]){
//        int n = arr.length;
//        for (int i = 0; i < n; i++)
//            System.out.print(arr[i]+" ");
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        int array[]={12,3,45,1,56,4,89};
//        int n = array.length;
//        heap_sort ob = new heap_sort();
//        ob.sort(array);
//
//        System.out.println("Sorted Array is: ");
//         printarray(array);
//    }
//}
//
public class heap_sort {
    public void sort(int arr[]){
        int n = arr.length;

        for (int i = n/2-1; i>=0 ; i--)
            heapify(arr,n,i);

        for (int i = n-1; i>0; i--){
            int temp = arr [0];
            arr[0]= arr[i];
            arr[i] = temp;

            heapify(arr,n,i);
        }
    }
     void heapify(int arr[], int n, int i){
        int largest = i;
        int left= 2*i+ 1;
        int right = 2*i+2;


        if (left< n&& arr[left] > arr[largest])
            largest = left;

        if (largest != i){
            int temp = arr[i];
            arr[i]= arr[largest];
            arr[largest]= temp;

            heapify(arr,n,largest);
        }
     }
     static void printarray(int arr[])
     {
         int n = arr.length;
         for (int i= 0 ; i< n;i++){
             System.out.print(arr[i]+ " ");
             System.out.println();
         }
     }

    public static void main(String[] args) {
        int arr[]= {4,2,40,3,5,1};
        int n = arr.length;
        heap_sort ob = new heap_sort();
        ob.sort(arr);
        System.out.println("sorted array is = ");
        printarray(arr);
    }
}