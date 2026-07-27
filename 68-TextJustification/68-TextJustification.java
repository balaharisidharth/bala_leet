// Last updated: 27/07/2026, 09:01:41
1import java.util.*;
2
3class Solution {
4    Map<String, Boolean> mp = new HashMap<>();
5
6    public boolean isScramble(String s1, String s2) {
7        int n = s1.length();
8        if (s1.equals(s2)) return true;
9        if (n == 1) return false;
10
11        String key = s1 + " " + s2;
12
13        if (mp.containsKey(key)) return mp.get(key);
14
15        for (int i = 1; i < n; i++) {
16            if (isScramble(s1.substring(0, i), s2.substring(0, i)) && isScramble(s1.substring(i), s2.substring(i))){
17                mp.put(key, true);
18                return true;
19            }
20
21            if (isScramble(s1.substring(0, i), s2.substring(n - i)) && isScramble(s1.substring(i), s2.substring(0, n - i))){
22                mp.put(key, true);
23                return true;
24            }
25        }
26
27        mp.put(key, false);
28        return false;
29    }
30}