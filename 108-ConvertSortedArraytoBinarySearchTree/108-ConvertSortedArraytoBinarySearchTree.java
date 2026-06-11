// Last updated: 11/06/2026, 09:22:30
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16// Definition for a binary tree node.
17public class TreeNode {
18    int val;
19    TreeNode left;
20    TreeNode right;
21    TreeNode() {}
22    TreeNode(int val) { this.val = val; }
23    TreeNode(int val, TreeNode left, TreeNode right) {
24        this.val = val;
25        this.left = left;
26        this.right = right;
27    }
28}
29
30class Solution {
31    public TreeNode sortedArrayToBST(int[] nums) {
32        return helper(nums, 0, nums.length - 1);
33    }
34
35    private TreeNode helper(int[] nums, int left, int right) {
36        if (left > right) return null;
37        int mid = (left + right) / 2;
38        TreeNode root = new TreeNode(nums[mid]);
39        root.left = helper(nums, left, mid - 1);
40        root.right = helper(nums, mid + 1, right);
41        return root;
42    }
43}