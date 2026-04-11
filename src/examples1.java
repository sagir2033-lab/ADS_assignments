import java.util.*;

public class examples1 {

    public static void addDeposit(Stack<String> history, String name, double amount) {
        history.push("Deposit " + amount + " to " + name);
    }

    public static void addWithdraw(Stack<String> history, String name, double amount) {
        history.push("Withdraw " + amount + " from " + name);
    }

    public static void showLast(Stack<String> history) {
        if (!history.isEmpty()) {
            System.out.println("Last: " + history.peek());
        } else {
            System.out.println("No history");
        }
    }
}