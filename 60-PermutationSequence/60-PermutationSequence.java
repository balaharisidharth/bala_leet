// Last updated: 13/06/2026, 00:13:41
1class Solution {
2    public String getPermutation(int n, int k) {
3        StringBuilder ans = new StringBuilder();
4        ArrayList<Integer> l = new ArrayList<>();
5        for (int i = 1; i <= n; i++)
6            l.add(i);
7        int f = 1;
8        for (int i = 1; i < n; i++)
9            f *= i;
10        k -= 1;
11        while (n > 0) {
12            int i = k / f;
13            ans.append(l.get(i));
14            l.remove(i);
15            n -= 1;
16            k %= f;
17            if (n != 0)
18                f /= n;
19        }
20        return ans.toString();
21        }
22    }