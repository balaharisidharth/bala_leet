// Last updated: 03/06/2026, 10:50:24
1class Solution {
2    public void rotate(int[] nums, int k) {
3       int l=nums.length;
4       int[] temp=new int[l];
5       int m=k;
6       k%=l;
7       int j=0;
8       if(l!=1 &&  m!=0){
9       while((l-k)<l) {
10        temp[j]=nums[l-k];
11        j++;
12        k--;
13       }
14    
15    for(int i=0;i<(l-k);i++){
16        if (j<l){
17        temp[j]=nums[i];
18        j++;
19        }
20    }
21    for(int i=0;i<l;i++){
22        nums[i]=temp[i];
23    }
24    }
25}}