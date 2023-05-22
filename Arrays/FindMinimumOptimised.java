// Find Minimum in Rotated Sorted Array

// The approach involves using binary search to find the minimum value in a rotated sorted array. The algorithm compares the middle element of the 
// current range with the rightmost element. If the middle element is smaller, it means the minimum value lies in the left half of the range. The 
// algorithm updates the right pointer to the middle index. Otherwise, the minimum value is in the right half, so the algorithm updates the left 
// pointer to mid + 1. This process is repeated until the left pointer is no longer less than the right pointer. 

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