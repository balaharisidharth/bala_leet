// Last updated: 30/06/2026, 09:20:19
1class Solution {
2    public String convertToTitle(int c) {
3        StringBuilder ans=new StringBuilder();
4        while(c!=0){
5            c--;
6            ans.insert(0,(char)((c%26)+'A'));
7            c/=26;
8        }
9        return ans.toString();
10    }
11}