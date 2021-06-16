package hackerearth.OneDarray;

import java.util.ArrayList;

public class onePlus {
    public static int[] plusOne(int[] a) {
        
    	int n = a.length;
    	ArrayList<Integer> al = new ArrayList<Integer>();
        int temp = a[n-1] +1;
        int carry = temp / 10;
        al.add(temp % 10);
        for (int i = n-2;i  >= 0;i--) 
        {
        	if (carry == 1)
            {
        		 temp = a[i] +1;
        	     carry = temp / 10;
        	     al.add(temp % 10);
            }
        	else
        	{
        		al.add(a[i]);
        	}   
        }
        if (carry == 1)
        {
        	al.add(1);
        }
        boolean isZero = false;
        for(int i= al.size()- 1; i >= 0;i--)
        {
        	
        	if(al.get(i)==0 && !isZero)
        	{
        		al.remove(i);
        	}
        	else
        	{
        		isZero = true;
        	}
        }
//        for (Integer i : al) {
//        	System.out.println(i);
//			
//		}
       int s = al.size();     
       int[] r = new int[s];
       for(int i = 0;i < r.length;i++ )
       {
    	   r[i] = al.get(s-1-i);
       }
       return r;
        
    }
    public static void main(String[] args) {
		int a[] = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
		int r [] = plusOne(a);
		System.out.println("****************RESULT************");
		for(int i : r)
		{
			System.out.print(i +" ");
		}
	}
    
}

