// Last updated: 12/06/2026, 14:48:03
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> ans = new ArrayList<>();
4        List<Integer> temp = new ArrayList<>();
5        method(nums, ans, temp, 0);
6        // ans.remove(ans.size()-1);
7        return ans;
8    }
9
10    void method(int[] nums, List<List<Integer>> ans, List<Integer> temp, int red) {
11        if (!ans.contains(temp)) {
12            ans.add(new ArrayList<>(temp));
13        }
14        for (int i = red; i < nums.length; i++) {
15            if (temp.contains(nums[i])) {
16                continue;
17            } else {
18                temp.add(nums[i]);
19                method(nums, ans, temp, i+1);
20                temp.remove(temp.size() - 1);
21            }
22        }
23    }
24}