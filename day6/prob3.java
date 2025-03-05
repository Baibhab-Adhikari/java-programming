package day6;

class sortArray {
    // Member variables: an array of integers and its size.
    int[] arr;
    int size;

    // Constructor to initialize the array and size.
    sortArray(int[] arr, int size) {
        this.arr = arr;
        this.size = size;
    }

    public void sort() {
        try {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds!");
        }
    }

    public void show() {
        System.out.print("Sorted Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

public class prob3 {

    public static void main(String[] args) {
        int[] array = { 5, 3, 2, 8, 1 };
        sortArray ob = new sortArray(array, 7);

        ob.sort();
        ob.show();
    }
}