// Last updated: 03/08/2026, 09:00:48
1class Solution {
2    public int jump(int[] nums) {
3        int ans = 0;   // number of minimum jumps taken
4        int end = 0;   // end of the current jump range 
5        int farthest = 0;  // farthest index we can reach from current level
6
7        // we stop at nums.length - 1 beacase once we reach or pass it, we're done
8
9        for(int i = 0; i < nums.length - 1; ++i){
10            // update the farthest reachable index from the current position
11            farthest = Math.max(farthest, i + nums[i]);
12
13            // If we can already reach or pass the last index,
14            // take one more jump and finish
15            if(farthest >= nums.length - 1){
16                ++ans;
17                break;
18            }
19
20            // when we've iterated through the current "level" (jump range),
21            // it's time to make next jump
22            if( i == end ){
23                ++ans; // increase the jump count
24                end = farthest; // update the boundry for the next level
25            }             
26        }
27        return ans;        
28    }
29}