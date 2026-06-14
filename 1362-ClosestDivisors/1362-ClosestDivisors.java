// Last updated: 15/06/2026, 02:06:42
1class Solution {
2    public int[] closestDivisors(int num) {
3        int[] ans = new int[2];
4        int diff = Integer.MAX_VALUE;
5
6        // check both num+1 and num+2
7        for (int n : new int[]{num + 1, num + 2}) {
8            for (int i = (int)Math.sqrt(n); i >= 1; i--) {
9                if (n % i == 0) {
10                    int a = i, b = n / i;
11                    if (Math.abs(a - b) < diff) {
12                        diff = Math.abs(a - b);
13                        ans[0] = a;
14                        ans[1] = b;
15                    }
16                    break; // divisors found near sqrt, no need to go further
17                }
18            }
19        }
20        return ans;
21    }
22}
23