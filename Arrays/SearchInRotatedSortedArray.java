// The approach is to use a modified version of binary search to find the target value in a rotated sorted array. It checks for equal elements at the start, middle, and end, and then updates the search range based on whether the left or right half is sorted.

// Approach
// Binary search

// Complexity

// Time complexity:
// O(logn)

// Space complexity:
// O(1)

// Code
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) >> 1;

            if (nums[mid] == target)
                return mid;

            // Check if the leftmost, middle, and rightmost elements are equal
            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left++;
                right--;
            } else if (nums[left] <= nums[mid]) {
                // If the left half is sorted
                if (nums[left] <= target && target <= nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            } else {
                // If the right half is sorted
                if (nums[mid] <= target && target <= nums[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        return -1; // Target not found
    }
}