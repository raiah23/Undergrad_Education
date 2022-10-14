
package interface_shapes;

interface I2D_shapes{
    void area(double w);
}
interface I3D_shapes{
    void area(double r, double h);
    void volume(double r, double h);
}

class Circle implements I2D_shapes{
    public void area(double w){
        System.out.println("Circle : "+3.1416*w*w);
    }
}
class Ractangle implements I2D_shapes{
    double l;
    Ractangle(double l){
        this.l = l;
    }
    public void area(double w){
        System.out.println("Ractangle : "+w*l);
    }
}
class Cone implements I3D_shapes{
    public void area(double r, double h){
        System.out.println("Cone Area : "+3.1416*r*(r+(0.5*(h*h+r*r))));
    }
    public void volume(double r, double h){
        System.out.println("Cone Volume : "+(3.1416*r*r*h)/3);
    }
}
class Cylinder implements I3D_shapes{
    public void area(double r, double h){
        System.out.println("Cylinder area : "+2*3.1416*r*h + 2*3.1416*r*r);
    }
    public void volume(double r, double h){
        System.out.println("Cylinder volume : "+3.1416*r*r*h);
    }
}

public class Interface_Shapes {

    public static void main(String[] args) {
        Circle cr = new Circle();
        cr.area(3);
        Ractangle r = new Ractangle(3);
        r.area(5);
        Cone co = new Cone();
        co.area(4, 5);
        co.volume(8, 18);
        Cylinder cy = new Cylinder();
        cy.area(3,9);
        cy.volume(8, 15);
    }
    
}
