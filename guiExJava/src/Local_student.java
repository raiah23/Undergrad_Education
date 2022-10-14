
public class Local_student extends Student implements calc_cgpa {
    Local_student(String name){
        super(name);
    }
    public double calc_cgpa(double java, double oop){
        return (java+oop)/2;
    }
}
