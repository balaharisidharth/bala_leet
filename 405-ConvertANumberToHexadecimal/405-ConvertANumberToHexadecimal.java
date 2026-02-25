// Last updated: 25/02/2026, 10:31:48
class Solution {
    public String toHex(int num) {
        char[] map={ '0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        int temp=0;
        if(num==0){
            return "0";
        }
         long n = num & 0xffffffffL;
        StringBuilder s=new StringBuilder();
        while(n>0){
            temp=(int)(n%16);
            s.append(map[temp]);
            n/=16;
        }
        return s.reverse().toString();
    }
}