// Last updated: 12/06/2026, 10:41:31
1class Solution {
2    public List<List<Integer>> combine(int n, int k) {
3        List<List<Integer>> ans=new ArrayList<>();
4        List<Integer> temp=new ArrayList<>();
5        method(ans,temp,n,k,1);
6        return ans;
7    }
8
9    void method(List<List<Integer>> ans,List<Integer> temp,int n,int k,int start){
10        if(temp.size()==k){
11            ans.add(new ArrayList<>(temp));
12        }
13        for(int i= start;i<=n;i++){
14            temp.add(i);
15            method(ans,temp,n,k,i+1);
16            temp.remove(temp.size()-1);
17        }
18    }
19}