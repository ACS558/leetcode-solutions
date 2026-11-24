/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {

        int madIndex=0;
        for(int i=0;i<arr.Length;i++){
            if(i>maxIndex) return false;
            maxIndex=Math.max(maxIndex,i+arr[i]);
        }
        return true;
        
    }
}
// @lc code=end

