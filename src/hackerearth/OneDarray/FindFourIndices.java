package hackerearth.OneDarray;

import java.util.ArrayList;
import java.util.HashMap;

public class FindFourIndices {
	public static int[] equal(int[] a) {
	        
	        int sum = 0;
	        int n = a.length;
	        HashMap<Integer,ArrayList<Integer>> hm = new HashMap<Integer,ArrayList<Integer>>();
	        int[] ans = new int[0] ;int result = 0;
	        for(int i = 0;i < n;i++)
	        {
	            for(int j = i+1; j < n;j++)
	            {
	                sum = a[i]+a[j];
	                if(!hm.containsKey(sum))
	                {
	                	//System.out.println("sum "+sum +"|| int[]"+i+","+j);
	                   ArrayList<Integer> al = new ArrayList<Integer>();
	                   al.add(i);al.add(j);
	                   hm.put(sum,al);
	                }
	                else
	                {
	                	
	                	ArrayList<Integer> al = hm.get(sum);
	                	
	                    if (al.get(0) < i && al.get(1) != i && al.get(1) != j)
	                    {
	                              int r[] = new int[4];
	                              r[0] = al.get(0);
	                              r[1] = al.get(1);
	                              r[2] = i;
	                              r[3] = j;
	                              
	                              if (ans.length == 0)
	                                  ans = r;
	                              else
	                              {
	                                  for (int t = 0; t<ans.length; ++t)
	                                  {
	                                      if (ans[t] < r[t])
	                                          break;
	                                      if (ans[t] > r[t])
	                                      {
	                                          ans = r;
	                                          break;
	                                      }
	                                  }
	                    
	                              }
	                    }
	                
	            }
	            }
	        }
	       if(ans.length!= 0) { return ans;}
	        
	       else {
	    	   return new int[0];
	       }
	       
    }
	public static void main(String[] args) {
		int a[] = {3, 4, 7, 1, 2, 9, 8};
	    int r [] = equal(a);
		
		System.out.println("****************RESULT : [0, 2, 3, 5]************");
		for(int i : r)
		{
			System.out.print(i +" ");
		}
	}

}
