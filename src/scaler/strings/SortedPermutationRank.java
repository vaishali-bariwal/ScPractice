package scaler.strings;

import java.util.Arrays;

public class SortedPermutationRank {
	public static int findRank(String s) {
		
		long res = 0;
		long fact[] = new long[27];
		/*
		 * fact[0]= 1;fact[1]=1; for (int i = 2; i < 27; i++) {
		 * 
		 * fact[i] = fact[i-1] * i; }
		 */

		int i = 0;
		int n = s.length();
		int alpha[] = new int[125];
		for(int k =0;k < n;k++)
		{
			alpha[s.charAt(k)-0] = 1;
		}
		
		while(i < n)
		{
			int count = 0;
			for(int j = 0;j <125;j++) {
				if(j==(s.charAt(i)-0)) {
					alpha[j] = 0;
					break;
				}
				if(alpha[j]==1)
				{
					count++;	
				}
			}
			long temp = count;
			if(count!=0)
			{
			    for(int j=1 ;j <= n-i-1;j++)
			    {
			        temp = (temp *j)% 1000003;
			        System.out.println(temp);
			    }
			}
			//System.out.println(s.charAt(i)+" "+count+" "+(n-i-1)+" fact[n-i-1] "+ fact[n-i-1]);
			//res += (int) (count * fact[n-i-1]% 1000003);
			System.out.println("TEMP "+temp+" COUNT "+count);
			res=(res+temp) % 1000003;
			i++;
		}
		
		return (int)(res+1)% 1000003;
    }
	public static void main(String[] args) {
		String a = "VIEW";
		System.out.println(findRank(a));
	}

}
