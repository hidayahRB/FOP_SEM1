
public class Q2 {

    public static void main(String[] args) {
        // A class BankAccount allows the customer to 
        // open the saving account with their name, IC or passport number and the deposit amount. 
        // The class consists of deposit method and withdraws method. 
        // Besides, the class can display the current balance.
        
        BankAccount a = new BankAccount("Maxi","010204-05-6789",1500);
        a.setCashOut(27); // withdraw
        a.display();
    }
    
}

public class BankAccount {
    private String name, ic;
    private int deposit, cashOut;
    
    // constructor
    public BankAccount(String name, String ic, int deposit) {
        this.name = name;
        this.ic = ic;
        this.deposit = deposit;
    }
    
    // setter
    public void setCashOut(int cashOut) {
        this.cashOut = cashOut;
    }
    
    // deposit method
    public int bankIn(){
        return deposit;
    }
    
    // withdraws method
    public int withdraw(){
        int balance = deposit - cashOut;
        return balance;
    }
    
    // display information
    public void display(){
        System.out.println("Name     : "+name+"\nIC       : "+ic+"\nDeposit  : RM"
                +deposit+"\nWithdraw : RM"+cashOut+"\nBalance  : RM"+withdraw());
    }
}
