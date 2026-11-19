/*
 * @lc app=leetcode id=42 lang=java
 *
 * [42] Trapping Rain Water
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        int right=height.length-1;
        int left=0;
        int leftmax=height[left];
        int rightmax=height[right];
        int water=0;
        while(left<right){
            if(leftmax<rightmax){
                left++;
                leftmax=Math.max(leftmax, height[left]);
                water+=leftmax-height[left];
            }else{
                right--;
                rightmax=Math.max(rightmax, height[right]);
                water+=rightmax-height[right];
            }
        }
        return water;
    }
}
// @lc code=end

