package Array;

public class RemoveDublicate {
    public int remove(int arr[]) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];
            }
        }

        return j + 1;
    }
}