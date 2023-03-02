public class PairSum {
    public static void pair(int arr[], int k) {
        int i = arr[0];
        int j = arr.length - 1;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] + arr[j] > k) {
                j--;
            }
            if (arr[i] + arr[j] == k) {
                System.out.println(arr[i] + " " + arr[j]);

            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int k = 6;
        pair(arr, k);
    }

}
