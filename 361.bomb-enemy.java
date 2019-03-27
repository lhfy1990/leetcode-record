// Assumption: 1. all valid value
// Edge: 1. zero size
// Algorithm: Dynamic Programming
// Complexity: O(mn)
// keep two additional grid, for horizontal and vertical enemy count
class Solution {
    public int maxKilledEnemies(char[][] grid) {
        int height = grid.length;
        if (height == 0) return 0;
        int width = grid[0].length;
        if (width == 0) return 0;
        int[][] gh = new int[height][width];
        int[][] gv = new int[height][width];
        for(int i=0;i<height;i++) {
            for (int j=0;j<width;j++) {
                // loop and update both grids
            }
        }
        for(int i=0;i<height;i++) {
            for (int j=0;j<width;j++) {
                // loop and get max value
            }
        }
        
    }
}
