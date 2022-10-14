
public class CLeaner extends Employee implements Isalary_activity2{
    private int salary;
    CLeaner(String id, String name){
        super(id, name);
    }
    public void get_salary(int balance){
        salary = balance;
    }
    public String show_salary(){
        return "Cleaner salary "+salary;
    }
}
