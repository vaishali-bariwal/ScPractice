package scaler.basicOfMaths;

class PairSumWhichdivisibleByK
{
    public static int solve(int[] A, int B) {

        int ans  = 0;
        int rem[] = new int[B];
        for (int i = 0; i < A.length; i++) {
            int r = A[i] % B;
            int rem_i = (B -r )%B;
            ans += rem[rem_i];
            rem[r]++;
            //print(rem);

        }
        return ans;

    }
    public static void main(String[] args) {
        int a[] = {5, 17, 100, 11 };
        int k = 28;
        System.out.println(solve(a, k));
        /*here the basic logic 
        (a+b)%k = 0;
        => a%k + b%k = k%k
        => b%k = k%k-a%k
        => b = (k-a%k)
        */

    }
    public static void print(int[] a) {
        for (int i : a) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}