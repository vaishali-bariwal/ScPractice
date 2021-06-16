package scaler.twoDArray;

public class Krotation {

    public static int[][] solve(int[] a, int[] b) {
	        
	        int n = a.length;
	        int r[][] = new int[b.length][a.length];
	        for(int i = 0;i < b.length;i++)
	        {
	      
	        	System.out.println("n "+ n+"b[i] = "+b[i]+" b[i]%n "+b[i]%n);
	        	b[i] = b[i]%n;
	        	
	        	for(int j =0 ;j < a.length;j++)
	        	{
	        		r[i][j] = a[j];
	        	}
	        	if(b[i]==0) {
	        		continue;
	        	}
	        	//for k  rotation reverse full array first
	        	for(int j = 0; j < n/2;j++)
	        	{
	        		int swap = r[i][j];
	        		r[i][j] = r[i][n-j-1];
	        		r[i][n-j-1] = swap;
	        	}
	        	//System.out.println("revers all for "+b[i]);
	        	//print(r[i]);
	        	//reverse first k elements
	        	for(int j = 0; j < (n-b[i])/2;j++)
	        	{
	        		int swap = r[i][j];
	        		r[i][j] = r[i][n-b[i]-j-1];
	        		r[i][n-b[i]-j-1] = swap;
	        	}
//        	System.out.println("revers first n- k element");
//	        	print(r[i]);
	        	//then reveser remaining n-k elements and it will give final answer
	        	int l = n-b[i] ,rt = n;
	        	for(int j = l; j < (l+rt)/2;j++)
	        	{
	        		System.out.println((l+rt)/2 +"|| j : "+j+" || rt+l-j-1 :"+(rt+l-j-1));
	        		int swap = r[i][j];
	        		r[i][j] = r[i][rt+l-j-1];
	        		r[i][rt+l-j-1] = swap;
	        		
	        	}
//	        	System.out.println("revers remaing -k ");
//	        	print(r[i]);
	        	
	    
	        }
	        return r;
	        
    }
    

public static void main(String[] args) {
	int a[] = { 1, 2, 3, 4, 5};
		//{6, 31, 33, 13, 82, 66, 9, 12, 69, 21, 17, 2, 50, 69, 90, 71, 31, 1, 13, 70, 94, 46, 89, 13, 55, 54, 67, 97, 28, 27, 62, 34, 41, 18, 15, 35, 13, 84, 93, 27, 89, 23, 6, 56, 94, 40, 54, 95, 47  };
    int b[] = {2,3};
//{88, 85, 98, 36, 66, 40, 30, 26, 51, 77, 62, 60, 92, 64, 53, 86, 24, 53, 85, 49, 57, 29, 32, 60, 75, 82, 17, 23, 67, 51, 23, 11, 70, 59 };
	int r [][] = solve(a,b);
	print(r);
	
}
public static void print(int[][] a)
{
	int m = a.length;
	for(int i = 0;i < m;i++)
    {
        for(int j = 0;j<a[i].length;j++)
        {
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
}
public static void print(int[] a) {
	for (int i : a) {
		System.out.print(i+" ");
	}
	System.out.println();
}

}
