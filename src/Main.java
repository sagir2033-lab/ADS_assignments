import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<BankAccount> accounts = new LinkedList<>();
        Stack<String> history = new Stack<>();
        Queue<String> billQueue = new LinkedList<>();
        Queue<BankAccount> requests = new LinkedList<>();

        BankAccount[] arr = new BankAccount[3];

        arr[0] = new BankAccount(1, "Aruzhan", 1000);
        arr[1] = new BankAccount(2, "Arman", 2000);
        arr[2] = new BankAccount(3, "Dana", 3000);

        accounts.addAll(Arrays.asList(arr));

        System.out.println();
        for (BankAccount acc : accounts) {
            acc.display();
        }

        while (true) {
            System.out.println("1 - Enter Bank");
            System.out.println("2 - Enter ATM");
            System.out.println("3 - Admin Area");
            System.out.println("4 - Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println("1 - Add Account Request");
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
                            examples1.addDeposit(history, name, amount);

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
                                examples1.addWithdraw(history, name, amount);

                                System.out.println("New balance: " + acc.balance);
                            } else {
                                System.out.println("Not enough money!");
                            }
                        }
                    }
                }
                else if (bankChoice == 4) {
                    examples.addBill(billQueue, sc);
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
                System.out.println("1 - Process account request");
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
                    examples1.showLast(history);
                }

                else if (adminChoice == 4) {
                    examples.processBill(billQueue);
                }

                else if (adminChoice == 5) {
                    examples.showBills(billQueue);
                }
            }
            else if (choice == 4) {
                System.out.println("Goodbye!");
                break;
            }
        }
    }
}