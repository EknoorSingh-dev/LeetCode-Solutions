/*
 * Problem: Remove Element
 * LeetCode: 27
 * Difficulty: Easy
 *
 * Approach:
 * - Traverse the array.
 * - Whenever the target value is found,
 *   shift all remaining elements to the left.
 * - Decrease the effective array size.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * Status: Accepted
 */

public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        int size = nums.length;

        for (int i = 0; i < size; i++) {

            if (nums[i] == val) {

                for (int j = i; j < size - 1; j++) {
                    nums[j] = nums[j + 1];
                }

                i--;
                size--;
            }
        }

        return size;
    }
}