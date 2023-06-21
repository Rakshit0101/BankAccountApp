import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankA account1 = new BankA("Rakshit",100000,"pass%word");
        System.out.println("Congrats! "+ account1.getUserName() +
                " your account has been created with account number "+ account1.getAccountNumber());

        BankA account2 = new BankA("Shyam",6000,"das%word");
        System.out.println("Congrats! "+ account2.getUserName() +
                " your account has been created with account number "+ account2.getAccountNumber());

        account1.addMoney(132);

        System.out.println(account1.withdrawMoney("pass%word",24121));
        System.out.println(account2.withdrawMoney("pass%word",121));
        System.out.println(account2.withdrawMoney("das%word",24121));

        System.out.println(account2.fetchBalance("das%word"));

        System.out.println(account2.changePassword("newpas%word","das%word"));

        System.out.println(account2.fetchBalance("newpas%word"));

        System.out.println("Enter number of years to calculate Interest ");
        int years =  new Scanner(System.in).nextInt();
        System.out.println(  "Interest for " + account1.getUserName() + " is "+ account1.calculateInterest(years));



        System.out.println(account1.fetchBalance("pass%word"));

    }
}