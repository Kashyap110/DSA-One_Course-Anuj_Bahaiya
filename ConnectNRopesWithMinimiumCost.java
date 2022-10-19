package priorityQueue;

import java.util.PriorityQueue;

public class ConnectNRopesWithMinimiumCost {
	
	public static void main(String[] args) {
		int arr[] = {2,5,4,8,6,9};
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i = 0 ; i< arr.length; i++) {
			pq.add(arr[i]);
		}
		int ans = 0;
		while (pq.size()>1) {
			int first = pq.poll();
			int second = pq.poll();
			int sum = first+second;
			ans+= sum;
			pq.add(sum); 
		}
		System.out.println(ans);
	}
	
}
