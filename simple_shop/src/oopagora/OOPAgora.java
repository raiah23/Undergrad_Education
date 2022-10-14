
package oopagora;

class product{
    int id,price,stock;
    String name;
    product(int id,String name, int price,int stock){
        this.id = id;
        this.price = price;
        this.stock = stock;
        this.name = name;
    }
}
class customer{
    int id;
    String name;
    void print(){
        System.out.println(name);
    }
    customer(int id, String name){
        this.id = id;
        this.name = name;
    }
}
class salesman{
    int id;
    String name;
    salesman(int id, String name){
        this.id = id;
        this.name = name;
    }
    String stock_check(product a, int q){
        if(a.stock > q){
            System.out.println("Product is available");
            return "available";
        }
        else{
            System.out.println("Sorry! product is not available");
            return "sorry";
        }
    }
    void print_receipt(product a, int q, customer b, manager c){
        if(stock_check(a,q).equals("available")){
            System.out.println(name+" sold a product "+a.name+" to "+ b.name);
            c.update_stock(a);
        }
    }
}
class manager{
    int id;
    String name;
    manager(int id, String name){
        this.id = id;
        this.name = name;
    }
    void update_stock(product a){
        System.out.println("Now the stock remains from "+a.stock+": "+(--a.stock));
    }
}

public class OOPAgora {

    public static void main(String[] args) {
        // TODO code application logic here
        salesman amin = new salesman(1,"Amin");
        product mobile = new product(1,"Samgsung",1060,6);
        customer zakir = new customer(2,"Zakaria");
        manager john = new manager(1, "John");
        amin.print_receipt(mobile, 3, zakir, john);
    }
    
}
