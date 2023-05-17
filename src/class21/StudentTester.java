package class21;

public class StudentTester {

    public static void main(String[] args) {

        Student1 [] students= {new SyntaxStudent("Ayau", "KZ", 25),
        new CollegeStudent("Berik", "Kz", 19),
                new SchoolStudent("Karina", "Usa", 12)};

        for(Student1 st:students){
            st.printInfo();
            st.learn();
st.homework();
st.loanforschool();     }


    }
}
