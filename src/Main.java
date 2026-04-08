import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<BankAccount> accounts = new LinkedList<>();
        Stack<String> history = new Stack<>();
        Queue<String> billQueue = new LinkedList<>();
        Queue<BankAccount> requests = new LinkedList<>();

        while (true) {
            System.out.println("\n1 - Bank");
            System.out.println("2 - ATM");
            System.out.println("3 - Admin");
            System.out.println("4 - Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println("\n1 - Add Account Request");
                System.out.println("2 - Deposit");
                System.out.println("3 - Withdraw");
                System.out.println("4 - Add Bill");

                int bankChoice = sc.nextInt();
                sc.nextLine();

                if (bankChoice == 1) {
                    System.out.print("Enter username: ");
                    String name = sc.nextLine();

                    requests.add(new BankAccount(0, name, 0));
                    System.out.println("Request added!");
                }

                else if (bankChoice == 2) {
                    System.out.print("Enter username: ");
                    String name = sc.nextLine();

                    for (BankAccount acc : accounts) {
                        if (acc.username.equals(name)) {
                            System.out.print("Enter amount: ");
                            double amount = sc.nextDouble();

                            acc.balance += amount;
                            history.push("Deposit " + amount + " to " + name);

                            System.out.println("New balance: " + acc.balance);
                        }
                    }
                }

                else if (bankChoice == 3) {
                    System.out.print("Enter username: ");
                    String name = sc.nextLine();

                    for (BankAccount acc : accounts) {
                        if (acc.username.equals(name)) {
                            System.out.print("Enter amount: ");
                            double amount = sc.nextDouble();

                            if (acc.balance >= amount) {
                                acc.balance -= amount;
                                history.push("Withdraw " + amount + " from " + name);
                                System.out.println("New balance: " + acc.balance);
                            } else {
                                System.out.println("Not enough money!");
                            }
                        }
                    }
                }

                else if (bankChoice == 4) {
                    System.out.print("Enter bill name: ");
                    String bill = sc.nextLine();

                    billQueue.add(bill);
                    System.out.println("Added: " + bill);
                }
            }

            else if (choice == 2) {
                System.out.print("Enter username: ");
                String name = sc.nextLine();

                for (BankAccount acc : accounts) {
                    if (acc.username.equals(name)) {
                        System.out.println("Balance: " + acc.balance);
                    }
                }
            }

            else if (choice == 3) {
                System.out.println("\n1 - Process account request");
                System.out.println("2 - Show all accounts");
                System.out.println("3 - Show history");
                System.out.println("4 - Process bill");
                System.out.println("5 - Show bill queue");

                int adminChoice = sc.nextInt();
                sc.nextLine();

                if (adminChoice == 1) {
                    if (!requests.isEmpty()) {
                        BankAccount acc = requests.poll();
                        acc.accountNumber = accounts.size() + 1;
                        accounts.add(acc);
                        System.out.println("Account created for: " + acc.username);
                    } else {
                        System.out.println("No requests!");
                    }
                }

                else if (adminChoice == 2) {
                    for (BankAccount acc : accounts) {
                        acc.display();
                    }
                }

                else if (adminChoice == 3) {
                    if (!history.isEmpty()) {
                        System.out.println("Last: " + history.peek());
                    } else {
                        System.out.println("No history");
                    }
                }

                else if (adminChoice == 4) {
                    if (!billQueue.isEmpty()) {
                        System.out.println("Processing: " + billQueue.poll());
                    } else {
                        System.out.println("No bills!");
                    }
                }

                else if (adminChoice == 5) {
                    System.out.println("Bills: " + billQueue);
                }
            }

            else if (choice == 4) {
                System.out.println("Goodbye!");
                break;
            }
        }
    }
}