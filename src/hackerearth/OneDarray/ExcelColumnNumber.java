package hackerearth.OneDarray;

public class ExcelColumnNumber {
	public static int titleToNumber(String s) {
		
		int b = 1;
		int sum  = 0;
		int n = s.length();
		while(n > 0)
		{
			sum =sum + baseValue(s.charAt(n-1)) * b;
			n--;
			b *= 26;
		}
		return sum;
		
    }
	public static int baseValue(char c)
	{
		int a = c - 65;
		return a+1;
	}

public static void main(String[] args) {
		
		String a = "ABCD";
		int r = titleToNumber(a);
		System.out.println("****************RESULT************");
		System.out.println(r);
	}
}
