/*645. Set Mismatch
You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

 

Example 1:

Input: nums = [1,2,2,4]
Output: [2,3]
Example 2:

Input: nums = [1,1]
Output: [1,2]*/

class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup = -1;
        int miss = -1;
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1] && dup == -1){
                dup = nums [i];
            }

            if(nums[i] != i+1 && miss == -1){
                miss = i+1;
                if(miss == nums[i+1]){
                    miss = -1;
                }
            }
        }
        if(miss == -1){
            miss = nums.length;
        }
        return new int[] {dup,miss};    
    }
}
