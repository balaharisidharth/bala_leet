// Last updated: 12/06/2026, 13:33:08
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        List<List<Integer>> ans = new ArrayList<>();
4        List<Integer> temp = new ArrayList<>();
5        method(ans, temp, nums);
6        return ans;
7    }
8
9    void method(List<List<Integer>> ans, List<Integer> temp, int[] nums) {
10        int n = nums.length;
11        if (temp.size() == n) {
12            ans.add(new ArrayList<>(temp));
13        } else {
14
15            for (int i = 0; i < n; i++) {
16                if (temp.contains(nums[i])) {
17                    continue;
18                }
19                temp.add(nums[i]);
20                method(ans, temp, nums);
21                temp.remove(temp.size() - 1);
22            }
23        }
24    }
25}