package hackerearth.OneDarray;

import java.util.HashMap;
import java.util.HashSet;

public class CommonElements {
	
	private static int[] commonElements(int[] a, int[] b) {
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		int n = a.length, m = b.length;
		for(int i = 0;i < a.length;i++)
		{
		    if(hm.containsKey(a[i])) {
		    	int c  = hm.get(a[i]);
		    	c++;
		    	hm.put(a[i], c);
		    }
		    else 
		    {
		    	hm.put(a[i], 1);
		    }
			
		}
		HashMap<Integer,Integer> ans = new HashMap<Integer,Integer>();
		
		for(int i = 0;i < b.length;i++)
		{
		    if(hm.containsKey(b[i])) {
		    	
		    	int c = hm.get(b[i]);
		    	if(ans.containsKey(b[i])) {
		    	
		    		c = Math.min(ans.get(b[i]), c);
		    		ans.put(b[i], c);
		    	}
		    	else
		    		{
		    		ans.put(b[i], 1);
		    		}
		    }
			
		}
		return null;
	}
	public static void main(String[] args) {
		int a[] = {  4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9 };
		int b[] = {7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8};
		int r [] = commonElements(a,b);
		System.out.println("****************RESULT************");
		for(int i : r)
		{
			System.out.print(i +" ");
		}
	}

	
}
