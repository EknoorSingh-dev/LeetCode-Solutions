/*
 * Problem: Remove Duplicates from Sorted Array
 * LeetCode: 26
 * Difficulty: Easy
 *
 * Approach:
 * - Compare each element with the remaining elements.
 * - If a duplicate is found, shift all elements to the left.
 * - Decrease the effective array size.
 *
 * Time Complexity: O(n³)
 * Space Complexity: O(1)
 *
 * Status: Accepted
 */

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        int numsSize = nums.length;

        for (int i = 0; i < numsSize; i++) {

            for (int j = i + 1; j < numsSize; j++) {

                if (nums[i] == nums[j]) {

                    for (int k = j; k < numsSize - 1; k++) {
                        nums[k] = nums[k + 1];
                    }

                    j--;
                    numsSize--;
                }
            }
        }

        return numsSize;
    }
}