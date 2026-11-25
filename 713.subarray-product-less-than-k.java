/*
 * @lc app=leetcode id=713 lang=java
 *
 * [713] Subarray Product Less Than K
 */

// @lc code=start
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int count=0;
        int prod=1;
        int left=0;
        if(k<=1) return 0;
        for(int r=0; r<nums.length; r++){
            prod*=nums[r];
            while(prod>=k){
                prod/=nums[left];
                left++;
            }
            count+=r-left+1;
        }
        return count;
        
    }
}
// @lc code=end

