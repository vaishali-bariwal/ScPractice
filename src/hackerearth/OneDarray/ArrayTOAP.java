package hackerearth.OneDarray;

import java.util.HashSet;

public class ArrayTOAP {
	
public static int solve(int[] a) {
        
        HashSet<Integer> hs = new HashSet<Integer>();
        int min1 = 1000000009,min2 = 1000000009;
        for(int i = 0; i < a.length;i++)
        {
            if(a[i]<min1)
            {
                min2 = min1;
            	min1 = a[i];
            }
            if(a[i]<min2 && a[i]!=min1)
            {
            	min2 = a[i];
            }
            hs.add(a[i]);
        }
        int d = min2-min1;
        if(hs.size() != a.length)
        {
            return 0;
        }
        System.out.println(min1+" : "+min2);
        for(int i = 0; i < a.length;i++)
        {
            if(!hs.contains(min1))
            {
               return 0 ;
            }
            min1 = min1 + d;
        }
        return 1;
    }
public static void main(String[] args) {
	
	int a[] =  {-97, -79, -88, -43, -61, -106, -52, -151, -115, -34, -142, -16, -124, -133, -25, -70 };
	int r = solve(a);
	System.out.println("****************RESULT************");
	System.out.println(r);
}
public static void print(int[] a) {
	for (int i : a) {
		System.out.print(i+" ");
	}
	System.out.println();
}


}
