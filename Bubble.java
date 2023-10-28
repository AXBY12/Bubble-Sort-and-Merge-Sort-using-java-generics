public class BubbleSort<T extends Comparable<T>> {

    public void bubbleSort(T[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        bubbleSort.bubbleSort(arr);
        System.out.println("Sorted array using Bubble Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
