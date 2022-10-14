
public class Student {
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
