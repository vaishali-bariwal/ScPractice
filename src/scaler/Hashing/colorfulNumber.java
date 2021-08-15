package scaler.Hashing;

import java.util.ArrayList;
import java.util.HashSet;

class colorfulNumber{
public int colorful(int A) {
        HashSet<Integer> hm = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();
        while(A > 0)
        {
            al.add(A%10);
            A /= 10;
        }
        for(int i = 0; i < al.size();i++)
        {
            int prod = 1;
            for(int j = i ;j < al.size();j++)
            {
                prod *= al.get(j);
                //System.out.println(prod);
                if(hm.contains(prod))
                    return 0;
                hm.add(prod);
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        
        System.out.println(new colorfulNumber().colorful(123));
    }
}