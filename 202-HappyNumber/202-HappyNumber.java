// Last updated: 25/02/2026, 10:32:04
class Solution{
     public static int SumofSquares(int n){
		int sum=0;
		while(n!=0){
			int d=n%10;
			sum+=(d*d);
			n/=10;
		}
		return sum;
     }
     public Boolean isHappy(int n ) {
		int slow=n;
		int fast=n;
		do{
		slow=SumofSquares(slow);
		fast=SumofSquares(SumofSquares(fast));
		}while(slow!=fast);
		return slow==1?true:false;
	}
}