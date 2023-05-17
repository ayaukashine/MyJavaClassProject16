package class9;

public class E4Arrays {
    public static void main(String[] args) {

        String [] names={"Aya", "Gogi", "Diana", "Katya", "Molya"};

        for(int i=2; i< names.length-1; i++){
            System.out.print(names[i] + " ");
        }
        System.out.println();
        int counter=0;
        while(counter< names.length){
            System.out.println(names[counter]);
            counter++;
        }
    }
}
