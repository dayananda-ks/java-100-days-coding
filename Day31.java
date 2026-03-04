// Simple Bank Simulation using OOPS.
// Constructor is used to initialize mandatory details.
// such as account number and account holder name.



import java.util.Scanner;

class MenuOptions {
    void options() {
        System.out.println("Welcome to Banking System...");
        System.out.println("1. Check Balance...");
        System.out.println("2. Deposit Money...");
        System.out.println("3. Withdraw Amount...");
        System.out.println("4. Exit...");
    }
}
class ManditoryDetaails{
    String name;
    int accountNumber;
    double minBalance = 1000;
    double balAmount = 0;

    ManditoryDetaails(String n, int acn){
        this.name = n;
        this.accountNumber = acn;
    }

    void deposit(double depositAmount){
        balAmount += depositAmount;
        System.out.println("Deposited Amount is : " + depositAmount);
    }

    void withdraw(double withdrawAmount){
        double totalBalance = minBalance + balAmount;
        if(totalBalance - withdrawAmount >= minBalance){
            balAmount = totalBalance - withdrawAmount - minBalance;
            System.out.println("Withdraw Amount is : " + withdrawAmount);
        }else{
            System.out.println("Insufficient Balance....");
        }
    }

    void balance(){
        System.out.println("Balance Amount is : " + (balAmount + minBalance));
    }

    void exit(){
        System.out.println("Thank you for visiting...");
    }
}

public class BankSimulation {
    public static void main(String[] args) {

        System.out.println("Must create Account...");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name : ");
        String name = sc.next();

        System.out.print("Enter Account Number : ");
        int accNumber = sc.nextInt();

        ManditoryDetaails mand = new ManditoryDetaails(name, accNumber);
        MenuOptions menuption = new MenuOptions();

        menuption.options();

        while (true){

            System.out.print("Select the option You want : ");
            int opt = sc.nextInt();

            switch (opt) {

                case 4:
                    mand.exit();
                    return;

                case 1:
                    mand.balance();
                    break;

                case 2:
                    System.out.print("Enter the deposit amount : ");
                    double depositAmount = sc.nextDouble();
                    mand.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter the withdraw amount : ");
                    double withdrawAmount = sc.nextDouble();
                    mand.withdraw(withdrawAmount);
                    break;

                default:
                    System.out.println("Select the correct option.....");
            }
        }
    }
}
