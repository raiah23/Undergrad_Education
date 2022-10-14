package interface_aboffice;

class Employee{
    int id;
    String name;
    Employee(int i,String n){
        id = i;
        name = n;
    }
}
interface Salary{
    void Salary();
}
class Manager extends Employee implements Salary{
    Manager(int id, String name){
        super(id,name);
    }
    public void Salary(){
        System.out.println(500*30);
    }
}
class Stuff extends Employee implements Salary{
    Stuff(int id, String name){
        super(id,name);
    }
    public void Salary(){
        System.out.println(300*30);
    }
}
class Cleaner extends Employee implements Salary{
    Cleaner(int id, String name){
        super(id,name);
    }
    public void Salary(){
        System.out.println(100*30);
    }
}
public class Interface_AbOffice {

    public static void main(String[] args) {
        Manager m = new Manager(1, "X");
        m.Salary();
        Stuff s = new Stuff(2, "Y");
        s.Salary();
        Cleaner c = new Cleaner(3,"Z");
        c.Salary();
    }
    
}
