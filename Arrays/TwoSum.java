'''Creating HashMap for storing nums[i] and i. 
For each and every nums[i] in the given array, 
calculating complement and checking its existence in HashMap, 
if found, returning the indices of both present nums[i] and the complement index.

Approach
Using HashMap

Complexity
Time complexity:
$$O(n)$$

Space complexity:
$$O(n)$$'''

'''Code'''
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result= new int[2];
        Map<Integer, Integer> table= new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(table.containsKey(target-nums[i])){
                result[1]=i;
                result[0]= table.get(target-nums[i]);
                return result;
            }
            table.put(nums[i],i);
        }
        return result;
    }
}
