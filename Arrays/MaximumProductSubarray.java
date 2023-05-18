//Maximum product subarray
//The code iterates through the array and keeps track of the maximum product encountered so far, considering both positive and negative numbers. By comparing the current element with the previous maximum product and updating the product variables accordingly, the algorithm efficiently finds the maximum product subarray.

//Approach
//Kadane's algorithm

//Complexity
//Time complexity:
//O(n)

//Space complexity:
//O(1)

//Code
class Solution {
    public int maxProduct(int[] nums) {
        int product1 = nums[0],product2 = nums[0];
        int result = nums[0];
    
    for(int i=1;i<nums.length;i++) {
        int temp = Math.max(nums[i],Math.max(product1*nums[i],product2*nums[i]));
        product2 = Math.min(nums[i],Math.min(product1*nums[i],product2*nums[i]));
        product1 = temp;
        
        result = Math.max(result,product1);
    }
    
    return result;
	}
    }