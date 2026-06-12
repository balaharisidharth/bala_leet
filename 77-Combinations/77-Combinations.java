// Last updated: 12/06/2026, 11:57:49
1class Solution {
2    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
3        List<List<Integer>> ans = new ArrayList<>();
4        List<Integer> temp = new ArrayList<>();
5        Arrays.sort(candidates);
6            method(ans,temp,candidates,target,0);
7            return ans;
8
9    }
10
11    void method(List<List<Integer>> ans, List<Integer> temp, int[] can, int target,int start) {
12        int n = can.length;
13
14        if(target==0){
15            if(!ans.contains(temp))
16            ans.add(new ArrayList<>(temp));
17            return;
18        }
19        for(int i=start;i<n;i++){
20            if(i>start && can[i]==can[i-1]) continue;
21            if(can[i]>target) break;
22            temp.add(can[i]);
23            method(ans,temp,can,target-can[i],i+1);
24            temp.remove(temp.size()-1);
25        }
26    }
27}