package scaler.twoDArray;

public class Sub_matrixSumQueries {
	
	 public static int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
		 int result[] = new int[B.length];
		 int[][] pre_sum = FindPrefixSumMatrix(A);
		 int q = B.length;
		 int tl_i,tl_j,br_i,br_j;
		 for(int i = 0;i < q;i++)
		 {
			 tl_i = B[i]-1; tl_j = C[i]-1;
			 br_i = D[i]-1; br_j = E[i]-1;
			 result[i] = pre_sum[br_i][br_j];
			 //(0,2) type top right
			 if(tl_i > 0)
				 result[i] -= pre_sum[tl_i-1][br_j];
			//(2,0) type top right
			 if(tl_j > 0)
				 result[i] -= pre_sum[br_i][tl_j-1];
			 //(0,0)  type top right
			 if(tl_i > 0 && tl_j > 0)
				 result[i]  += pre_sum[tl_i-1][tl_j-1];
			 
		 }
		 return result;
	   
	 
	 }

	private static int[][] FindPrefixSumMatrix(int[][] a) {
		
		int n = a.length;
		int m = a[0].length;
		int sum[][] = new int[n][m];
		
		for(int i = 0;i < n ; i++ )
		{
			for(int j = 0; j < m;j++)
			{
				sum[i][j] = a[i][j];
			}
		}
		
		//rowwise sum
		for(int i = 0;i < n ; i++ )
		{
			for(int j = 1; j < m;j++)
			{
				sum[i][j] = sum[i][j-1] + a[i][j];
			}
		}
		
		// columwise sum
		for(int i = 1;i < n ; i++ )
		{
			for(int j = 0; j < m;j++)
			{
				sum[i][j] = sum[i-1][j] + sum[i][j];
			}
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		int a[][] = {{999998990 , 999998990 , 99999890 , 999923990 },{0, 999999169 , 2, 999999169}};
		int b[] = {1, 1};
		int c[] = {1, 4};
		int d[] = {2, 2};
		int e[] = {2, 4};
		int r[]=solve(a,b,c,d,e);
		for(int i : r)
		{
			System.out.print(i+" ");
		}
	}
	
	public static void print(int[][] a)
    {
    	int m = a.length;
    	for(int i = 0;i < m;i++)
        {
            for(int j = 0;j<m;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }


}
