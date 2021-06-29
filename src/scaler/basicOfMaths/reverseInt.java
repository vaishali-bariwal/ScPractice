package scaler.basicOfMaths;

public class reverseInt {
	public static int reverse(int n) {
	    
		boolean isNegative = n < 0 ;
	       n = isNegative ? n*-1:n;
	       int sum = 0,prev_sum=0;
	       while(n>0)
	       {
	    	   sum = sum *10 + n%10;
	    	   if((sum - n%10)/10 != prev_sum)
	    	   {
	    	       return 0;
	    	   }
	    	   n = n /10;
	    	   prev_sum = sum;
	       }
	       if(isNegative)
	    	   return -1 * sum;
	       return sum;
	    }

	public static void main(String[] args) {
		
		int  a = -1146467285;
		System.out.println(reverse(a));
	}
}
