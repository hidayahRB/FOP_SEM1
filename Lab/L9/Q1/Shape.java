package lab9;

public class Shape {
    // Define a class Shape. 
    // - has a name, perimeter and area. 
    // - has the accessor method and mutator for perimeter and area. 
    // - has a display method to display the name of the shape, perimeter and area in two decimal points. 
    
    protected String name;
    private double perimeter, area;
    
    // accessor and mutator
    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
    
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    // display 
    public void display(){
        System.out.printf("Name      : %s\nPerimeter : %.2fm\nArea      : %.2fm\n\n",name,perimeter,area);
    }
}
