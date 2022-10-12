import java.util.Scanner;

public class SimpleCalc {

    public static void main(String[] args) {

        char operator;
        Double number1, number2, result;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        number1 = input.nextDouble();

        System.out.println("Operator: +, -, *, or /");
        operator = input.next().charAt(0);

        System.out.println("Second number:");
        number2 = input.nextDouble();

        switch (operator) {
            case '+' -> {
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
            }
            case '-' -> {
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
            }
            case '*' -> {
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
            }
            case '/' -> {
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
            }
            default -> System.out.println("Invalid!");
        }

        input.close();
    }
}