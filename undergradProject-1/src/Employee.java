
public abstract class Employee {
    private String id;
    private String name;
    Employee(String id, String name){
        this.name = name;
        this.id = id;
    }
    abstract String show_salary();
}
