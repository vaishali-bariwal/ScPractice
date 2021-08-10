package scaler.stringManipulation;

public class ClosestPalindrome {

	public static String solve(String A) {
		
		String res = "YES";
		int n = A.length();
		int count = 0;
		for(int i =0;i < n/2;i++)
		{
			if(A.charAt(i)!=A.charAt(n-i-1))
			{
				count++;
			}
			if(count > 1)
				return "NO";
		}
		return res;
    }
	public static void main(String args[])
	{
		String a = "adaddb";//abbba";// "adaddb"
		System.out.println(solve(a));
	}
}
