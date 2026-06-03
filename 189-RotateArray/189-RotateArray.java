// Last updated: 03/06/2026, 11:10:49
1class Solution {
2    public void rotate(int[] nums, int k) {
3       int l=nums.length;
4       int[] temp=new int[l];
5       int m=k;
6       k%=l;
7       int j=0;
8
9       if(l!=1 &&  m!=0){
10       while((l-k)<l) {
11        temp[j]=nums[l-k];
12        j++;
13        k--;
14       }
15    
16    for(int i=0;i<(l-k);i++){
17        if (j<l){
18        temp[j]=nums[i];
19        j++;
20        }
21    }
22    for(int i=0;i<l;i++){
23        nums[i]=temp[i];
24    }
25    }
26}}
27