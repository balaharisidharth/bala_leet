// Last updated: 03/08/2026, 09:06:50
1class Solution {
2    public List<String> generateParenthesis(int n) {
3        List<String> res = new ArrayList<>();
4
5        dfs(0, 0, "", n, res);
6
7        return res;        
8    }
9
10    private void dfs(int openP, int closeP, String s, int n, List<String> res) {
11        if (openP == closeP && openP + closeP == n * 2) {
12            res.add(s);
13            return;
14        }
15
16        if (openP < n) {
17            dfs(openP + 1, closeP, s + "(", n, res);
18        }
19
20        if (closeP < openP) {
21            dfs(openP, closeP + 1, s + ")", n, res);
22        }
23    }    
24}