package src;

public class MyCalcApp {
    public static void main(String[] args) {
        java.io.Console console = System.console();

        String input = console.readLine("Enter an integer number: ");
        Calculator calculator = new Calculator();
        double result = calculator.calculateDouble(Integer.parseInt(input));
        System.out.println("Entered number is: " + result);
    }
}

