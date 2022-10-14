
public class Stuff extends Employee implements Isalary_activity2{
    private int salary;
    Stuff(String id, String name){
        super(id, name);
    }
    public void get_salary(int balance){
        salary = balance;
    }
    public String show_salary(){
        return "Stuff salary "+salary;
    }

}
