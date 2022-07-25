public class Day_3 {

    /*Day 3 [Hard]
    Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

    For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.*/
    public static int getMissing(int[] arr) {
        int l = arr.length;
        int lowest = arr[0];
        for (int i = 0; i < l; i++) {
            if (arr[i] < 0) {
                return i;
            }
            else if (arr[i] >= lowest) {
                lowest = arr[i];
            }
            else if (arr[i] == 0) {
                return i+1;
            }

        }
        return 0;
    }

    public static void main(String[] args) {


        int [] arr = new int[] {3, 4, -1, 1};
        int [] arr2 = new int[] {1, 2, 0};

        System.out.println(getMissing(arr2));

    }
}
