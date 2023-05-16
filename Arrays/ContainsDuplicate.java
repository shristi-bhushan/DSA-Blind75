//Contains Duplicate
//Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

//Using HashMap to check duplicate elemnets and calculating the frequency of each element in the array. By iterating through the array and updating the frequency in the map, it identifies and returns true if a duplicate element is found. If no duplicates are found, it returns false.

//Approach
//Hash Map approach

//Complexity
//Time complexity:
//O(n)

//Space complexity:
//O(n)

//Code
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap();    //HahMap to calculate frequency of each element in the array
        for(int i=0; i< nums.length; i++){  
            map.putIfAbsent(nums[i],0);
            map.put(nums[i],map.get(nums[i])+1); //update frequency , increment frequency by 1
            if(map.get(nums[i])>1){
                return true;   //if frequency of element > 1 , return true 
            }
        }
        return false;
    }
}