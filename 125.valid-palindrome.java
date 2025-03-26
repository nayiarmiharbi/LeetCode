/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        // s = s.toLowerCase();
        // s = s.replaceAll("[^a-zA-Z0-9]", "");
        int left = 0, right = s.length() - 1;
        // while (left < right) {
        //     if (s.charAt(left) != s.charAt(right)) {
        //         return false;
        //     }
        //     left++;
        //     right--;
        // }
        // return true;

        // while (left < right) {
        //     // Move left pointer to next alphanumeric character
        //     while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
        //         left++;
        //     }
        //     // Move right pointer to previous alphanumeric character
        //     while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
        //         right--;
        //     }
        //     // Compare characters (case insensitive)
        //     if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
        //         return false;
        //     }
        //     left++;
        //     right--;
        // }
        // return true;
        while (left < right) {
            // Skip non-alphanumeric characters
            while (left < right && !isAlphaNumeric(s.charAt(left))) left++;
            while (left < right && !isAlphaNumeric(s.charAt(right))) right--;

            // Compare characters (optimized case-insensitive comparison)
            if ((s.charAt(left) | 32) != (s.charAt(right) | 32)) return false;

            left++;
            right--;
        }

        return true;
    }
    private boolean isAlphaNumeric(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}
// @lc code=end

