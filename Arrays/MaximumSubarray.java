//Maximum Subarray
//It iterates through the array, updating the sum by adding the current element. If the sum surpasses the maximum, the maximum is updated. If the sum becomes negative, it is reset to zero, as a negative sum indicates that including the current element in the subarray will only decrease the overall sum.

//Approach
//Kadane's Algorithm

//Complexity
//Time complexity:
//O(n)

//Space complexity:
//O(1)

//Code
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maximum=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            sum+= nums[i];
            if(sum>maximum){
                maximum = sum;
            }
            if(sum<0){     //if sum is negative
                sum=0;     //reset sum to 0
            }
        }
        return maximum;
    }
}