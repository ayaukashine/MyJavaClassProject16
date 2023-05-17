package TestBatch16;

public class ReplTest131 {

    static int countA(String s) {


        int sum = 0;
        for (int i = 0; i < s.length(); i++) {

            String g=" ";
            g=g+s.charAt(i);

            if (g.contains("a") || g.contains("A")) {
                sum = sum + 1;
            }
        }
        return sum;

    }


    //test case below (dont change):
    public static void main(String[] args) {
       System.out.println(countA("aaA")); //3
        System.out.println(countA("aaBBdf8k3AAadnklA")); //6
    }
}