package hackerearth.OneDarray;

public class BthMinimumElemnet {
	
	public static int  kthsmallest(final int[] a, int B) {
	        
	        int n = a.length;
	        for(int i = 0; i < B ;i++ )
	        {
	        	int loc = i;
	        	for(int j = i+1;j < n;j++)
	        	{
	        		if(a[j]< a[loc])
	        		{
	        			loc = j;
	        		}
	        	}
	        	int temp = a[i];
	        	a[i] = a[loc];
	        	a[loc] = temp;
	        }
	        print(a);
	        return a[B-1];
	    }

	public static void main(String[] args) {
		int a[] =  {  8, 16, 80, 55, 32, 8, 38, 40, 65, 18, 15, 45, 50, 38, 54, 52, 23, 74, 81, 42, 28, 16, 66, 35, 91, 36, 44, 9, 85, 58, 59, 49, 75, 20, 87, 60, 17, 11, 39, 62, 20, 17, 46, 26, 81, 92};
		int r = kthsmallest(a,9);
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
