package oop_abstract;

abstract class Account{
    int monthly_charge;
    int balance;
    Account(int charge, int balance){
        monthly_charge = charge;
        this.balance = balance;
    }
    abstract void Loan_taken(String perc);
    abstract void Money_remains(int withdraw);
}
interface ICalculation{
    void yearly_charge_rate();
}
class Saving_account extends Account{
    Saving_account(int charge, int b){
        super(charge, b);
    }
    void Loan_taken(String perc){
        System.out.println("Your Total Loan amount in perchantage is "+perc);
    }
    void Money_remains(int withdraw){
        System.out.println("Your money remains "+ (balance-withdraw));
    }
}
class Current_account extends Account implements ICalculation{
    Current_account(int charge, int b){
        super(charge, b);
    }
    public void yearly_charge_rate(){
        System.out.println("Yearl charge will be "+monthly_charge*12);
    }
    void Loan_taken(String perc){
        System.out.println("Your Total Loan amount in perchantage is "+perc);
    }
    void Money_remains(int withdraw){
        System.out.println("Your money remains "+ (balance-withdraw));
    }
}


public class OOP_Abstract {

    public static void main(String[] args) {
        Saving_account s = new Saving_account(100, 50000);
        Current_account c = new Current_account(200, 34000);
        c.yearly_charge_rate();
        s.Loan_taken("50%");
        c.Money_remains(5000);
    }
    
}
