package scaler.twoDArray;

 class antiDiagonal {
    public static int[][] diagonal(int[][] a) {
        
        int n = a.length ;
        n = n + (n-1);
        int[][] d = new int[n][];
        d[0] = new int[1];
        d[0][0] = a[0][0];
        for(int i = 1;i < n ;i++)
        {
            int k = 0;
            int m = i+1;
            if(i > n/2)
            {
            	m = n-i;
            	k =1;
            }System.out.println("inside "+i+" "+m);
            int temp[] = new int[m];
            for(int j = 0;j < m && k < m;j++)
            {
                temp[j] = a[k][i-j];
                System.out.println(temp[j] +" "+k+" "+(i-j));
                k++;
            }
            d[i] = temp;
            
        }
        return d;
    }
    
    public static void main(String[] args) {
		
    	int a[][] = {{1,2,3},
    				 {4,5,6},
    				 {7,8,9}};
    	print(diagonal(a));
    	
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
}

