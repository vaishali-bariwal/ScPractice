package bitManipulation;
//count number of bits from 1 to A
public class test {
    public int solve(int A) {
        int tot = 0;
        if(A<=0)
        {
            return 0;
        }
        int x = 0;
        while((int)Math.pow(2,x) - 1 <= A)
        {
            x++;
        }
        x--;
        tot = (((int)Math.pow(2,x)/ 2) * x) + (A + 1- (int)Math.pow(2,x)) + solve(A - (int)Math.pow(2,x));
        
        return (tot % 1000000007);
    }
}
