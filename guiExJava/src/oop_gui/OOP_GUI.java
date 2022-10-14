
package oop_gui;

class Student{
    String name;
    double cgpa;
    Student(String n){
        name = n;
    }
    String Calc_waiver(){
        if(cgpa > 3.8){
            return "5% waiver";
        }
        else return "No cgpa";
    }
}

interface calc_cgpa{
    double calc_cgpa(double java, double oop);
}
class Local_student extends Student implements calc_cgpa{
    Local_student(String name){
        super(name);
    }
    public double calc_cgpa(double java, double oop){
        return (java+oop)/2;
    }
}
class Foreign_student extends Student implements calc_cgpa{
    Foreign_student(String name){
        super(name);
    }
    void calc_waiver(){
        if(cgpa > 3.8){
             System.out.println("5"+super.Calc_waiver());
        }
    }
    public double calc_cgpa(double java, double oop){
        return (java+oop)/2;
    }
}

public class OOP_GUI {

    public static void main(String[] args) {
        Foreign_student f = new Foreign_student("Asa");
        double c = f.calc_cgpa(3.80, 3.94);
        f.cgpa = c;
        f.calc_waiver();
    }
    
}
