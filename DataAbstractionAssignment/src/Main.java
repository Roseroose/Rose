import java.util.Calendar;
import java.util.Date;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Customer test = new Customer("John", 23432423, 500.25D, 50.0D);
        test.deposit(400.0D, new Date(2022, Calendar.JANUARY, 28), "Checking");
        test.deposit(500.0D, new Date(), "Saving");
        test.displayDeposits();
        System.out.println(test.deposit(500.0D, new Date(), "Saving"));
    }
}
