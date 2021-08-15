package scaler.Backtarcking;

import java.util.ArrayList;
import java.util.Arrays;

public class NQueens {
     
	public static ArrayList<ArrayList<Integer>> al = new ArrayList<>();
	public String[][] solveNQueens(int A) {
	    
	    
	    char ways[] = new char[A];
	    for(int i = 0;i < A;i++)
	    {
	        ways[i] = '.';
	    }
        
	    if(A==2 || A==3)
	        return new String[0][0];
        //Vcol[i] denotes queen is placed at ith row and Vcol[i] col;
        ArrayList<Integer> Vcol = new ArrayList<Integer>();
        int VisCol[] = new int[A] ; 
	    int[] rd = new int[2*A] ; // right diagonal
	    int[] ld = new int[2*A];
	    placeQueens(A,0,Vcol,VisCol,rd,ld);
        String[][] res = new String[al.size()][];
        int k = 0;
        for ( ArrayList<Integer> i : al) {
            String temp[] = new String[A];
            for (int j = 0; j < i.size(); j++) {
                temp[j] = new String(result(ways,i.get(j)));//here j is  jth queen or i.get(j) is col where queen is placed;
            }
            res[k++] = temp;
        }
	    return res;
	}
	public static void placeQueens(int n,int row,ArrayList<Integer> Vcol,int[] VisCol,int[] rd,int[] ld){
	    if(row==n){
            al.add(new ArrayList<>(Vcol));
	        return;
	    }
        for(int col = 0; col < n;col++)
	    {
	        if(VisCol[col]!=1 && rd[row-col+n-1] !=1 && ld[row + col] != 1)
	        {
	            VisCol[col] =1;
	            rd[row-col+n-1] = 1;
	            ld[row + col] = 1;
	            Vcol.add(col);
	            placeQueens(n,row+1,Vcol,VisCol,rd,ld);
	            Vcol.remove(row);
	            VisCol[col] =0;
	            rd[row-col+n-1] = 0;
	            ld[row + col] = 0;
	        }
	    }
	}
    public static char[] result(char[] str, int col)
    {
        char ret[] = Arrays.copyOf(str, str.length);
        ret[col] = 'Q';
        return ret;

    }
    public static void main(String[] args) {
        String res[][] =  new NQueens().solveNQueens(5);
        for(int i =0 ; i < res.length;i++)
        {
            for(int j = 0;j < res[i].length;j++)
            {
                System.out.print(res[i][j]);
            }
            System.out.println();
        }

    }
}
