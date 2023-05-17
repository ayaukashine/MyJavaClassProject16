package Homeworks;

public class HW1Array {
    public static void main(String[] args) {
        char [] letters={'A','B','C','D'}; //1 way
        System.out.println(letters[1]);

        char [] letters2= new char[4]; //2 way
        letters2[0]='A';
        letters2[1]='B';
        letters2[2]='C';
        letters2[3]='D';
        System.out.println(letters2[1]);

    }
}
