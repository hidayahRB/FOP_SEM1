package lab9;

public class Rectangle extends Shape{
    // Derived a class name Rectangle from Shape. 
    // The class has the extra side length variables. 
    // The class has a method to accept input for both side length and a method to compute the perimeter and area.
    
    private double width,length;
    
    // constructor
    public Rectangle(String name,double width, double length) {
        this.name = name;
        this.width = width;
        this.length = length;
    }
    
    // count perimeter
    public double countPerimeter(){
        double count = (2*width)+(2*length);
        return count;
    }
    
    // count area
    public double countArea(){
        double count = width*length;
        return count;
    }
    
}
