//Product of Array except self
//The approach used is Two-Pass Array Product.. The first pass calculates the product of all elements to the left of each element, and the second pass calculates the product of all elements to the right of each element. By multiplying the corresponding left and right products, the (final) desired product of all elements except the current element is obtained.

//Approach
//Two-pass

//Complexity
//Time complexity:
//O(n)

//Space complexity:
//O(1)

//Code
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0){
            return new int[0];
        }
        int[] result = new int[nums.length];
        int running_pass = 1 ;

        for(int i=0; i < nums.length; i++){
            result[i] = running_pass;
            running_pass = running_pass * nums[i];
        }
        
        running_pass= 1;

        for(int i=(nums.length - 1); i >= 0; i--){
            result[i] = result[i] * running_pass;
            running_pass = running_pass * nums[i];
        }
        return result;
    }
}