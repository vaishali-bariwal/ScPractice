package scaler.queueQuestions;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
	
	public static int[] slidingMaximum(final int[] a, int B) {
	        
	        int n = a.length;
	        int r[] = new int[n-B+1];;
	        Deque<Integer> de = new LinkedList<>();
	        int i;
	        for( i = 0; i < B;i++)
	        {
	        	
	        	//remove all elements from deque which are smaller than a[i]
	        	while(!de.isEmpty()&& a[i] >= a[de.peekLast()])
	        	{
	        		de.removeLast();
	        	}
	        	de.addLast(i);
	        }
	       r[0] = a[de.peek()];
	        for(i = B;i < n;++i)
	        {
	        	// delete all elements which are out window 
	        	while(!de.isEmpty()&&de.peek() <= i-B)
	        	{
	        		de.removeFirst();
	        	}
	        	while(!de.isEmpty()&& a[i] >= a[de.peekLast()])
	        	{
	        		de.removeLast();
	        	}
	        	de.addLast(i);
	        	r[i-B+1] = a[de.peek()];
	        	//long l = (long) Math.pow(2, 10);
	        }
	        return r;
	    }
	
	public static void main(String[] args) {
		int a[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int b  = 2;
		int r[] = slidingMaximum(a,b);
		for(int i : r) {
			System.out.print(i+" ");
		}
		
	}

}
