package lab9;

import static java.lang.Math.pow;

public class Circle extends Shape{
    // Derived another class name Circle from Shape. 
    // The class has the extra diameter variable. 
    // The class has a method to accept input for diameter and a method to compute the perimeter and area.
    
    private double diameter;
    
    // constructor
    public Circle(String name,double diameter) {
        this.name = name;
        this.diameter = diameter;
      
    }
    
    // count perimeter
    public double countPerimeter(){
        double count = Math.PI * diameter;
        return count;
    }
    
    // count area
    public double countArea(){
        double count = Math.PI * pow((diameter/2),2);
        return count;
    }
}
