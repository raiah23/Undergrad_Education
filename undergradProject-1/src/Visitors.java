
public class Visitors {
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
    String information(String varsity){
        return "I am a student and my university is "+varsity;
    }
    String information(){
        return "I am just a visitor";
    }
}
