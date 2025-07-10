/**
 * LeetCode 268 - Missing Number
 * 
 * Given an array containing n distinct numbers taken from 0 to n,
 * find the one number that is missing from the array.
 * 
 * This solution uses the XOR trick:
 *  - XOR all numbers from 0 to n
 *  - XOR all numbers in the array
 *  - Matching numbers cancel out, and the leftover is the missing number
 */

//Method 1
public class MissingNumber_XOR {
    
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;

        // XOR all numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            xor ^= i;
        }

        // XOR all values in the input array
        for (int i = 0; i < n; i++) {
            xor ^= nums[i];
        }

        // The result is the missing number
        return xor;
    }
}

//Method 2
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }
}
