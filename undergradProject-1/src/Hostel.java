
abstract public class Hostel {
    private String name;
    private String type;
    Hostel(String name, String type){
        this.name = name;
        this.type = type;
    }
    abstract String Room();
}
