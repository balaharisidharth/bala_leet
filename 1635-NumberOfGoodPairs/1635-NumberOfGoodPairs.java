// Last updated: 25/02/2026, 10:31:25
class Solution {
    public int numIdenticalPairs(int[] guestList) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int ans = 0;
        
        for(int friend:guestList)
        {
            int friendCount = hm.getOrDefault(friend,0);
            ans+=friendCount;
            hm.put(friend,friendCount+1);
        }
        
        
        return ans;
    }
}