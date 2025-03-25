/*
 * @lc app=leetcode id=80 lang=java
 *
 * [80] Remove Duplicates from Sorted Array II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[count-2]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
// @lc code=end

