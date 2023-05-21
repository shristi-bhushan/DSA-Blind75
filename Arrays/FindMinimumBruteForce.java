// Minimum in Rotated Sorted Array
// Problem Statement: Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums[] = [0,1,2,4,5,6,7] might become:

// [4,5,6,7,0,1,2] if it was rotated 4 times.
// [0,1,2,4,5,6,7] if it was rotated 7 times.
// Given the sorted rotated array nums of unique elements, return the minimum element of this array.

import java.util.*;

class TUF{
public static void main(String args[]){
	int ar[]={4,5,1,2,3};
	int minValue=Integer.MAX_VALUE,i;
	for(i=0;i<5;i++){
		minValue=Math.min(minValue,ar[i]);
	}
	System.out.println("Minimum Value is "+minValue);
   }
}