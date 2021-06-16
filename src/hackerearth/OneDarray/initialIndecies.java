package hackerearth.OneDarray;

public class initialIndecies {
	public int[] solve(int[] a) {
        int n = a.length;
        int r[] = new int[n-1];
        for(int i = 0; i < n-1 ;i++ )
        {
        	int min = a[i];
        	int loc = i;
        	for(int j = i+1;j < n;j++)
        	{
        		if(a[j]< min)
        		{
        			min = a[j];
        			loc = j;
        		}
        	}
        	int temp = a[i];
        	a[i] = a[loc];
        	a[loc] = temp;
        	r[i] = loc;
        }
        //r[n-1] = n-1;
	        return r;
    }

}
