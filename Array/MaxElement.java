public class MaxElement {
    static void maxelement(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("the largest element is" + max);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 11, 4 };
        int n = arr.length;
        maxelement(arr, n);
    }

}