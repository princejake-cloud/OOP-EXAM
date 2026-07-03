import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Account> accounts = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addAccount(Account a) {
        accounts.add(a);
    }

    public double totalWorth() {
        double total = 0;
        for (Account a : accounts) {
            total += a.getBalance();
        }
        return total;
    }
}
