// Last updated: 13/06/2026, 16:20:28
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> neighbors;
6    public Node() {
7        val = 0;
8        neighbors = new ArrayList<Node>();
9    }
10    public Node(int _val) {
11        val = _val;
12        neighbors = new ArrayList<Node>();
13    }
14    public Node(int _val, ArrayList<Node> _neighbors) {
15        val = _val;
16        neighbors = _neighbors;
17    }
18}
19*/
20
21class Solution {
22    private Map<Node, Node> clonedNodes = new HashMap<>();
23
24    public Node cloneGraph(Node node) {
25        if (node == null)
26            return null;
27
28        // If the node has already been cloned, return the cloned node
29        if (clonedNodes.containsKey(node)) {
30            return clonedNodes.get(node);
31        }
32
33        // Clone the node (without neighbors initially)
34        Node clonedNode = new Node(node.val);
35        clonedNodes.put(node, clonedNode);
36
37        // Clone the neighbors recursively
38        for (Node neighbor : node.neighbors) {
39            clonedNode.neighbors.add(cloneGraph(neighbor));
40        }
41
42        return clonedNode;
43    }
44}