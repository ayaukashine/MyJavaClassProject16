package Project1;

public class Task8Project {
    public static void main(String[] args) {
        int[][] arr2d = {
                {15, 19, 16, 75, 84, 96, 32, 15},
                {7, 2, 6, 36, 98, 64, 75, 92, 15, 16}
        };

        int largest = arr2d[0][0];
        int smallest = arr2d[0][0];

        for (int[] ints : arr2d) {
            for (int anInt : ints) {
                if (largest < anInt) {
                    largest = anInt;
                }
            }
        }

        for (int[] ints : arr2d) {
            for (int anInt : ints) {
                if (smallest > anInt) {
                    smallest = anInt;
                }
            }
        } System.out.println(largest);
        System.out.println(smallest);

    }
}

