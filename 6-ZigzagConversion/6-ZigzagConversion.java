// Last updated: 03/08/2026, 09:19:14
1class Solution {
2   public  String countAndSay(int n) {
3        String[] weKnow = {"1","11","21","1211","111221","312211","13112221","1113213211","31131211131221"};
4        return findRle(n,weKnow);
5    }
6
7
8    public  String findRle(int n,String[] arr ){
9        if (n <= 9){
10            return arr[n-1];
11        }
12        String str =  findRle(n-1,arr);
13        StringBuilder ans = new StringBuilder();
14        int count = 1;
15        for (int i = 1; i <= str.length(); i++) {
16            if (i < str.length() &&str.charAt(i-1) == str.charAt(i)){
17                count++;
18            }else{
19                ans.append(count);
20                ans.append(str.charAt(i-1));
21                count = 1;
22            }
23        }
24        return ans.toString();
25
26    }
27}