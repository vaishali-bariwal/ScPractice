package bitManipulation;

public class try1 {
    public int solve(int A) {
        
        //to find 1s complement fist find number bit and then (1<< no of bits - 1) and Xor it 
        //ori
        
        int number_of_bits =
               (int)(Math.floor(Math.log(A) /
                             Math.log(2))) + 1;
        int x = ((1 << number_of_bits) - 1) ^  A;
        int y = 1;
        int i = 1;
        while(y <= A )
        {
            y = 1<<i;
            i++;
        }
        int ans = x^y;
        return ans;
        
    }
    public static void main(String[] args) {
        
        System.out.println(new try1().solve(5));
    }
    
}
