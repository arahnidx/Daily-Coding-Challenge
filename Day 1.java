package main;
public class Main {

	/*Day 1
		This problem was recently asked by Google.
				Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
		For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
		Bonus: Can you do this in one pass?*/

	public static boolean method_1(int[] N, int k) {
		for (int i = 0; i < N.length; i++) {
			for (int j = i + 1; j < N.length; j++) {
				if (N[i] + N[j] == k) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean method_2(int[] N, int k) {
		for (int a : N){
			for (int b : N){
				int sum = a+b;
				if(sum == k){
					return true;
				}
			}
		}
		return false;
	}



	public static void main(String[] args) {
		int[] N = new int[]{ 10, 15, 3, 7 };
		int k = 10;

		System.out.println(method_1(N, k));
		System.out.println(method_2(N, k));
	}
}
