
package librarymanagement;

class Library{
    int book_id;
    String Author;
    String title;
    int price;
    int member_id;
    Library(int book_id,String Author,String title,int price){
        this.book_id=book_id;
        this.Author=Author;
        this.title=title;
        this.price=price;
    }
}
class Hard_copy extends Library{
    int pages;
    Hard_copy(int book_id,String Author,String title,int price,int p){
        super(book_id,Author,title,price);
        pages = p;
    }
}
class Audio_book extends Library{
    int duration;
    Audio_book(int book_id,String Author,String title,int price,int d){
        super(book_id,Author,title,price);
        duration = d;
    }
}
class Member{
    String name;
    int member_id;
    Member(String n, int id){
        name = n;
        member_id = id;
    }
    void Borrow_AudioBook(Audio_book a){
        if(a.member_id == 0){
            System.out.println("You can borow this Audio Book."+"\n"+"Borrowed by : "+name);
            a.member_id = member_id;
        }
    }
    void Borrow_Hardcopy(Hard_copy h){
        if(h.member_id == 0){
            System.out.println("You can borow this Hard copy."+"\n"+"Borrowed by : "+name);
            h.member_id = member_id;
        }
    }
    void Borrow(Library l){
        if(l.member_id == 0){
            System.out.println("You can borow this copy."+"\n"+"Borrowed by : "+name);
            l.member_id = member_id;
        }
    }
}
public class LibraryManagement {

    public static void main(String[] args) {
        // TODO code application logic here
        Hard_copy h = new Hard_copy(1,"Jafor Iqbal","Neurone Onuron",350,1012);
        Audio_book a = new Audio_book(1,"Humayun","Himu",550,1320);
        Library l = new Library(1,"ad","kibol",410);
        Member m = new Member("Jafor",1);
        m.Borrow(l);
    }
    
}
