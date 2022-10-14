
import java.util.ArrayList;


public class Student {
    private int id;
    private String name;
    private int rent;
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    String room_allocate(ArrayList<Room_info> r, int id){
        for(Room_info r1 : r){
            if(r1.get_id() == id){
                if(r1.get_access() == 0){
                    r1.reserve(1);
                    return "Room is booked by "+name;
                }
                else{
                    return "Room is not available. !sorry";
                }
            }
        }
        return "";
    }
    String room_allocate(ArrayList<Room_info> r, int id, int id_shift){
        for(Room_info r1 : r){
            if(r1.get_id() == id_shift){
                if(r1.get_access() == 0){
                    r1.reserve(1);
                    return "Room is booked";
                }
                else{
                    return "Room is not available. !sorry";
                }
            }
        }
        for(Room_info r2 : r){
            if(r2.get_id() == id){
                r2.reserve(0);
            }
        }
        return "";
    }
    void give_rent(int room_rent, int current_bill, int food_bill){
        rent = room_rent+current_bill+food_bill;
    }
    int get_rent(){
        return rent;
    }
}
