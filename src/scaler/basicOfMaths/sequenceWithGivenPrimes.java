package scaler.basicOfMaths;

public class sequenceWithGivenPrimes {
	
public static int[] solve(int A, int B, int C, int D) {
        
        int res[] = new int[D];
        int p[]  = new int[3];
        p[0]=-1;p[1]=-1;p[2]=-1;
        
        for(int i = 0;i < D;i++)
        {
            int min = 0,p1,p2,p3;
            p1 = p[0]==-1? 1 * A : res[p[0]] * A ;
            p2 = p[1]==-1? 1 * B : res[p[1]] * B ;
            p3 = p[2]==-1? 1 * C : res[p[2]] * C ;
            min = Math.min(p1,Math.min(p2,p3));
            if(min == p1)
            {
                p[0]++;
            }
            if(min == p2)
            {
                p[1]++;
            }
            if(min == p3)
            {
                p[2]++;
            }
            res[i] = min;
            
        }
        return res;
        
    }

	public static void main(String[] args) {
		int A = 773;
		int B = 787;
		int C = 797;
		int D = 3;
		int r[] = solve(A, B, C, D);
		for(int i : r)
		{
			System.out.print(i+" ");
		}
	}
}
