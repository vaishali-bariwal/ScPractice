package bitManipulation;

public class DifferentBitsSumPairwise {
    
    public int cntBits(int[] A) {
       
        int n  = A.length;
        long sum = 0;
        long mod = 1000000007;
        for(int i = 0;i < 32;i++)
        {
            int zero = 0,one = 0;
           for(int j = 0; j < n;j++)
           {
               System.out.println(A[j]);
               if(((A[j]>>i) & 1)==1)
                    one++;
           }
           zero = n - one;    
          sum = (sum + zero * one * 2)%mod;
        }
        return (int)(sum % mod);
    }

    public static void main(String[] args) {
        int a[] = {2147483647,2147483646,2147483645};
        System.out.println("Max "+Integer.MAX_VALUE);
        System.out.println(new DifferentBitsSumPairwise().cntBits(a));
    }
}
