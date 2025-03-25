/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] result = new int[m + n];
        int i = 0, j = 0, k = 0;
        while(i < m && j < n) {
            if(nums1[i] < nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }
        while(i < m) {
            result[k++] = nums1[i++];
        }
        while(j < n) {
            result[k++] = nums2[j++];
        }
        for(int l = 0; l < m + n; l++) {
            nums1[l] = result[l];
        }
    }
}
// @lc code=end

