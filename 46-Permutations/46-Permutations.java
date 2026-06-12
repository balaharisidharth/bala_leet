// Last updated: 12/06/2026, 13:32:52
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        List<List<Integer>> ans = new ArrayList<>();
4        List<Integer> temp = new ArrayList<>();
5        List<Integer> curr = new ArrayList<>();
6        method(ans, temp, nums);
7        return ans;
8    }
9
10    void method(List<List<Integer>> ans, List<Integer> temp, int[] nums) {
11        int n = nums.length;
12        if (temp.size() == n) {
13            ans.add(new ArrayList<>(temp));
14        } else {
15
16            for (int i = 0; i < n; i++) {
17                if (temp.contains(nums[i])) {
18                    continue;
19                }
20                temp.add(nums[i]);
21                method(ans, temp, nums);
22                temp.remove(temp.size() - 1);
23            }
24        }
25    }
26}