
public class Supervisor extends Employee implements Isalary_activity2{
    private int salary;
    Supervisor(String id, String name){
        super(id, name);
    }
    public void get_salary(int balance){
        salary = balance;
    }
    public String show_salary(){
        return "Supervisor salary "+salary;
    }
}
