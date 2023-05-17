package Project1;

public class Task10Project {

    public static void main(String[] args) {
        String [] groceries={"cucumber", "chai", "tomatoes", "apple", "baking powder", "potatoes", "potatoes"};

        for (int i = 0; i < groceries.length; i++) {
            for (int j = i+1; j < groceries.length; j++) {

                if (groceries[i].equals(groceries[j])) {
                    System.out.println(groceries[j]);

                }

            }

        }
    }
}
