
import java.util.ArrayList;


public class Manager extends Employee implements Isalary_activity{
    private int monthly_income;
    private int profit;
    Manager(String id, String name){
        super(id, name);
    }

    public void give_salary_stuff(Stuff s){
        int salary_stuff = (monthly_income*5)/100;
        s.get_salary(salary_stuff);
        profit += monthly_income - salary_stuff;
    }
    public void give_salary_cleaner(CLeaner c){
        int salary_cleaner = (monthly_income*5)/100;
        profit += monthly_income - salary_cleaner;
        c.get_salary(salary_cleaner);
    }
    public void give_salary_supervisor(Supervisor s){
        int salary_supervisor = (monthly_income*20)/100;
        profit += monthly_income - salary_supervisor;
        s.get_salary(salary_supervisor);
    }
    void collect_money(ArrayList<Student> s){
        for(Student s1 : s){
            monthly_income += s1.get_rent();
        }
    }
    int profit_this_month(){
        return profit-((profit*50)/100);
    }
    String show_salary(){
        return "Manager Salary : "+(monthly_income*20)/100;
    }
}
