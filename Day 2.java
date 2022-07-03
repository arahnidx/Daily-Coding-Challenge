package main;
public class Main {

	/*Day 2 [Hard]
	This problem was asked by Uber.
	Given an array of integers, return a new array such that each element at index i of the new array is the
	product of all the numbers in the original array except the one at i.
	For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
	If our input was [3, 2, 1], the expected output would be [2, 3, 6].

	Follow-up: what if you can't use division?*/
	public static void indexProduct(int[] N) {
		int[] M = new int[N.length];
		for (int i=0; i<N.length; i++){
			for(int j=0; j<N.length;j++){
				if(j!=i && M[i] != 0){
					M[i]*= N[j];
				}
				else if(j==i && M[i]==0){
					M[i]=1;
				}
				else if(j!=i && M[i] ==0){
					M[i]=N[j];
				}
			}
		}
		for (int k : M){
			System.out.print(k+" ");
		}
	}
	public static void main(String[] args) {
		int[] N = new int[]{ 1, 2, 3, 4, 5};

		indexProduct(N);
	}
}
