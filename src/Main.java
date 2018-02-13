import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static Scanner scannerInt = new Scanner(System.in);


    public static void main(String[] args) {
        runCalculatorMenu();
    }

    public static void runCalculatorMenu() {
        Calculator calculator = new Calculator();
        int firstNumber;
        int secondNumber;
        String operation = "";

        do {
            System.out.println("Please enter an operation symbol:" +
                    "\n\t\"+\" - plus" +
                    "\n\t\"-\" - minus" +
                    "\n\t\"*\" - multiplication" +
                    "\n\t\"/\" - devide" +
                    "\nOr press \"q\" to quit.");
            operation = scanner.nextLine();
            if (operation.equals("q")) {
                break;
            } else if (!(operation.equals("+")) ||
                    (operation.equals("-")) ||
                    (operation.equals("*")) ||
                    (operation.equals("/"))) {
                System.out.println("Wrong operation symbol, try again...");
                continue;
            }
            System.out.println("Please enter a first number!");
            firstNumber = inputNumber();
            System.out.println("Please enter a second number!");
            secondNumber = inputNumber();
            switch (operation) {
                case "+":
                    System.out.println(calculator.plus(firstNumber, secondNumber));
                    break;
                case "-":
                    System.out.println(calculator.minus(firstNumber, secondNumber));
                    break;
                case "*":
                    System.out.println(calculator.multiplication(firstNumber, secondNumber));
                    break;
                case "/":
                    System.out.println(calculator.devide(firstNumber, secondNumber));
                    break;
                case "q":
                    break;
            }
        } while (true);


    }


    public static int inputNumber() {
        int number;
        while (!scannerInt.hasNextInt()) {
            System.out.println("That not a number!");
            scannerInt.next();
        }
        number = scannerInt.nextInt();
        return number;
    }

    /*public static int factorial(int number) {
                if (number == 1) {
                    return 1;
                }
                return factorial(number - 1) * number;
    }*/

}