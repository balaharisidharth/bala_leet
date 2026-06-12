// Last updated: 13/06/2026, 00:53:02
1class Solution {
2    public List<List<Integer>> permuteUnique(int[] nums) {
3                List<List<Integer>> ans = new ArrayList<>();
4        List<Integer> temp = new ArrayList<>();
5        Arrays.sort(nums);
6        boolean[] used = new boolean[nums.length];
7        method(ans, temp, nums,used);
8        return ans;
9    }
10
11    void method(List<List<Integer>> ans, List<Integer> temp, int[] nums,boolean[] used) {
12        int n = nums.length;
13        if (temp.size() == n) {
14            ans.add(new ArrayList<>(temp));
15        } else {
16
17            for (int i = 0; i < n; i++) {
18                if (used[i]) continue;
19                if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
20                temp.add(nums[i]);
21                used[i]=true;
22                method(ans, temp, nums,used);
23                temp.remove(temp.size() - 1);
24                used[i]=false;
25            }
26        }
27    }
28}