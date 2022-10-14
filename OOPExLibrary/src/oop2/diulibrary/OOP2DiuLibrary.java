
package oop2.diulibrary;

class Book{
    int id;
    String name;
    String category;
    String availability;
}
class student{
    int id;
    String name;
    void borrow_book(Book a){
        if(a.availability.equals("Available") && a.name.equals("Physics"))
            System.out.println("Book is available\nId = "+id+"\nBook Name = "+a.name);
        else
            System.out.println("Book is not available\nId = "+id+"\nBook Name = "+a.name);
    }
}
public class OOP2DiuLibrary {

    public static void main(String[] args) {
        // TODO code application logic here
        Book phy = new Book();
        phy.id = 1;
        phy.name = "Physics";
        phy.category = "Science";
        phy.availability = "Available";
        student alam = new student();
        alam.id = 1;
        alam.name = "Alam";
        alam.borrow_book(phy);
    }
    
}
