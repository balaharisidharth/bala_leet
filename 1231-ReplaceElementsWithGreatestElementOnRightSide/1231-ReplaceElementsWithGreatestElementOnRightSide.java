// Last updated: 25/02/2026, 10:31:33
class Solution {
    public int[] replaceElements(int[] arr) {
      for(int i=0;i<arr.length;i++){
        int max=-1;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]>max) max=arr[j];
        }
        arr[i]=max;
      }  
      return arr;
    }
}