package scaler.basicOfMaths;

import java.util.ArrayList;

public class rearrangeArray {

	public static ArrayList<Integer> arrange(ArrayList<Integer> a) {
		
		int n = a.size();
		for (int i = 0; i < n; i++) {
             int temp = (a.get(a.get(i)) % n) * n + a.get(i);
             a.set(i, temp);
             
		}
		 
        for (int j = 0; j < n; j++) {
        	int temp = a.get(j)/n;
            a.set(j, temp);
            }
        return a;
	}
	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		int[] t = {1, 2, 7, 0, 9, 3, 6, 8, 5, 4};
		for(int i : t)
		{
			a.add(i);
		}
		arrange(a);
	}
}
