// Last updated: 03/08/2026, 09:25:45
1class Solution {
2    public String simplifyPath(String path) {
3        Deque<String> dir_stack = new ArrayDeque<>();
4        for (String dir : path.split("/")) {
5            if (!dir_stack.isEmpty() && dir.equals("..")) {
6                dir_stack.removeLast();
7            } else if (!dir.equals(".") && !dir.equals("") && !dir.equals("..")) {
8                dir_stack.addLast(dir);
9            }
10        }
11        StringBuilder simplified_path = new StringBuilder();
12        for (String dir : dir_stack) {
13            simplified_path.append("/").append(dir);
14        }
15        return simplified_path.length() == 0 ? "/" : simplified_path.toString();
16    }
17}