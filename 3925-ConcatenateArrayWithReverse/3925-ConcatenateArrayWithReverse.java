// Last updated: 03/06/2026, 11:45:44
1class Solution {
2    public int[] concatWithReverse(int[] nums) {
3        int n=nums.length;
4        int[] arr=new int[2*n];
5        int i;
6        for(i=0;i<n;i++){
7            arr[i]=nums[i];
8        }
9        if(i==n){
10            for(int j=n-1;j>=0;j--){
11                arr[i]=nums[j];
12                i++;
13            }
14        }
15        return arr;
16    }
17}