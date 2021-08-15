package scaler.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedArray {
    
    public ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {
        
        int n1 = A.size(), n2 = B.size();
        int i = 0,j = 0;
        ArrayList<Integer> res = new ArrayList<>();
        while(i < n1 && j < n2){
            if(A.get(i) <= B.get(j)){
                res.add(A.get(i));
                i++;
            }
            else{
                res.add(B.get(j));
                j++;
            }
        }
        while(i < n1){
            res.add(A.get(i));
            i++;
        }
        //System.out.println(n2);
        while(j < n2){
            res.add(B.get(j));
            j++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] A = {4, 7, 9 };
        int[] B = {2 ,11, 19 };
        ArrayList<Integer> a = new ArrayList<>(){
            {add(-4); add(-3); add(0); }
        };
        ArrayList<Integer> b = new ArrayList<>(){
            {add(2);} //add(11); add(19); }
        };
        ArrayList<Integer> res = new MergeTwoSortedArray().solve(a, b);
        for (int i : res) {
            System.out.print(i+" ");
        }
    }
}
