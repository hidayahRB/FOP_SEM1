package lab9;

public class Square extends Shape {
    // Derived another class name Square from Shape. 
    // The class has the extra side length variable. 
    // The class has a method to accept input for side length and a method to compute the perimeter and area. 
    
    private double width;
    
    // constructor
    public Square(String name,double width) {
        this.name = name;
        this.width = width;
      
    }
    
    // count perimeter
    public double countPerimeter(){
        double count = 4*width;
        return count;
    }
    
    // count area
    public double countArea(){
        double count = width*width;
        return count;
    }
}
