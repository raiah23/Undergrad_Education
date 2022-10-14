
public class Foreign_student extends Student implements calc_cgpa {
    Foreign_student(String name){
        super(name);
    }
    String calc_waiver(){
        if(cgpa > 3.8){
             return "5"+super.Calc_waiver();
        }
        else return "";
    }
    public double calc_cgpa(double java, double oop){
        return (java+oop)/2;
    }
}
