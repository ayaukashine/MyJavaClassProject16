package Homeworks;

public class Masters extends Degree{

    void getPrerequisite(){
        System.out.println("Master will be available after finishing Bachelor");
    }
    public static void main(String[] args) {
        Masters master=new Masters();
      master.getPrerequisite();
    }
}
