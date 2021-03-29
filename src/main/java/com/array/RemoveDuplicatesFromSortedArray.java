package com.array;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Constraints:
 *  0 <= nums.length <= 3 * 104
 *  -104 <= nums[i] <= 104
 *  nums is sorted in ascending order.
 */

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int newLength = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) continue;
            nums[newLength] = nums[i];
            newLength++;
        }
        return newLength;
    }
}
