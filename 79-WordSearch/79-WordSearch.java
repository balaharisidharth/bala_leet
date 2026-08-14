// Last updated: 14/08/2026, 10:14:38
1class Solution {
2
3    public List<List<Integer>> subsetsWithDup(int[] nums) {
4
5        List<List<Integer>> result = new ArrayList<>();
6
7        // Sort the array so that duplicate values become adjacent.
8        Arrays.sort(nums);
9
10        // Start recursion from index 0 with an empty subset.
11        friend(0, nums, new ArrayList<>(), result);
12
13        return result;
14    }
15
16    public static void friend(int idx,
17                              int[] nums,
18                              List<Integer> presentList,
19                              List<List<Integer>> result) {
20
21        // If every element has been processed,
22        // store the current subset.
23        if (idx == nums.length) {
24            result.add(new ArrayList<>(presentList));
25            return;
26        }
27
28        // Choice 1:
29        // Include the current element.
30        presentList.add(nums[idx]);
31        friend(idx + 1, nums, presentList, result);
32
33
34        // Backtrack:
35        // Undo the previous choice before
36        presentList.remove(presentList.size() - 1);
37
38        // Skip every duplicate of the current value.
39        int pos = idx + 1;
40        while (pos < nums.length && nums[pos] == nums[idx]) {
41            pos++;
42        }
43
44        // Choice 2:
45        // Exclude the current value and all of its duplicates.
46        friend(pos, nums, presentList, result);
47    }
48}