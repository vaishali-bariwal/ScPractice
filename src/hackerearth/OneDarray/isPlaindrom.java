package hackerearth.OneDarray;

public class isPlaindrom {
	public static int isPalindrome(int n) {
        int rn = n;
        long reverse = 0;
        while(rn > 0)
        {
            reverse = reverse*10 + (rn%10);
           // System.out.println(reverse);
            rn = rn/10;
        }
        //System.out.println(reverse);
        if(n ==reverse) {
            return 1;
        }
        else 
        {
            return 0;}
    }
	public static void main(String[] args) {
		
		int a = 2147447412;
		int r  = isPalindrome(a);
		System.out.println("****************RESULT************");
		System.out.println(r);
	}

}
