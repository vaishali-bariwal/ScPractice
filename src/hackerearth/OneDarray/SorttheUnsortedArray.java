package hackerearth.OneDarray;

import java.util.Arrays;

public class SorttheUnsortedArray {
	
	public static int solve(int[] a) {
	        
	        int n = a.length;
	        int b[] = new int[n];
	        for(int i = 0 ; i < n;i++)
	        	b[i] = a[i];
	        Arrays.sort(b);
	        int start =0,end=0;
	        for(int i = 0 ; i < n;i++)
	        {
	            if(a[i]!=b[i])
	            {
	                start = i;
	                break;
	            }
	        }
	        for(int i = n-1; i >= 0;i--)
	        {
	           if(a[i]!=b[i])
	            {
	                end = i;
	                System.out.println(i);
	                break;
	            } 
	        }
	        return end==0&&start==0 ? 0:(end - start +1);
	    }
	public static void main(String[] args) {
		
		int a[] = {-355071087, -679308132, 398052175, 755454983, 814022370, 889267058};
		System.out.println(solve(a));
	}
}
