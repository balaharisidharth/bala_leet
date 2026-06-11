// Last updated: 11/06/2026, 13:44:41
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
16
17class Solution {
18
19    public TreeNode minValue(TreeNode root){
20        while(root.left != null){
21            root = root.left;
22        }
23        return root;
24    }
25
26
27    public TreeNode deleteNode(TreeNode root, int key) {
28        if (root==null) return root;
29        if(root.val>key) {
30            root.left=deleteNode(root.left,key);
31            }
32        else if(root.val<key) {
33            root.right=deleteNode(root.right,key);
34            }
35        else{
36            if(root.left==null && root.right==null) root=null;
37            else if(root.left==null || root.right==null){
38                if(root.left==null) return root.right;
39                else return root.left;
40            }
41            else{
42                TreeNode mini=minValue(root.right);
43                root.val=mini.val;
44                root.right=deleteNode(root.right,mini.val);
45                return root;
46            }
47        }
48        return root;
49    }
50}