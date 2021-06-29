package hackerearth.binarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

import javax.swing.Spring;

class max_border {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String name = br.readLine();
        int t = Integer.parseInt(name);
        while(t-- > 0){
           String[] arr = br.readLine().split(" "); 
           int n  = Integer.parseInt(arr[0]);
           int m  = Integer.parseInt(arr[1]);
           char[][] matr = new char[n][m];
           String sumf="",sumr="";
           int max = 0;
           for(int i = 0;i < n;i++)
            {
             int count = 0;   
             String str = br.readLine(); 
             for(int j = 0;j <m;j++)
             {
            	 // check if 1st row and last row have mac border
                 if((i==0 || i==n-1) && str.charAt(j)=='#'){
                    count++;
                   }
                 max = Math.max(count,max);
                 matr[i][j] = str.charAt(j);
                 //save row numbers having # value in edges
                 if(j==0 &&str.charAt(j)=='#') {
                	 sumf = sumf+ i;
                 }
                 else if(j==m-1 &&str.charAt(j)=='#') {
                	 sumr = sumr+ i;
                 }
             }
             max = Math.max(count,max);
             
            }
           
           int j=0;
           while( j < sumf.length() )//&& k >=0 && j < m)
           {
        	   int count=0;
        	   int row = Character.getNumericValue(sumf.charAt(j));
        	   j++;
        	   for(int i = 0 ;i < m;i++ )
        	   {
        		   if(matr[row][i]=='#')
        		   {
        			   count++;
        		   }
        		   else {
        			   break;
        		   }
        	   }
        		   
        	   max = Math.max(count,max);
           }
           j=0;
           while( j < sumr.length() )//&& k >=0 && j < m)
           {
        	   int count=0;
        	   int row = Character.getNumericValue(sumf.charAt(j));
        	   j++;
        	   for(int i = m-1 ;i >= 0;i-- )
        	   {
        		   if(matr[row][i]=='#')
        		   {
        			   count++;
        		   }
        		   else {
        			   break;
        		   }
        	   }
        		   
        	   max = Math.max(count,max);
           }
           System.out.println(max);

        }
        
        
        
    }
}

