package class21;

public class Student1 {

    String name;
    String country;
    int age;


    Student1(String name, String country, int age){

        this.name=name;
        this.country=country;
        this.age=age;

    }
    void printInfo(){
        System.out.println(name+ " "+country+" "+age);
    }
    void learn(){
        System.out.println("Knows how to learn on his own");
    }

    void homework(){
        System.out.println("does homework on time");
    }
    void loanforschool(){
        System.out.println("Financially dependent");

    }
}



class SyntaxStudent extends Student1 {

    SyntaxStudent(String name, String country, int age) {
        super(name, country, age);

    }
    void learn(){
        System.out.println("Learns Java");
    }

    void homework(){
        System.out.println("Replit");
    }
    void loanforschool(){
        System.out.println("Pays on time");

    }


}
    class CollegeStudent extends Student1 {

        CollegeStudent(String name, String country, int age) {
            super(name, country, age);
        }

        void learn(){
            System.out.println("Learns a lot");
        }

        void homework(){
            System.out.println("On time");
        }
        void loanforschool(){
            System.out.println("Loan from Bank");

        }
    }

    class SchoolStudent extends Student1 {

        SchoolStudent(String name, String country, int age) {
            super(name, country, age);
        }


        void learn(){
            System.out.println("Needs parent help");
        }

        void homework(){
            System.out.println("Parents help");
        }
        void loanforschool(){
            System.out.println("Parents help");

        }
    }

