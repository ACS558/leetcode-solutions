/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]>0) break;
            if(i>0 && nums[i]==nums[i-1]) continue;
           int l=i+1, r=n-1;
           while(l<r){
            int sum=nums[l]+nums[i]+nums[r];
            if(sum==0){
                res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                while(l<r && nums[l]==nums[l+1]) l++;
                while(l<r && nums[r]==nums[r-1]) r--;
                l++;
                r--;
            }else if(sum<0){
                l++; }else{
                r--;
                }
           }
        }
        return res;
        
    }
}
// @lc code=end

