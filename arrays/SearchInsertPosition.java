/*
 * Problem: Search Insert Position
 * LeetCode: 35
 * Difficulty: Easy
 *
 * Approach:
 * - Traverse the array from left to right.
 * - Return the first index where the element is
 *   greater than or equal to the target.
 * - If no such element exists, return the array length.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Status: Accepted
 */

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] >= target) {
                return i;
            }
        }

        return nums.length;
    }
}