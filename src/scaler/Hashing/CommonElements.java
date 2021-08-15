package scaler.Hashing;

import java.util.HashMap;

public class CommonElements {
    
    public int[] solve(int[] a, int[] b) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> res = new HashMap<Integer,Integer>();
	    for(int i=0;i<a.length;i++){
	        if(hm.containsKey(a[i]))
	        {
	            hm.put(a[i],hm.get(a[i])+1);
	        }
	        else
	        {
	            hm.put(a[i],1);
	        }
	    }
        for (int i : hm.keySet()) {
            System.out.println(i+" "+hm.get(i));
        }
        System.out.println("res map ===");
	    int count = 0;
	    for(int i=0;i<b.length;i++)
	    {
	        if(hm.containsKey(b[i]))
	        {
	            int fre = 0;
	            if(res.containsKey(b[i]))
	            {
	                fre = Math.min(res.get(b[i])+1,hm.get(b[i]));
	                res.put(b[i],fre);
	            }
	            else
	            {
	                res.put(b[i],1);
	            }
	        }
	            
	    }
        for (int i : res.keySet()) {
            count += res.get(i);
        }
        System.out.println(count);
	    int[] ans = new int[count];
	    int i = 0;
	    for(int key : res.keySet())
	    {
            for(int j  =0 ; j < res.get(key);j++)
	        {
	            ans[i++] = key;
	        }
	    }
	   
	    return ans;
    }
    public static void main(String[] args) {
        int A [] = {2, 1, 4, 10};
        int B [] = {3, 6, 2, 10, 10};
        int[] res = new CommonElements().solve(A, B);
        for (int i : res) {
            System.out.print(i);
        }
        System.out.println();
    }
}
