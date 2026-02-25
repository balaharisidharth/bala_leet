// Last updated: 25/02/2026, 10:31:19
class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            sb.append(s.charAt(i)-96);
        }
        for(int i=0;i<sb.length();i++){
            sum+=((sb.charAt(i))-'0');
        }
        k--;
        while(k!=0){
            int num=sum;
            sum=0;
            while(num!=0){
                int a=num%10;
                sum+=a;
                num/=10;
            }
            k--;
        }
        return sum;
    }
}