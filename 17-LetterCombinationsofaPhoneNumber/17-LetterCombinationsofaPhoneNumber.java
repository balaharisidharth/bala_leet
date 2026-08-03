// Last updated: 03/08/2026, 08:51:04
1class Solution {
2    public List<String> letterCombinations(String digits) {
3        if (digits.isEmpty()) return Collections.emptyList();
4
5        String[] phone_map = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
6        List<String> output = new ArrayList<>();
7        backtrack("", digits, phone_map, output);
8        return output;
9    }
10
11    private void backtrack(String combination, String next_digits, String[] phone_map, List<String> output) {
12        if (next_digits.isEmpty()) {
13            output.add(combination);
14        } else {
15            String letters = phone_map[next_digits.charAt(0) - '2'];
16            for (char letter : letters.toCharArray()) {
17                backtrack(combination + letter, next_digits.substring(1), phone_map, output);
18            }
19        }
20    }
21}