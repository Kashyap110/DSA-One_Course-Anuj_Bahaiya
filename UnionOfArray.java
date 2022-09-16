package Hashing;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfArray {
	static int sizeUnion(int a[] , int b[]) {
		HashSet< Integer> set = new HashSet<>();
		for(int i = 0 ; i<a.length; i++) {
			set.add(a[i]);
		}
		for(int i = 0 ; i< b.length; i++) {
			set.add(b[i]);
		}
		System.out.println(set);
		return set.size();
	}
	static int Intersection(int a[], int b[]) {
		HashSet<Integer> set = new HashSet<>() ;
		for(int i = 0 ; i<a.length; i++) {
			set.add(a[i]);
		}
		ArrayList<Integer> list  = new ArrayList<>();
		for(int i = 0 ; i< b.length; i++) {
			if(set.contains(b[i])) {
				list.add(b[i]);
			}
		}
		System.out.println(list);
		return list.size();
	}
	public static void main(String[] args) {
		int arr1[] = {5,10};
		int arr2[] = {3, 4 ,6};
		System.out.println(sizeUnion(arr1, arr2));
		System.out.println(Intersection(arr1, arr2));
	}

}
