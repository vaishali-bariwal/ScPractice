package hackerearth.OneDarray;

public class PickFromBothEnd {
	
	public static int solve(int[] a, int b) {
		
		int max = Integer.MIN_VALUE;
		int sum  = 0;
		for (int i = 0; i <b; i++) {
			sum += a[i];
		}
		max = Math.max(max, sum);
		int n = a.length;
		//System.out.println(sum);
		int x = b-1, y = 1;
		while(x >= 0 && y < n)
		{
			sum = sum - a[x] + a[n-y];
			///System.out.println(sum+"  "+x+" "+y);
			max = Math.max(max, sum);
			x--;y++;
		}
		return max ;
		
    }
	public static void main(String[] args) {
		int a[] = {5, -2, 3 , 1, 2};
		int  b = 3;
		System.out.println(solve(a,b));
	}

}
