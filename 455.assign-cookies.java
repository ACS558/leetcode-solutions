/*
 * @lc app=leetcode id=455 lang=java
 *
 * [455] Assign Cookies
 */

// @lc code=start
class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
        int l=0, r=0;
        while(l<s.length && r<g.length){
            if(s[l]>=g[r]){
                r=r+1;
            }
            l=l+1;
        }
        return r;
        
    }
}
// @lc code=end

