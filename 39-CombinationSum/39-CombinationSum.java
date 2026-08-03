// Last updated: 03/08/2026, 09:02:27
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String, List<String>> map = new HashMap<>();
4
5        for (String word : strs) {
6            char[] chars = word.toCharArray();
7            Arrays.sort(chars);
8            String key = new String(chars);
9
10            List<String> group = map.getOrDefault(key, new ArrayList<>());
11            group.add(word);
12            map.put(key, group);
13        }
14
15        return new ArrayList<>(map.values());
16    }
17}