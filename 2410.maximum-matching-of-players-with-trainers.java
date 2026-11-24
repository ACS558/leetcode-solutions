/*
 * @lc app=leetcode id=2410 lang=java
 *
 * [2410] Maximum Matching of Players With Trainers
 */

// @lc code=start
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int l=0, r=0;
        while(l<trainers.length && r<players.length){
            if(trainers[l]>=players[r]){
                r=r+1;
            }
            l=l+1;
        }
        return r;
    }
}
// @lc code=end

