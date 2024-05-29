import java.util.Scanner;

public class BankingProject {
    public static void main(String[] args) {
        String nameOfUser = "Tony Stark";
        String accountType = "Simple";
        double accountBalance = 1599.99;

        Scanner userInput = new Scanner(System.in);
        System.out.println("Name of user: " + nameOfUser + "\n" + "Type of account: " + accountType + "\n" + "Available Balance: " + accountBalance);

        String menu = """
                Input the number of the operation you would like to perform:
                1 - Get Balance
                2 - Withdraw
                3 - Deposit
                9 - Exit
                """;
        System.out.println(menu);
        int input = userInput.nextInt();

        while (input != 9) {
            switch (input) {
                case 1:
                    System.out.println("Your balance is: " + accountBalance);
                    break;
                case 2:
                    System.out.println("How much would you like to withdraw?");

                    double withdrawalAmount = userInput.nextDouble();
                    if (withdrawalAmount > accountBalance) {
                        System.out.println("Not enough balance to complete action, try again.");
                    } else {
                        accountBalance -= withdrawalAmount;
                        System.out.println("Your balance is " + accountBalance);
                    }
                    break;
                case 3:
                    System.out.println("How much would you like to deposit?");

                    double depositAmount = userInput.nextDouble();
                    if (depositAmount >= 0) {
                        accountBalance += depositAmount;
                        System.out.println("Your balance is " + accountBalance);
                    } else {
                        System.out.println("Invalid amount, try again.");
                    }
                    break;
                default:
                    System.out.println("Not a valid option.");
                    break;

            }
            System.out.println(menu);
            input = userInput.nextInt();

        }
        System.out.println("Thank you for using our services!");

    }
}
