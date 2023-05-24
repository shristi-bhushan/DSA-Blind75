// Problem Statement:  Given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are 
// (i, 0) and (i, height[i]). Find two lines that together with the x-axis form a container, such that the container contains the most water. 
// Return the maximum amount of water a container can store.

// Code
class Solution{
    static int maxArea(int nums[]) {
        
        int i = 0,j = nums.length - 1, mx = Integer.MIN_VALUE;
    	while(i < j)
    	{
    		int water = (j-i)* Math.min(nums[i],nums[j]);
    		mx = Math.max(mx,water);
    		if(nums[i] < nums[j])
    		    i++;
    		else
    		    j--;
    	}
	
	    return mx;
	}