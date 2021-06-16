package hackerearth.OneDarray;

import java.util.*;

//Given an integer array, find if an integer p exists in the array such that the number of integers 
//greater than p in the array equals to p If such an integer is found return 1 else return -1.

public class NobleInteger {
	public static int solve(int[] a) {
	        
			int i ;
	        for( i = 0 ;i < a.length; i++)
	        {
	            if(a[i] < 0)
	            {
	                a[i] = -1 * a[i];
	            }
	        }
	         i = 0;
	         print(a);
	        Arrays.sort(a);
	        print(a);
	        for( i = 0 ;i < a.length-1; i++)
	        {
	            if(a[i]==a[i+1])
	            {
	                continue;
	            }
	            if(Math.abs(a[i])==(a.length-i-1))
	            {
	                return 1; 
	            }
	        }
	        
	        return -1;
	    }
	
	public static void main(String[] args) {
		
		int a[] =  {-1, -2, 0, 0, 0, -3 };
		int r = solve(a);
		System.out.println("****************RESULT************");
		System.out.println(r);
	}
	public static void print(int[] a) {
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
