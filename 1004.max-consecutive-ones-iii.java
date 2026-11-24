/*
 * @lc app=leetcode id=1004 lang=java
 *
 * [1004] Max Consecutive Ones III
 */

// @lc code=start
class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
       int zeroCount=0;
       for(int r=0;r<nums.length;r++){
           if(nums[r]==0){
               zeroCount++;
           }
           if(zeroCount>k){
               if(nums[left]==0){
                   zeroCount--;
               }
               left++;
           }
       }
       return nums.length-left;
        
    }
}
// @lc code=end

