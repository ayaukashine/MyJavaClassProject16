package class11;

public class E3D2Array {
    public static void main(String[] args) {
        String [] [] names2DArray={
                {"Sarah","Artem","Lean","Semir"},
                {"Farwa","Halima", "Alina", "Semir"}
        };

        for(String [] nameArr: names2DArray){
            for(String name: nameArr){
                System.out.println(name);
            }
        }

        }



    }
