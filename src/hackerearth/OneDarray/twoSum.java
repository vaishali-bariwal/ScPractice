package hackerearth.OneDarray;

import java.util.HashMap;

public class twoSum {
	
public static int[] twoSum(final int[] a, int b) {
        
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int sum = b;
        int[] r = new int[0] ;
        for(int i = 0;i < a.length; i++)
        {
        	int temp = sum - a[i];
        	 
            // checking for condition
            if (hm.containsKey(temp)) {
            	//System.out.println(temp);
            	int[] t = new int[2];
                t[0] = hm.get(temp) +1;
                t[1] = i+1;
                return t;
            }
            
            if(hm.containsKey(a[i]))
            {
            	int t = hm.get(a[i]);
            	hm.put(a[i], Math.min(i, t));
            	
            }
            else {
            	hm.put(a[i],i);
            }
        }
        	
       
        return r;

	}
public static void main(String[] args) {
	int a[] = {  4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8 };
	int r [] = twoSum(a,-3);
	System.out.println("****************RESULT************");
	for(int i : r)
	{
		System.out.print(i +" ");
	}
}
}
