package main;
public class Main {

	/*Day 1
		This problem was recently asked by Google.
				Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
		For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
		Bonus: Can you do this in one pass?*/


	public static boolean method(int[] N, int k) {
		for (int a : N){
			for (int b : N){
				if(a+b == k){
					return true;
				}
			}
		}
		return false;
	}



	public static void main(String[] args) {
		int[] N = new int[]{ 10, 15, 3, 7 };
		int k = 10;

		System.out.println(method(N, k));

	}
}
