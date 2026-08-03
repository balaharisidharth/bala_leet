// Last updated: 03/08/2026, 09:18:13
1class Solution {
2    public int myAtoi(String s) {
3        s = s.trim();
4        int sign = 1, i = 0;
5        long res = 0;
6
7        if (s.length() == 0)
8            return 0;
9
10        if (s.charAt(0) == '-') {
11            sign = -1;
12            i++;
13        }
14        else if (s.charAt(0) == '+')
15            i++;
16
17        while (i < s.length()) {
18            char ch = s.charAt(i);
19
20            if (ch < '0' || ch > '9')
21                break;
22
23            res = res * 10 + (ch - '0');
24
25            if (sign * res > Integer.MAX_VALUE)
26                return Integer.MAX_VALUE;
27
28            if (sign * res < Integer.MIN_VALUE)
29                return Integer.MIN_VALUE;
30
31            i++;
32        }
33
34        return (int) (sign * res);
35    }
36}