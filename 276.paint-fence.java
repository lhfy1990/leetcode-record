// Assumption: n>=0, k>=0
// Edge: n=0, k=0
// Algorithm: Dynamic Programming
// Complexity: O(n)
// let numWays[n] = a[n] + b[n] where a[n] with a same-color adjacent end
// b[n] with no same-color adjacent end
// then a[n] = b[n-1] and b[n] = (a[n-1]+b[n-1]) * (k-1)
class Solution {
    public int numWays(int n, int k) {
        int a = 0;
        int b = k;
        if (n == 0) return 0;
        for (int i = 1;i < n;i++) {
            int a1 = b;
            b = (a + b) * (k - 1);
            a = a1;
        }
        return a + b;
    }
}
