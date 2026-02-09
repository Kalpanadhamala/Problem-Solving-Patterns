public class removeSortedDuplicates{
    public static int removeDuplicates(int[] a) {
        if (a.length == 0) return 0;  // empty array

        int i = 0;  // last unique element index

        for (int j = 1; j < a.length; j++) {
            if (a[j] != a[i]) {       // new unique element
                i++;
                a[i] = a[j];          // copy to next position
            }
        }

        return i + 1;  // number of unique elements
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 3};
        int newSize = removeDuplicates(a);

        System.out.println("Array after removing duplicates:");
        for (int k = 0; k < newSize; k++) {
            System.out.print(a[k] + " ");
        }
    }
}