public class Main {
    public static void main(String[] args) {
        SavingsAccount sav = new SavingsAccount("SA001", 100000, 5);
        CurrentAccount cur = new CurrentAccount("CA001", 50000, 20000);

        Customer cust = new Customer("Alice");
        cust.addAccount(sav);
        cust.addAccount(cur);

        sav.deposit(20000);
        sav.addInterest();
        System.out.println(sav.generateStatement());

        cur.withdraw(60000);
        System.out.println(cur.generateStatement());

        System.out.println("Total worth: " + cust.totalWorth());
    }
}
