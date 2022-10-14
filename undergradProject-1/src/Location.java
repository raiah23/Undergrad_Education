
import java.util.ArrayList;


public class Location extends Hostel{
    private String location;
    private int no_of_rooms;
    Location(String name, String type, String location, int rooms){
        super(name,type);
        this.location = location;
        no_of_rooms = rooms;
    }
    String Room(){
        return "Student room is available";
    }
    String room_accessibility(ArrayList<Room_info> r){
        String a ="";
        for(Room_info r1 : r){
            a += " "+ String.valueOf(r1.get_access());
        }
        return "Room available or not\n"+"Still rooms are Available\n"+a;
    }
}
