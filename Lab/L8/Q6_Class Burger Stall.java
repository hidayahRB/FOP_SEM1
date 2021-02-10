package lab8;

public class Q6 {

    public static void main(String[] args) {
        // Each burger stall has an ID and the number of burger sold for the day. 
        // a sold method that increment the number of burger sold by parameter value. 
        // The class also contains a variable and method that tracks the total number of burgers sold in all stalls. 
        // Display the total burger sold by each stall and the total number of burgers sold in all stalls.
        
        Burger a = new Burger();
        Burger b = new Burger();
        
        a.setId("123MY");          // ID of the stall
        a.setburgerPerDay(175);     // number of burger sold per day
        a.setParameter(30);         
        b.setId("876MY");
        b.setburgerPerDay(230);
        b.setParameter(30);         
        a.display();
        b.display();
        int total = a.totalSold() + b.totalSold();
        System.out.println("Total burgers sold : "+total);
        
    }
    
}

package lab8;

public class Burger {
    private String id;
    private int burgerPerDay, parameter;
    
    // constructor
    public Burger() {
        id = "";
        burgerPerDay = 0;
    }
    
    // setter
    public void setId(String id) {
        this.id = id;
    }

    public void setburgerPerDay(int burgerPerDay) {
        this.burgerPerDay = burgerPerDay;
    }
    
    public void setParameter(int parameter) {
        this.parameter = parameter;
    }
    
    // sold method (per day * parameter)
    public int totalSold(){
        int count = burgerPerDay * parameter;
        return count;
    }
     
    // display
    public void display(){
        System.out.println("ID : "+id+"\nSold per Day : "+burgerPerDay+"\nSold for "+parameter+" days : "+totalSold());
        System.out.println();
    }           
}
