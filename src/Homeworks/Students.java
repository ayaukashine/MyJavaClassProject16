package Homeworks;


/*Write a java Class Students that have a constructor which takes students name and
3 subject grades.
Inside your class also have a method to Calculate Average Grade. Test Student class for
5 different students with different marks. Your program should
print an average mark of each students name.*/
public class Students {

    Students(String name, int biology, int math, int literature){
        int average=biology+math+literature;
        System.out.println("Student "+name+" average grade is "+average);

    }

    public static void main(String[] args) {
        Students student=new Students("Aya",50,80,95);
        Students stud=new Students("Masha",40,50,69);
        Students st=new Students("Gogi",160,60,90);
        Students stu=new Students("Nuka", 60,90,60);
        Students student1=new Students("Zhasik", 60,100,60);
    }
}
