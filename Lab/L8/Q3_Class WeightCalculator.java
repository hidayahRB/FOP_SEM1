package lab8;

public class Q3 {

    public static void main(String[] args) {
        // Define a class name WeightCalculator. 
        // The class has an input method that accepts the user’s age and height. 
        // Besides, the class consists a method that calculating the recommend weight with this formula
        // recommend weight = (height – 100 + age / 10) * 0.9
        // The class will display the user’s age, height and the recommend weight.
        
        WeightCalculator a = new WeightCalculator(20,161);
        a.display();
    }
    
}


public class WeightCalculator {
    private double age,height, weight;
    
    // constructor
    public WeightCalculator(int age, double height) {
        this.age = age;
        this.height = height;
    }
    
    // recommend weight
    public double recommendWeight(){
        weight = (height - 100 + age/10) * 0.9;
        return weight;
    }
    
    // display
    public void display(){
        System.out.printf("Age : %.0f\nHeight : %.2fm\nRecommend weight : %.2fkg\n",age,height,recommendWeight());
    }
    
}
