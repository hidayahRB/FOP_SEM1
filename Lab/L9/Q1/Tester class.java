package lab9;

public class Q1 {
    
    public static void main(String[] args) {
        
        Rectangle a = new Rectangle("Rectangle",4,6);
        a.setArea(a.countArea());
        a.setPerimeter(a.countPerimeter());
        a.display();
        
        Square b = new Square("Square",5);
        b.setPerimeter(b.countPerimeter());
        b.setArea(b.countArea());
        b.display();
        
        Circle c = new Circle("Circle",6);
        c.setPerimeter(c.countPerimeter());
        c.setArea(c.countArea());
        c.display();
    }
    
}
