// Last updated: 04/06/2026, 11:09:40
1class Solution {
2    public int maximumUnits(int[][] boxTypes, int truckSize) {
3        int sum=0;
4        int size=0;
5        	   for(int i=0;i<boxTypes.length;i++){
6	       for(int j=i+1;j<boxTypes.length;j++){
7	           if(boxTypes[j][1]>boxTypes[i][1]){
8	               int[] temp=boxTypes[i];
9	               boxTypes[i]=boxTypes[j];
10	               boxTypes[j]=temp;
11	           }
12	       }
13	   }
14    for(int i=0;i<boxTypes.length;i++){
15
16        for(int j=0;j<boxTypes[i][0];j++){
17
18        if(truckSize==0){
19            break;
20        }
21
22        sum += boxTypes[i][1];
23        truckSize--;
24        }
25
26        }
27        return sum;
28        }
29    //     	   for(int k=0;k<boxTypes.length;k++){
30	//        for(int m=0;m<boxTypes[k].length;m++){
31	//            System.out.print(boxTypes[k][m]+" ");
32	//        }
33	//            System.out.println(" ");
34	       
35	//    }
36
37    }