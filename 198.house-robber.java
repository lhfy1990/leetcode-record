// Assumption: 1. non-negative array
// Edge: 1. empty array. 2. start points
// Algorithm: Dynamic Programming
// Complexity: O(n)
// a[n]: max amount with last entered
// b[n]: max amount with last not entered
// a[n] = b[n-1] + i[n], b[n] = max(a[n-1], b[n-1])
class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) { return 0; }
        if (nums.length == 1) { return nums[0]; }
        int a = nums[1]; // a[1]
        int b = nums[0]; // b[1]
        for(int i=2; i<nums.length; i++) {
            int t = a;
            a = b + nums[i];
            b = max(b, t);
        }
        return max(a, b);
    }
    private int max(int a, int b) {
        return a > b ? a : b;
    }
}
