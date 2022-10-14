
package labfinal;

abstract class Student{
    int id;
    String name;
    double cgpa;
    Student(int i, String n){
        id = i;
        name = n;
    }
    abstract void calculate_cgpa(Course c);
    abstract void calculate_waiver();
}
class Foreign_student extends Student{
    String waiver;
    Foreign_student(int id, String name){
        super(id,name);
    }
    void calculate_cgpa(Course c){
        if(c.number == 233){
            cgpa = 4.00;
        }
    }
    @Override
    void calculate_waiver(){
        if(cgpa>=3.8){
            System.out.println("Your waiver is 20%"+"+5%");
        }
        else{
            System.out.println("Your waiver is 10%"+"+5%");
        }
    }
}
class Local_student extends Student{
    String waiver;
    Local_student(int id, String name){
        super(id,name);
    }
    void calculate_cgpa(Course c){
        if(c.number == 233){
            cgpa = 4.00;
        }
    }
    @Override
    void calculate_waiver(){
        if(cgpa>=3.8){
            System.out.println("Your waiver is 20%");
        }
        else{
            System.out.println("Your waiver is 10%");
        }
    }
}
class Course{
    int number;
    Course(int id){
        number = id;
    }
}
public class LabFinal {

    public static void main(String[] args) {
        Course c1 = new Course(223);
        Course c2 = new Course(222);
        Course c3 = new Course(233);
        Foreign_student f = new Foreign_student(1, "Usman");
        f.calculate_cgpa(c3);
        f.calculate_waiver();
    }
    
}
