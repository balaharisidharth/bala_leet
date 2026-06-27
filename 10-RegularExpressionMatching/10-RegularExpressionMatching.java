// Last updated: 27/06/2026, 09:27:45
1class Solution {
2    public boolean isMatch(String s, String p) {
3        return match(s, p, 0, 0);
4    }
5    
6    private boolean match(String s, String p, int sIndex, int pIndex) {
7        if (sIndex == s.length() && pIndex == p.length()) {
8            return true;
9        }
10
11        if (pIndex == p.length()) {
12            return false;
13        }
14        
15        char current_char = p.charAt(pIndex);
16        boolean has_star = (pIndex + 1 < p.length() && p.charAt(pIndex + 1) == '*');
17        
18        if (has_star) {
19            if (match(s, p, sIndex, pIndex + 2)) {
20                return true;
21            }
22            
23            int i = sIndex;
24            while (i < s.length() && (current_char == '.' || s.charAt(i) == current_char)) {
25                if (match(s, p, i + 1, pIndex + 2)) {
26                    return true;
27                }
28                i++;
29            }
30            return false;
31        } else {
32            if (sIndex < s.length() && (current_char == '.' || s.charAt(sIndex) == current_char)) {
33                return match(s, p, sIndex + 1, pIndex + 1);
34            }
35            return false;
36        }
37    }
38}