public class sortingquest18 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        if (totalLength % 2 == 1) {
            return findKth(nums1, nums2, totalLength / 2 + 1);
        } else {
            return (findKth(nums1, nums2, totalLength / 2) + findKth(nums1, nums2, totalLength / 2 + 1)) / 2.0;
        }
    }

    private static int findKth(int[] nums1, int[] nums2, int k) {
        if (nums1.length > nums2.length) {
            return findKth(nums2, nums1, k);
        }
        if (nums1.length == 0) {
            return nums2[k - 1];
        }
        if (k == 1) {
            return Math.min(nums1[0], nums2[0]);
        }
        int index1 = Math.min(nums1.length, k / 2);
        int index2 = k - index1;
        if (nums1[index1 - 1] < nums2[index2 - 1]) {
            int[] newNums1 = new int[nums1.length - index1];
            System.arraycopy(nums1, index1, newNums1, 0, nums1.length - index1);
            return findKth(newNums1, nums2, k - index1);
        } else {
            int[] newNums2 = new int[nums2.length - index2];
            System.arraycopy(nums2, 0, newNums2, 0, nums2.length - index2);
            return findKth(nums1, newNums2, k - index2);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3,8,9,87};
        int[] nums2 = {2};
        System.out.println("Median is: " + findMedianSortedArrays(nums1, nums2));

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println("Median is: " + findMedianSortedArrays(nums3, nums4));
    }
}

