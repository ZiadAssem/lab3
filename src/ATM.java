public class ATM {
     int availableCash = 0;
    boolean login=false;
    ATM(int availableCash){
        this.availableCash=availableCash;
    }

    public String login(Account a,int p){
        if(p==a.getPassword()){
            login=true;
            return "Login successful";
        }else{
            login=false;
            return "Login unsuccessful";

        }

    }

    public String Deposit(Account a,int n){
        if(n>50 && n%10==0 &&a.balance>=n){
            a.balance+=n;
            availableCash+=n;
            return "Deposit successful";
        }
        return "Deposit unsuccessful";
    }
    public String Withdraw(Account a,int n){
        if (availableCash>=n&&a.balance>=n) {
            if (n >= 50 && n % 10 == 0) {
                availableCash -= n;
                a.balance -= n;
                return "Withdraw successful";
            } else {
                return "please choose amount in multiple of 10 and bigger than or equal 50";
            }
        }
           return ("No sufficient funds in ATM");

    }


}
class Account{

    private int accountNo;
    private int password;
    int balance;

    Account(int accountNo, int password, int balance){
        this.accountNo=accountNo;
        this.password=password;
        this.balance=balance;
    }
    public int getPassword(){
        return password;
    }
}