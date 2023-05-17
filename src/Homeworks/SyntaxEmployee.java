package Homeworks;

public class SyntaxEmployee {

    String empID;
    int salary;

    String CEO="Sumair";


    public static void main(String[] args) {
        SyntaxEmployee obj1=new SyntaxEmployee();
        String rs= obj1.CEO;
        obj1.empID="Aya Sai";
        obj1.salary=100000;
        System.out.println(obj1.empID+" salary starts from "+ obj1.salary+", CEO of the company is "+rs);
    }
}
