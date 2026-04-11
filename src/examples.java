import java.util.*;
public class examples {

    public static void addBill(Queue<String> billQueue, Scanner sc) {
        System.out.print("Enter bill name: ");
        String bill = sc.nextLine();
        billQueue.add(bill);
        System.out.println("Added: " + bill);
    }

    public static void processBill(Queue<String> billQueue) {
        if (!billQueue.isEmpty()) {
            System.out.println("Processing: " + billQueue.poll());
        } else {
            System.out.println("No bills!");
        }
    }

    public static void showBills(Queue<String> billQueue) {
        System.out.println("Bills: " + billQueue);
    }
}