package hackerearth.OneDarray;

public class WaterStorage {
	 public static int trap(final int[] a) {
	        
	        int n = a.length;
	        int[] prefix = new int[n];// to find max hiegth in right side
	        prefix[n-1] = a[n-1];
	        for(int i = n-2;i >= 0;i--)
	        {
	            prefix[i] = Math.max(a[i],prefix[i+1]);
	        }
	        int lmax = 0,ans= 0;
	        for(int i = 0 ; i < n;i++)
	        {
	            lmax = Math.max(a[i],lmax);
	            ans += Math.min(lmax, prefix[i]) - a[i];
	            
	        }
	        return ans;
	    }

	
	public static void main(String args [])
	{
		int[] a = {0,3,4,0,3,2,1,3,};
		System.out.println(trap(a ));
	}

}
