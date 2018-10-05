
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account Matt = new Account("Matt's account", 1000.0);
        Account Mine = new Account("My account", 0.0);

        Matt.withdrawal(100.0);
        Mine.deposit(100.0);

        System.out.println(Matt);
        System.out.println(Mine);
    }

}
