
package supertest;

class Box{
    double height;
    double width;
    double depth;
    Box(double h,double w, double d){
        height = h;
        width = w;
        depth = d;
    }
    void print(){
        System.out.println(height+width+depth);
    }
}
class Boxweight extends Box{
    double weight;
    Boxweight(double h,double w, double d,double wg){
        super(h,w,d);
        weight = wg;
    }
}
class Boxcolor extends Box{
    String color;
    Boxcolor(double h,double w, double d,String c){
        super(h,w,d);
        color = c;
    }
}
public class SuperTest {

    public static void main(String[] args) {
        Boxweight bw = new Boxweight(1,2,3,5);
        Boxcolor bc = new Boxcolor(6,7,8,"Red");
        bw.print();
        bc.print();
    }
    
}
