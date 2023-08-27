package Hard.median_Of_Two_Sorted_Arrays;


// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

// The overall run time complexity should be O(log (m+n)).


// Example 1:
// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.

// Example 2:
// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000
// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


// Constraints:
//    nums1.length == m
//    nums2.length == n
//    0 <= m <= 1000
//    0 <= n <= 1000
//    1 <= m + n <= 2000
//    -10^6 <= nums1[i], nums2[i] <= 10^6

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {

        double[] nums1 = new double[]{1, 2};
        double[] nums2 = new double[]{3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(double[] nums1, double[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        double[] mergeArray = new double[m + n];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                mergeArray[k] = nums1[i];
                k++;
                i++;
            } else {
                mergeArray[k] = nums2[j];
                k++;
                j++;
            }
        }

        for (; i < m; i++) {
            mergeArray[k] = nums1[i];
            k++;
        }

        for (; j < n; j++) {
            mergeArray[k] = nums2[j];
            k++;
        }

        if ((m + n) % 2 == 0) {
            return (mergeArray[(m + n) / 2 - 1] + mergeArray[(m + n) / 2]) / 2;
        } else {
            return mergeArray[(m + n) / 2];
        }
    }
}