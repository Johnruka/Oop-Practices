package se.lexicon;


public class App {
    public static void main(String[] args) {

       /* BankAccount customer = new BankAccount();
         customer.name = "John Baptist";
         customer.email = "bapti@google.com";
         customer.phoneNumber = "07011112365";
         customer.accountNumber = "782225456521";
         customer.balance = 2000;
         
        System.out.println(customer.depositFund());
        System.out.println(customer.withdrawFund());*/

        String name;
        BankAccount customer1 = new BankAccount( "john Baptist","johb@google.com", "07025686145", "05236545",  2000);
        BankAccount customer2 = new BankAccount( "David lund","david@google.com", "07025673648", "05236855",  4000);

    }
}
