
package ooparraylist;
import java.util.ArrayList;

class Teacher{
    ArrayList<Course> C = new ArrayList<Course>();
    int id;
    String name;
    Teacher(int id,String name){
        this.id = id;
        this.name = name;
    }
    void course_entry(Course c1, Course c2){
        C.add(c1);
        C.add(c2);
    }
}
class Course{
    int id;
    String name;
    Course(int id,String name){
        this.id = id;
        this.name = name;
    }
}

public class OOPArrayList {

    public static void main(String[] args) {
        ArrayList<Teacher> t = new ArrayList<Teacher>();
        Teacher t1 = new Teacher(1,"Teacher 1");
        Teacher t2 = new Teacher(2,"Teacher 2");
        Teacher t3 = new Teacher(3,"Teacher 3");
        t.add(t1);
        t.add(t2);
        t.add(t3);
        Course c1 = new Course(1,"c1");
        Course c2 = new Course(1,"c2");
        Course c3 = new Course(1,"c3");
        t1.course_entry(c1, c2);
        t2.course_entry(c2, c3);
        for(Teacher ob:t){
            System.out.println(ob.id);
            for(Course c:ob.C){
                System.out.println(c.name);
            }
        }
    }
    
}
