
package interface_exam;

class Account{
    int id;
    int balance;
    Account(int id,int balance){
        this.id = id;
        this.balance = balance;
    }
}
interface Withdraw_money{
    void withdraw();
}
interface Total_days{
    void open_for(int days);
}
interface Deposit{
    void deposit();
}
class Saving_account extends Account implements Withdraw_money,Total_days{
    Saving_account(int i, int b){
        super(i,b);
    }
    public void withdraw(){
        System.out.println("your deposited amount is "+balance);
    }
    public void open_for(int days){
        System.out.println("Total days opened "+days);
    }
}
class Deposit_account extends Account implements Deposit{
    Deposit_account(int i,int b){
        super(i,b);
    }
    public void deposit(){
        System.out.println("Your withdraw amount is "+balance);
    }
}
public class Interface_exam {

    public static void main(String[] args) {
        Deposit_account Alam = new Deposit_account(1, 1000);
        Saving_account Ali = new Saving_account(1, 2000);
        Alam.deposit();
        Ali.withdraw();
        Ali.open_for(360);
    }
    
}
