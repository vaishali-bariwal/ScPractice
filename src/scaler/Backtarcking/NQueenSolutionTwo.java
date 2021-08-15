package scaler.Backtarcking;

import java.util.ArrayList;

class Solution {
    public static ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();
	public ArrayList<ArrayList<String>> solveNQueens(int A) {
	    res.clear();
	    char ways[][] = new char[A][A];
	    for(int i = 0;i < A;i++)
	    {
	        for(int j =0; j <A;j++)
	        {
	         ways[i][j] = '.';
	        }
	    }
	    if(A==2 || A==3)
	        return new ArrayList<>();
      
        //ArrayList<Integer> Vcol = new ArrayList<Integer>();
        int VisCol[] = new int[A] ; 
	    int[] rd = new int[2*A] ; // right diagonal
	    int[] ld = new int[2*A];
	    placeQueens(A,0,ways,VisCol,rd,ld);
        
	    return res;
	}
	public static void placeQueens(int n,int row,char[][] ways,int[] VisCol,int[] rd,int[] ld){
	    if(row==n){
            res.add(creatWay(ways));
	        return;
	    }
        for(int col = 0; col < n;col++)
	    {
	        if(VisCol[col]!=1 && rd[row-col+n-1] !=1 && ld[row + col] != 1)
	        {
	            VisCol[col] =1;
	            rd[row-col+n-1] = 1;
	            ld[row + col] = 1;
	            ways[row][col] ='Q';
	            placeQueens(n,row+1,ways,VisCol,rd,ld);
	            ways[row][col] ='.';
	            VisCol[col] =0;
	            rd[row-col+n-1] = 0;
	            ld[row + col] = 0;
	        }
	    }
	}
    public static ArrayList<String> creatWay(char[][] ways)
    {
        ArrayList<String> ret = new ArrayList<String>();
        for(int i = 0;i < ways.length;i++)
	    {
	        String s = new String(ways[i]);
	        ret.add(s);
	    }
	    return ret;

    }
	
}
