package hackerearth.OneDarray;

public class MinimumDifferencePuzzle {
	public static int solve(int[] a, int b) {
	        
	        int n  = a.length;
	        int min = 1000001 ,min2 = 1000001, max = 0,max2=0;
	        int max_i = 0, min_i;
	        for(int i = 0 ; i < b;i++)
	        {
	            if(max < a[i])
	            {
	            	max2 = i-1;
	            	max_i = i;
	            	max = a[i];
	            	
	            }
	            if(min > a[i])
	            {
	            	min2 = i-1;
	            	min_i = i;
	            	min = a[i];
	            }
	            
	        }
	        for(int i = b;i < n;i++)
	        {
	        	
	        }
	        System.out.println(min +" "+min2+" "+max+" "+max2);
	        
	        return max - min;
	}
	public static void main(String[] args) {
		int a[] = {10, 12, 10, 7, 5, 22};
		int b  = 4;
		System.out.println(solve(a,b));
	}
        

}
