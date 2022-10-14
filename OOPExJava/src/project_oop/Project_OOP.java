
package project_oop;

import java.util.ArrayList;


abstract class Employee{
    private int id;
    private String name;
    Employee(int id, String name){
        this.name = name;
        this.id = id;
    }
    abstract void show_salary();
}



abstract class Hostel{
    private String name;
    private String type;
    Hostel(String name, String type){
        this.name = name;
        this.type = type;
    }
    abstract void room();
}



interface Isalary_activity{
    void give_salary_stuff(Stuff s);
    void give_salary_cleaner(Cleaner c);
void give_salary_supervisor(Supervisor s);
}
interface Isalary_activity2{
    void get_salary(int balance);
}



class Location extends Hostel{
    private String location;
    private int no_of_rooms;
    Location(String name, String type, String location, int rooms){
        super(name,type);
        this.location = location;
        no_of_rooms = rooms;
    }
    void room(){
        System.out.println("Student room is available");
    }
    void room_accessibility(ArrayList<Room_info> r){
        System.out.println("Room available or not");
        for(Room_info r1 : r){
            System.out.print(r1.get_access()+" ");
        }
        System.out.println();
    }
}



class Room_info extends Hostel{
    private int room_id;
    private int availability;
    Room_info(String name, String type, int id){
        super(name, type);
        room_id = id;
    }
    void room(){
        System.out.println("Student room is available");
    }
    int get_access(){
        return availability;
    }
    int get_id(){
        return room_id;
    }
    public void reserve(int a){
        availability = a;
    }
}



class Manager extends Employee implements Isalary_activity{
    private int monthly_income;
    private int profit;
    Manager(int id, String name){
        super(id, name);
    }
    public void give_salary_stuff(Stuff s){
        int salary_stuff = (monthly_income*5)/100;
        profit = monthly_income - salary_stuff;
        s.get_salary(salary_stuff);
    }
    public void give_salary_cleaner(Cleaner c){
        int salary_cleaner = (monthly_income*5)/100;
        profit = monthly_income - salary_cleaner;
        c.get_salary(salary_cleaner);
    }
    public void give_salary_supervisor(Supervisor s){
        int salary_supervisor = (monthly_income*20)/100;
        profit = monthly_income - salary_supervisor;
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
    void show_salary(){
        System.out.println("Manager Salary : "+(monthly_income*20)/100);
    }
}



class Stuff extends Employee implements Isalary_activity2{
    private int salary;
    Stuff(int id, String name){
        super(id, name);
    }
    public void get_salary(int balance){
        salary = balance;
    }
    public void show_salary(){
        System.out.println("Stuff salary "+salary);
    }
}



class Cleaner extends Employee implements Isalary_activity2{
    private int salary;
    Cleaner(int id, String name){
        super(id, name);
    }
    public void get_salary(int balance){
        salary = balance;
    }
    public void show_salary(){
        System.out.println("Cleaner salary "+salary);
    }
}



class Supervisor extends Employee implements Isalary_activity2{
    private int salary;
    Supervisor(int id, String name){
        super(id, name);
    }
    public void get_salary(int balance){
        salary = balance;
    }
    public void show_salary(){
        System.out.println("Supervisor salary "+salary);
    }
}



class Student{
    private int id;
    private String name;
    private int rent;
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    void room_allocate(ArrayList<Room_info> r, int id){
        for(Room_info r1 : r){
            if(r1.get_id() == id){
                if(r1.get_access() == 0){
                    System.out.println("Room is booked");
                    r1.reserve(1);
                }
                else{
                    System.out.println("Room is not available. !sorry");
                }
            }
        }
    }
    void room_allocate(ArrayList<Room_info> r, int id, int id_shift){
        for(Room_info r1 : r){
            if(r1.get_id() == id_shift){
                if(r1.get_access() == 0){
                    System.out.println("Room is booked");
                    r1.reserve(1);
                }
                else{
                    System.out.println("Room is not available. !sorry");
                }
            }
        }
        for(Room_info r2 : r){
            if(r2.get_id() == id){
                r2.reserve(0);
            }
        }
    }
    void give_rent(int room_rent, int current_bill, int food_bill){
        rent = room_rent+current_bill+food_bill;
    }
    int get_rent(){
        return rent;
    }
}



class Visitors{
    private String name;
    private String comments;
    Visitors(String name){
        this.name = name;
    }
    void give_comment(String c){
        comments = c; 
    }
    String get_comment(){
        return comments;
    }
    void information(){
        System.out.println("I am just a visitor");
    }
    void information(String varsity){
        System.out.println("I am a student and my university is "+varsity);
    }
}




public class Project_OOP {

    public static void main(String[] args) {
        Location l1 = new Location("Daffodil", "Boys", "Dhanamondi", 2);
        Room_info r1 = new Room_info("Daffodil", "Boys", 1);
        Room_info r2 = new Room_info("Daffodil", "Boys", 2);
        Room_info r3 = new Room_info("Daffodil", "Boys", 3);
        Room_info r4 = new Room_info("Daffodil", "Boys", 4);
        Room_info r5 = new Room_info("Daffodil", "Boys", 5);
        Room_info r6 = new Room_info("Daffodil", "Boys", 6);
        Room_info r7 = new Room_info("Daffodil", "Boys", 7);
        Room_info r8 = new Room_info("Daffodil", "Boys", 8);
        Room_info r9 = new Room_info("Daffodil", "Boys", 9);
        Room_info r10 = new Room_info("Daffodil", "Boys", 10);
        r1.reserve(0);
        r2.reserve(0);
        r3.reserve(0);
        r4.reserve(0);
        r5.reserve(0);
        r6.reserve(0);
        r7.reserve(0);
        r8.reserve(0);
        r9.reserve(0);
        r10.reserve(0);
        ArrayList<Room_info> r = new ArrayList<Room_info>();
        r.add(r1);
        r.add(r2);
        r.add(r3);
        r.add(r4);
        r.add(r5);
        r.add(r6);
        r.add(r7);
        r.add(r8);
        r.add(r9);
        r.add(r10);
        l1.room_accessibility(r);
        Student s1 = new Student(1,"Abir");
        Student s2 = new Student(1,"Mahir");
        Student s3 = new Student(1,"Kabir");
        Student s4 = new Student(1,"Habir");
        Student s5 = new Student(1,"Rabir");
        s1.room_allocate(r, 1);
        s2.room_allocate(r, 2);
        s3.room_allocate(r, 3);
        s4.room_allocate(r, 4);
        s5.room_allocate(r, 5);
        l1.room_accessibility(r);
        s4.room_allocate(r, 4, 6);
        s5.room_allocate(r, 5, 8);
        l1.room_accessibility(r);
        System.out.println();
        s1.give_rent(3500, 500, 2500);
        s2.give_rent(3500, 500, 2500);
        s3.give_rent(3500, 500, 2500);
        s4.give_rent(3500, 500, 2500);
        s5.give_rent(3500, 500, 2500);
        ArrayList<Student> s = new ArrayList<Student>();
        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
        s.add(s5);
        Manager m = new Manager(1, "Khan");
        m.collect_money(s);
        Stuff st1 = new Stuff(1, "Connor");
        Stuff st2 = new Stuff(2, "Doge");
        Cleaner c1 = new Cleaner(1, "Jordan");
        Cleaner c2 = new Cleaner(1, "Steve");
        Supervisor sp1 = new Supervisor(1, "James");
        m.give_salary_stuff(st1);
        m.give_salary_stuff(st2);
        m.give_salary_cleaner(c1);
        m.give_salary_cleaner(c2);
        m.give_salary_supervisor(sp1);
        System.out.println("This month profit "+m.profit_this_month()); ///****
        System.out.println();
        m.show_salary();
        st1.show_salary();
        st2.show_salary();
        c1.show_salary();
        c2.show_salary();
        sp1.show_salary();
        Visitors v1 = new Visitors("Macky");
        Visitors v2 = new Visitors("Jacky");
        Visitors v3 = new Visitors("Jerry");
        System.out.println();
        System.out.println("Give comment ");
        v1.give_comment("It's totally good");
        v2.give_comment("It's a nice environment");
        v3.give_comment("It's totally good");
        System.out.println(v1.get_comment());
        System.out.println(v2.get_comment());
        System.out.println(v3.get_comment());
        System.out.println();
        v1.information();
        v2.information("Daffodil");
        v3.information("Daffodil");
    }
    
}
