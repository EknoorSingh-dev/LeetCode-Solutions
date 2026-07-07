/*
 * Problem: Apply Operations to an Array
 * LeetCode: 2460
 * Difficulty: Easy
 *
 * Approach:
 * - Traverse the array.
 * - If two adjacent elements are equal,
 *   double the first element and make the second element 0.
 * - After processing all elements,
 *   move all zeros to the end by repeatedly swapping them.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 *
 * Status: Accepted
 */

public class ApplyOperationsToAnArray {

    public int[] applyOperations(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }

        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = 0; j < nums.length - 1; j++) {

                if (nums[j] == 0) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        return nums;
    }
}