package class14;

public class E5Array {
    boolean contains(int[] arr, int num) {
        boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                isFound = true;

            }

        }
        return isFound;
    }
}

