// Problem Statement:  Given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are 
// (i, 0) and (i, height[i]). Find two lines that together with the x-axis form a container, such that the container contains the most water. 
// Return the maximum amount of water a container can store.

// Code
import java.util.*;

class Solution{
    static int maxArea(int nums[]) {
	   int maximum = Integer.MIN_VALUE;
    	for(int i = 0; i < nums.length; i++){
    		for(int j = i + 1; j < nums.length; j++){
    			int water = (j-i)* Math.min(nums[i], nums[j]);
    			maximum = Math.max(maximum, water);
    		}
    	}
        return maximum;
	}
    public static void main(String args[])
    {
    	int nums[] = {1, 4, 2, 3};
    	
    	System.out.println("Maximum amount of water is: " + maxArea(nums));
    }
}