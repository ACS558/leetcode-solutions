/*
 * @lc app=leetcode id=3477 lang=java
 *
 * [3477] Fruits Into Baskets II
 */

// @lc code=start
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int unplaced = 0;
        int n = fruits.length;
        boolean[] used = new boolean[n];

        for (int i = 0; i < n; i++) {
            boolean placed = false;
            for (int j = 0; j < n; j++) {
                if (!used[j] && baskets[j] >= fruits[i]) {
                    used[j] = true;
                    placed = true;
                    break;
                }
            }
            if (!placed) {
                unplaced++;
            }
        }
        return unplaced;
        
    }
}
// @lc code=end

