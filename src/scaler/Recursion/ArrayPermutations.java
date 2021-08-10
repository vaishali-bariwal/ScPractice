package scaler.Recursion;

public class ArrayPermutations {
    public static int[][] ans;
    public static int index;
    public static int[][] permute(int[] a) {
        int n  = a.length;
        int m = fact(n);
        ans = new int[m][n];
        FindAllpermute(a,0,n-1);
        return ans;
        
    }
    public static void FindAllpermute(int[] a, int l, int r)
    {
        if (l == r){
            for (int i = 0; i < a.length; i++) {
                ans[index][i] = a[i]; 
            }
            index++;
        }
        else
        {
            for (int i = l; i <= r; i++)
            {
                int temp = a[i];
                a[i] = a[l];
                a[l] = temp;
                
                FindAllpermute(a, l+1, r);
                
                temp = a[i];
                a[i] = a[l];
                a[l] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {1};
        //[1 2 3 ] [1 3 2 ] [2 1 3 ] [2 3 1 ] [3 1 2 ] [3 2 1 ] 
        print(permute(a));

        
    }
    public static int fact(int n)
    {
        int fact = 1;
        for(int i = 2 ; i <= n;i++)
        {
            fact *= i;
        }
        return fact;
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
    public static void print(int a[]) {
        
        for (int i : a) {
            System.out.print(" "+i);
        }
        System.out.println();
    }
}
