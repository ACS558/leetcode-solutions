/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int left=0;
        // int right=0;
        // while(right<nums.length){
        //     if(nums[right]!=0){
        //         int t=nums[left];
        //         nums[left]=nums[right];
        //         nums[right]=t;
        //         left++;
        //     }
        //     right++;
        // }
        for(int right=0;right<nums.length;right++){
            if(nums[right]!=0){
                int t=nums[left];
                nums[left]=nums[right];
                nums[right]=t;
                left++;
            }
        }
    }
}
// @lc code=end

