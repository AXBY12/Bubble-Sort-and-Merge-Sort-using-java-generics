public class MergeSort<T extends Comparable<T>> {

    public void mergeSort(T[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;
            T[] left = Arrays.copyOfRange(arr, 0, mid);
            T[] right = Arrays.copyOfRange(arr, mid, arr.length);

            mergeSort(left);
            mergeSort(right);

            int i = 0, j = 0, k = 0;
            while (i < left.length && j < right.length) {
                if (left[i].compareTo(right[j]) <= 0) {
                    arr[k++] = left[i++];
                } else {
                    arr[k++] = right[j++];
                }
            }

            while (i < left.length) {
                arr[k++] = left[i++];
            }

            while (j < right.length) {
                arr[k++] = right[j++];
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {38, 27, 43, 3, 9, 82, 10};
        MergeSort<Integer> mergeSort = new MergeSort<>();
        mergeSort.mergeSort(arr);
        System.out.println("Sorted array using Merge Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
