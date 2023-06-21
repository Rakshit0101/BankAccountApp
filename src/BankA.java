import java.util.UUID;

public class BankA implements BankGeneralModel {
   private  String userName;
   private String accountNumber ;
   private double balance;
   private String password;
   private final double rateOfInterest = 6.2;

   public BankA(){

   }

    public BankA(String userName, double balance,String password) {
        this.userName = userName;
        this.balance = balance;
        this.password = password;
        this.accountNumber = UUID.randomUUID().toString();
    }

    public String getUserName() {
        return userName;
    }



    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }



    public String getPassword() {
        return password;
    }



    public double getRateOfInterest() {
        return rateOfInterest;
    }

    @Override
    public String fetchBalance(String password) {
       if(this.password.equals(password))
           return "Your current Balance " + balance;
        return "incorrect password";
    }

    @Override
    public double addMoney(double amount) {
      this.balance +=amount;
        return balance;
    }

    @Override
    public String withdrawMoney(String password, double amount) {
       if(this.password.equals(password)){
           if(amount<=this.balance){
               this.balance -= amount;
               return "Amount "+ amount + " has been withdrawn "+ "rem balance is "+ this.balance;
           }
           else {
               return "Insufficient balance";
           }
       }

        return "Incorrect Password";
    }

    @Override
    public String changePassword(String newPassword, String oldPassword) {
       if(this.password.equals(oldPassword)){
           this.password = newPassword;
           return "Congrats! password updated";
       }
        return "Incorrect Password";
    }

    @Override
    public double calculateInterest(int years) {
        return this.balance*this.rateOfInterest*years;
    }
}
