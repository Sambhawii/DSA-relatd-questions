package Array2D;

class SnakePattern {

    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        for (int i = 0; i < arr.length; i++) {
            // check i is +ve or -ve
            int j;
            if (i % 2 == 0) {
                for (j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (j = arr[0].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

}
