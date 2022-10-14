
package registration;

class course{
    int id;
    String name;
    String course_type;
    int totalmarks;
    course(int id, String name, String course_type){
        this.id = id;
        this.name = name;
        this.course_type = course_type;
    }
}
class student{
    int id;
    String name,performance;
    course c1,c2,c3;
    student(int id, String name, String performance, course c1,course c2,course c3){
        this.id = id;
        this.name = name;
        this.performance = performance;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }
    void semester(){
        System.out.println("Id: "+id+"\nName: "+name+"\nIn this semester your courses are\n"+c1.name+" "+c1.course_type);
        System.out.println(c2.name+" "+c2.course_type);
        System.out.println(c3.name+" "+c3.course_type);
    }
}
class teacher{
    int id;
    String name;
    String mark_given;
    teacher(int id, String name){
        this.id = id;
        this.name = name;
    }
    void check_performance(student s){
        s.semester();
        if(s.performance.equals("Good")){
            s.c1.totalmarks = 80;
            s.c2.totalmarks = 80;
            s.c3.totalmarks = 80;
            System.out.println("You marks are \n"+s.c1.name+": "+s.c1.totalmarks+"\n"+s.c2.name+": "+s.c2.totalmarks+"\n"+s.c3.name+": "+s.c3.totalmarks);
            System.out.println("Thank you for your good performance.");
            mark_given = "yes";
        }
        else{
            System.out.println("You got less than 80 marks");
        }
    }
}
class admin{
    int id;
    String name;
    admin(int id, String name){
        this.id = id;
        this.name = name;
    }
    void approve(teacher a){
        if(a.mark_given.equals("yes")){
            System.out.println("Salary is approved.");
        }
    }
}
public class DiuRegistration {

    public static void main(String[] args) {
        // TODO code application logic here
        course c1 = new course(1, "SWE-222", "Theory");
        course c2 = new course(2, "SWE-233", "Theory+Lab");
        course c3 = new course(3, "Swe-223", "Theory");
        student A = new student(161, "Abir", "Good", c1, c2, c3);
        teacher j = new teacher(1, "j");
        j.check_performance(A);
        admin robi = new admin(1, "robi");
        robi.approve(j);
    }
    
}
