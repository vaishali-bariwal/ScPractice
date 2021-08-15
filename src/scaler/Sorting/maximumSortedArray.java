package scaler.Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class maximumSortedArray {
    
    public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        ArrayList<Integer> B = new ArrayList<>(A);
        Collections.sort(B);
        print(A);
        print(B);
        for(int i = 0;i < A.size();i++)
        {
            if(A.get(i) != B.get(i)){
                res.add(i);
            }
        }
        
        if(res.size() == 0)
        {
            res.add(-1);
            return res;
        }
        print(res);
        // we need to pass only first and last index
        int a = res.get(0);
        int b = res.get(res.size()-1);
        res.clear();
        res.add(a);res.add(b);
        return res;
    }
    public static void main(String[] args) {
        
        int[] a = {3, 3, 4, 5, 5, 9, 11, 13, 14, 15, 15, 16, 15, 20, 16 };
        //11,14
        ArrayList<Integer> A = new ArrayList<>();
        for(int i : a)
        {
            A.add(i);
        }
        ArrayList<Integer> res = new maximumSortedArray().subUnsort(A);
        print(res);

    }
    public static void print(ArrayList<Integer> al) {
        for (Integer integer : al) {
            System.out.print(integer +" ");
        }
        System.out.println();
    }
}
