import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    Customer() {
        this.deposits = new ArrayList();
        this.withdraws = new ArrayList();
        this.name = "John";
        this.checkBalance = 0.0D;
        this.savingBalance = 0.0D;
    }

    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.deposits = new ArrayList();
        this.withdraws = new ArrayList();
        this.deposit(checkDeposit, new Date(), "Checking");
    }

    public double deposit(double amt, Date date, String account) {
        if (account.equals("Checking")) {
            this.deposits.add(new Deposit(amt, date, "Checking"));
            this.checkBalance += amt;
            return this.checkBalance;
        } else {
            this.deposits.add(new Deposit(amt, date, "Saving"));
            this.savingBalance += amt;
            return this.savingBalance;
        }
    }

    public double withdraw(double amt, Date date, String account) {
        if (account.equals("Checking") && this.checkingAmount(amt)) {
            this.withdraws.add(new Withdraw(amt, date, "Checking"));
            this.checkBalance -= amt;
            return this.checkBalance;
        } else if (this.savingAmount(amt)) {
            this.withdraws.add(new Withdraw(amt, date, "Saving"));
            this.savingBalance -= amt;
            return this.savingBalance;
        } else {
            return -1.0D;
        }
    }

    private boolean checkingAmount(double amt) {
        return this.checkBalance - amt >= -100.0D;
    }

    private boolean savingAmount(double amt) {
        return this.savingBalance - amt >= -100.0D;
    }

    public void displayDeposits() {
        Iterator var1 = this.deposits.iterator();

        while(var1.hasNext()) {
            Deposit d = (Deposit)var1.next();
            System.out.println(d);
        }

    }

    public void displayWithdraws() {
        Iterator var1 = this.withdraws.iterator();

        while(var1.hasNext()) {
            Withdraw w = (Withdraw)var1.next();
            System.out.println(w);
        }

    }
}
