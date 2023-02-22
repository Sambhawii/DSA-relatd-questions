import java.util.Scanner;

public class ArrayCRUD {
    int arr[];
    int currentSize;

    public ArrayCRUD(int n) {
        this.arr = new int[n];
        this.currentSize = 0;
    }

    public void insert(int index, int item) {
        if (currentSize > index) {
            for (int i = arr.length - 2; i > index - 1; i--) {
                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }
        arr[index] = item;
        currentSize++;
    }

    public void readArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " , ");
        }
        System.out.println();
    }

    public void updateElement(int index, int element) {
        System.out.println("Older Element : " + arr[index]);
        arr[index] = element;
        System.out.println("New Element : " + arr[index]);
    }

    public void deleteElement(int index) {
        System.out.println("Element in array : " + arr[index]);
        arr[index] = 0;
        System.out.println("Element Deleted");
    }

    public void searchElement(int n) {
        boolean flag = false;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                flag = true;
                index = i;
            }
        }
        if (flag == true && index != -1) {
            System.out.println("Element is located at index : " + index + 1);
        } else {
            System.out.println("Element is not located in the array");
        }
    }

    public static void main(String[] args) {
        ArrayCRUD obj1 = new ArrayCRUD(5);
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("---Welcome To CRUD---");
            System.out.println("1.Insert Element");
            System.out.println("2.Read Element");
            System.out.println("3.Update Element");
            System.out.println("4.Delete Element");
            System.out.println("5.Search Element");
            System.out.println("6.Exit");
            System.out.print("Enter the choice : ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: {
                    System.out.println("\n\n");
                    System.out.print("Enter the index of element : ");
                    int index = sc.nextInt();
                    System.out.print("Enter the element : ");
                    int item = sc.nextInt();
                    obj1.insert(index, item);
                    System.out.println("\n\n");
                }
                    break;

                case 2: {
                    System.out.println("\n\n");
                    System.out.println("Array List ");
                    obj1.readArray();
                    System.out.println("\n\n");
                }
                    break;
                case 3: {
                    System.out.println("\n\n");
                    System.out.print("Enter the index of element : ");
                    int index = sc.nextInt();
                    System.out.print("Enter the element : ");
                    int item = sc.nextInt();
                    obj1.updateElement(index, item);
                    System.out.println("\n\n");
                }
                    break;
                case 4: {
                    System.out.println("\n\n");
                    System.out.print("Enter the index of element to be deleted : ");
                    int index = sc.nextInt();
                    obj1.deleteElement(index);
                    System.out.println("\n\n");

                }
                    break;
                case 5: {
                    System.out.println("\n\n");
                    System.out.print("Enter the element : ");
                    int item = sc.nextInt();
                    obj1.searchElement(item);
                    System.out.println("\n\n");
                }
                    break;
                case 6: {
                    System.out.println("\n\n");
                    System.out.println("\t\tThank You");
                    System.out.println("\n\n");
                    choice = 9;
                }
                    break;
                default:
                    System.out.println("\n\n");
                    System.out.println("Invalid Input");
                    break;
            }
        } while (choice != 9);
        sc.close();
    }
}
