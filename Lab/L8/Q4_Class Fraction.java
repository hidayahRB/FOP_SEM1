package lab8;

public class Q4 {

    public static void main(String[] args) {
        // Define a class Fraction. 
        // The class has an input method that accepts the numerator and the denominator from the user.
        // Use the mutator method to set the numerator and denominator and the accessor method to get the value of numerator and denominator. 
        // This class also has a method to display the fraction reduced to lowest terms. 
        // (find the greatest common divisor for the numerator and denominator
        
        Fraction a = new Fraction();
        a.setNumerator(6);
        a.setDenominator(18);
        System.out.println("Numerator : "+a.getNumerator()+"\nDenominator : "+a.getDenominator());
        a.reducedFraction(a.getNumerator(), a.getDenominator());
        a.display();
    }
}

package lab8;

public class Fraction {
    private int numerator, denominator;
    
    // constructor
    public Fraction() {
        numerator = 0;
        denominator = 0;
    }
     
    // mutator
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
    // accessor
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    
    // finding gcd
    public int gcd(int num1, int num2) {
        if(num2 == 0){ 
            return num1; 
        } 
        return gcd(num2, num1%num2);// replace to the next round findGCD
    }
    
    // reduce fraction method
    public String reducedFraction(int numerator, int denominator){
        int d = gcd(numerator, denominator);
        int x = numerator / d;
        int y = denominator / d; 
        return String.format("%d/%d", x,y);
    }
    
    public void display(){
        System.out.println("Fraction : "+ reducedFraction(numerator, denominator));
    }
}
