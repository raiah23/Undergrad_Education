
package trainingclass1;
import java.util.Scanner;

class room{
    void standard(){
        System.out.println("Standard : Single bed(120 sq feet)\nFacilities : Air condition, a television, a telephone\n");
    }
    void family(){
        System.out.println("Family : Double bed(300 sq feet)\nFacilities : a couch, a table\n");
    }
    void suite(){
        System.out.println("Suite : Suiteing size bed(625 sq feet) with a single bed\nFacilities : Sitting Sofa, Dining Table, Small kitchen\n");
    }
}
class customer{
    String name,email,address;
    int id;
    void relevent_id(){
        id++;
    }
    void Show_message(room a){
        a.standard();
        a.family();
        a.suite();
        System.out.println("Id is: "+id+" \n"+name+" \n"+email+" \n"+address);
    }
}
public class TrainingClass1 {

    public static void main(String[] args) {
        // TODO code application logic here
        room hotel = new room();
        customer alam = new customer();
        alam.name = "Alam";
        alam.email = "alam@gmail.com";
        alam.address = "Baker Street 221B";
        alam.relevent_id();
        alam.Show_message(hotel);
    }
    
}
