import java.util.Scanner;


class Calculation {
    int num1;
    int num2;
    int Opertion;
    public void opertionsDisplay(){
        System.out.println("Welcome to Calculator...");
        System.out.println("1.Add");
        System.out.println("2.Sub");
        System.out.println("3.Mul");
        System.out.println("4.Div");
        System.out.println("5.Exit");

    }

    public void Add() {
        System.out.println("Sum of two number  : " + (num1 + num2));
    }

    public void Sub() {
        System.out.println("Sub of two number  : " + (num1 - num2));

    }

    public void Mul() {
        System.out.println("Mul of two number  : " + num1 * num2);

    }

    public void Div() {
        if (num1 == 0) {
            System.out.println("Div of two number  : " + num1 / num2);
        } else {
            System.out.println("Enter the valid Number 0 is not divsible... ");
        }

    }
    public void end() {
        System.out.println("Thank You For Visit....");
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculation calc = new Calculation();
        calc.opertionsDisplay();
        while (true) {
            System.out.print("Enter the Opertion You want (1 to 5):");
            calc.Opertion = scanner.nextInt();
            if (calc.Opertion == 5) {
                calc.end();
                return;
            } else {
                System.out.print("Enter the First Number : ");
                calc.num1 = scanner.nextInt();

                System.out.print("Enter the Second Number : ");
                calc.num2 = scanner.nextInt();

                switch (calc.Opertion) {
                    case 1:
                        calc.Add();
                        break;
                    case 2:
                        calc.Sub();
                        break;
                    case 3:
                        calc.Mul();
                        break;
                    case 4:
                        calc.Div();
                        break;
                    default:
                        System.out.println("Enter the valid Options..");
                }
            }
        }
    }
}
