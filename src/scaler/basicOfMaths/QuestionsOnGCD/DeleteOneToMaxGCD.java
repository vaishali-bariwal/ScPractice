package scaler.basicOfMaths.QuestionsOnGCD;
/**Given an integer array A of size N. You have to delete one element such that the GCD(Greatest common divisor) of the remaining array is maximum.

Find the maximum value of GCD.



Problem Constraints
2 <= N <= 105 
1 <= A[i] <= 109



Input Format
First argument is an integer array A.



Output Format
Return an integer denoting the maximum value of GCD.



Example Input
Input 1:

 A = [12, 15, 18]
Input 2:

 A = [5, 15, 30]


Example Output
Output 1:

 6
Output 2:

 15


Example Explanation
Explanation 1:

 
 If you delete 12, gcd will be 3.
 If you delete 15, gcd will be 6.
 If you delete 18, gcd will 3.
 Maximum vallue of gcd is 6.
Explanation 2:

 If you delete 5, gcd will be 15.
 If you delete 15, gcd will be 5.
 If you delete 30, gcd will be 5.
 */

class DeleteOneToMaxGCD{
    public static int solve(int[] a) {

        int n  = a.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = gcd(a[0], 0);
        for (int i = 1; i < a.length; i++) {
            prefix[i] = gcd(a[i], prefix[i-1]);
        }
        suffix[n-1] = gcd(a[n-1], 0);
        for(int i = n-2;i >= 0;i--)
        {
            suffix[i] = gcd(a[i], suffix[i+1]);
        }
        int max  = Math.max(suffix[1], prefix[n-1]);
        for (int i = 1; i < n-1; i++) {
            max = Math.max(max, gcd(prefix[i-1],suffix[i+1]));
        }
        return max;
    }
    public static int gcd(int a,int b) {
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        int a[] = {12, 15, 18};
        System.out.println(solve(a));
    }
}