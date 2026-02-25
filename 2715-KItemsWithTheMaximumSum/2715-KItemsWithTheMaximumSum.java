// Last updated: 25/02/2026, 10:30:59
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int c=0;
        if (k<=numOnes){
            return k;
        }
        else if((numOnes+numZeros)>=k){
            return numOnes;
        }
        else if ((numOnes+numZeros+numNegOnes)>=k){
            c=k-(numOnes+numZeros);
            return numOnes-c;
        }
        return 0;
    }
}