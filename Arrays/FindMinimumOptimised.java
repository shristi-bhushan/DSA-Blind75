// Find Minimum in Rotated Sorted Array

// Complexity : 

// Time Complexity : 
// O(logn)

// Space Complexity: 
// O(1)

class Solution {
public static int findMinimum(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[right]) {
                right = mid; // Minimum value is in the left half
            } else {
                left = mid + 1; // Minimum value is in the right half
            }
        }

        return nums[left]; // Minimum value found
    }
}