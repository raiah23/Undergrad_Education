
package diusystemarray;
import java.util.ArrayList;

class Course{
    String id;
    Course(String i){
        id = i;
    }
    ArrayList<Student> s=new ArrayList<Student>();
    void StudentList(Student st){
        s.add(st);
    }
}
class Student{
    int id;
    String name;
    int mark;
    Student(int i, String n){
        id = i;
        name = n;
    }
    ArrayList<Course> c = new ArrayList<Course>();
    void register(Course c1,Course c2){
        c.add(c1);
        c.add(c2);
    }
}
class Teacher{
    int id;
    String name;
    Teacher(int i,String n){
        id = i;
        name = n;
    }
    ArrayList<Course> c = new ArrayList<Course>();
    void assign_course(Course c1,Course c2){
        c.add(c1);
        c.add(c2);
    }
    void Give_marks(Course c1){
        for(Student s : c1.s){
            s.mark = 80;
        }
    }
}
class Admin{
    void check(ArrayList<Teacher> t){
        for(Teacher t1:t){
            for(Course c1: t1.c){
                for(Student s: c1.s){
                    if(s.mark==80){
                        System.out.println("Mark is approved by the teacher. " + t1.name);
                    }
                }
            }
        }
    }
}

public class DIUSystemArray {

    public static void main(String[] args) {
        Course c1 = new Course("SWE-121");
        Course c2 = new Course("SWE-123");
        Student s = new Student(1,"R");
        Student s2 = new Student(2,"M");
        s.register(c1, c2);
        s2.register(c1, c2);
        c1.StudentList(s);
        c2.StudentList(s);
        c1.StudentList(s2);
        c2.StudentList(s2);
        Teacher t1 = new Teacher(1,"Teacher");
        t1.assign_course(c1, c2);
        t1.Give_marks(c1);
        t1.Give_marks(c2);
        Teacher t2 = new Teacher(2,"Teacher");
        t2.assign_course(c1, c2);
        t2.Give_marks(c1);
        t2.Give_marks(c2);
        Teacher t3 = new Teacher(3,"Teacher");
        t3.assign_course(c1, c2);
        t3.Give_marks(c1);
        t3.Give_marks(c2);
        ArrayList<Teacher> t =new ArrayList<Teacher>();
        t.add(t1);
        t.add(t2);
        t.add(t3);
        Admin a = new Admin();
        a.check(t);
        for(Teacher tr : t){
            System.out.println(tr.name+" has taken courses");
            for(Course cr:tr.c){
                for(Student st: cr.s){
                    System.out.print(cr.id);
                    System.out.println(": "+st.mark+" achieved by "+st.name);
                }
            }
        }
    }
    
}
