public class PrefixSumInPlace {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9};
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        int L = 2;
        int R = 4;
        int result;
        if (L == 0) {
            result = arr[R];
        } else {
            result = arr[R] - arr[L - 1];
        }
        System.out.println("Sum from index " + L + " to " + R + " is: " + result);
    }
}
