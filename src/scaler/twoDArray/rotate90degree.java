package scaler.twoDArray;

/*
problem Statement:
	Rotate Matrix
	Problem Description

	You are given a n x n 2D matrix A representing an image.

	Rotate the image by 90 degrees (clockwise).

	You need to do this in place.

	Note: If you end up using an additional array, you will only receive partial score.



	Problem Constraints
	1 <= n <= 1000



	Input Format
	First argument is a 2D matrix A of integers



	Output Format
	Return the 2D rotated matrix.



	Example Input
	Input 1:

	 [
	    [1, 2],
	    [3, 4]
	 ]
	Input 2:

	 [
	    [1]
	 ]


	Example Output
	Output 1:

	 [
	    [3, 1],
	    [4, 2]
	 ]
	Output 2:

	 [
	    [1]
	 ]


	Example Explanation
	Explanation 1:

	 After rotating the matrix by 90 degree:
	 1 goes to 2, 2 goes to 4
	 4 goes to 3, 3 goes to 1

*/
public class rotate90degree {
    public static int[][] solve(int[][] a) {
        
        int m = a.length;
        for(int i = 0;i < m;i++)
        {
            for(int j = i+1;j<m;j++)
            {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
		
        for(int i = 0;i < m;i++)
        {
            for(int j = 0;j<m/2;j++)
            {
                int temp = a[i][j];
                a[i][j] = a[i][m-j-1];
                a[i][m-j-1] = temp;
            }
            
        }
        return a;
        
    }
    
    public static void main(String[] args) {
		
    	int[][] a = {{1, 2},
    		    {3, 4}};
    	System.out.println("Rotated by 90 degree");
    	print(solve(a));
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
/* accepted solution in scalar
 public class Solution {
    public int solve(int A) {
        long N = A + 1, mod = 1000*1000*1000 + 7;
        long ans = 0, pow2 = 1;
        for(int i = 0; i < 32; i++) {
            ans += ((N / (pow2 << 1)) * pow2)%mod + Math.max(0, N % (pow2 << 1) - pow2);
            ans %= mod;
            pow2 <<= 1;
        }
        return (int)ans;
    }
}
 */

