import java.util.Arrays;

public class Searchin2Darraay {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int target = 5;
        int[] ans = search(arr, target); // return in the formate of indec {r} {c};
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }

    static int[] search(int[][] arr, int target) {

        for (int r = 0; r < arr.length; r++) {

            for (int c = 0; c < arr[r].length; c++) {
                if (arr[r][c] == target)
                    return new int[] { r, c };
            }
        }
        return new int[] { -1, -1 };
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for (int[] row : arr) {

            for (int element : row) {

                if (element > max)
                    max = element;
            }
        }
        return max;
    }

}
