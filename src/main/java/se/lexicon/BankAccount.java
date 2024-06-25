package se.lexicon;

public class BankAccount {

    String name;
    String email;
    String phoneNumber;
    String accountNumber;
    int balance;

    public BankAccount(String name, String email, String phoneNumber, String accountNumber, int balance) {
        name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public String depositFund() {
        String result = "depositedAmount";
        return result;
    }

    public boolean withdrawFund() {
        String result = "withdrawnAmount";
        int withdrawnAmount = 0;


        if (withdrawnAmount == 0) {
            return false;
        }
        return false;
    }
}
