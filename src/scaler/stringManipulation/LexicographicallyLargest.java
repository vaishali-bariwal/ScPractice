package scaler.stringManipulation;

import java.util.Arrays;

public class LexicographicallyLargest {
	public static String getLargest(String A) {
			
			String res;
			String str[] = A.split("_");
			String s = str[0];
			int n = s.length();
			char t[] = str[1].toCharArray();
			Arrays.sort(t);
			for(char c : t)
			{
				System.out.println(c);
			}
			StringBuilder sb = new StringBuilder();
			int i,j=0,m = t.length;
			j = m-1;
			for( i =0;i < n && j >=  0  ;i++)
			{
				if(A.charAt(i) -'a' < t[j]-'a')
				{
					sb.append(t[j]);
					j--;
				}
				else
					sb.append(A.charAt(i));
					
			}
			if(i < n)
				sb.append(s.substring(i));
			return sb.toString();
	    }
	public static void main(String args[])
	{
		String a = "ittmcsvmoa_jktvvblefw";//abbba";// "adaddb"
		System.out.println(getLargest(a));
	}

}
