// Last updated: 10/06/2026, 14:31:48
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
16class Solution {
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        Queue<TreeNode> q=new LinkedList<>();
19        List<List<Integer>> ans=new ArrayList<List<Integer>>();
20        if(root==null){
21            return ans;
22        }
23        q.add(root);
24        while(!q.isEmpty()){
25            int s=q.size();
26            List<Integer> temp=new ArrayList<>();
27            for(int i=0;i<s;i++){
28                if(q.peek().left!=null){
29                    q.add(q.peek().left);
30                }
31                if(q.peek().right!=null){
32                    q.add(q.peek().right);
33                }
34                temp.add(q.remove().val);
35            }
36            ans.add(temp);
37        }
38        return ans;
39    }
40}