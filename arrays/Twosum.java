/*
 * Problem: Two Sum
 * LeetCode: 1
 * Difficulty: Easy
 *
 * Approach:
 * - Check every possible pair of elements.
 * - If the sum of the pair equals the target,
 *   return their indices.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * Status: Accepted
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }
}