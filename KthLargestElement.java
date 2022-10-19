package priorityQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestElement {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int arr[]= {10 , 20, 60 , 30, 50 ,40};
		PriorityQueue<Integer> pq = new PriorityQueue<>();//by default min heap
		for(int i = 0 ; i<k; i++) {
			pq.add(arr[i]);
		}
		
		for(int i = k ; i<arr.length ; i++) {
			if(pq.peek()<arr[i]) {
				pq.poll();
//				pq.remove((pq.peek()));
				pq.add(arr[i]);
			}
		}
		System.out.println(pq.peek());
		
		
		
		
//		 PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());//Max heap
//		 while(!pq.isEmpty()) {
//			 System.out.println(pq.peek());
//			 pq.poll();
//		 }
	
			
	
	}

}
