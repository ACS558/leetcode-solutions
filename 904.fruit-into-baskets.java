/*
 * @lc app=leetcode id=904 lang=java
 *
 * [904] Fruit Into Baskets
 */

// @lc code=start
class Solution {
    public int totalFruit(int[] fruits) {

        int count=0,l=0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int r=0;r<fruits.length;r++){
            map.put(fruits[r], map.getOrDefault(fruits[r],0)+1);
            while(map.size()>2){
                map.put(fruits[l], map.get(fruits[l])-1);
                if(map.get(fruits[l])==0){
                    map.remove(fruits[l]);
                }
                l++;
            }
            count=Math.max(count,r-l+1);
        }
        return count;
        
    }
}
// @lc code=end

