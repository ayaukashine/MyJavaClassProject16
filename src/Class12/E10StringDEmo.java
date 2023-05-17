package Class12;

public class E10StringDEmo {
    public static void main(String[] args) {
        String name="LEANDROR";


        int rLetter=0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)=='R'){
                rLetter++;

            }

        }System.out.println(rLetter);
    }
}
