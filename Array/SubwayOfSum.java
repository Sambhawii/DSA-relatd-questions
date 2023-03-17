package Array;

public class SubwayOfSum {

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 290 };
        int sum = 0;
        int target = 90;
        int j = 0;
        int n = arr.length;
        boolean flag = false;
        for (int i = 0; i < n; i--) {
            if (sum < target) {
                sum += arr[i];
            } else {
                sum = sum - arr[j];
                j++;
            }
            if (sum == target) {
                flag = true;
                break;
            }
            System.out.println(flag);
        }
        // System.out.println(flag);
    }
}