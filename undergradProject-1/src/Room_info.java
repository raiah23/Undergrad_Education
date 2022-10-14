
public class Room_info extends Hostel{
    private int room_id;
    private int availability;
    Room_info(String name, String type,int id){
        super(name, type);
        room_id = id;
    }
    String Room(){
        return "Student room is available";
    }
    int get_id(){
        return room_id;
    }
    public void reserve(int a){
        availability = a;
    }
    int get_access(){
        return availability;
    }
}
