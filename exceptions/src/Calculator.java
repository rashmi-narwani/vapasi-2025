package src;

public class Calculator {

    double calculateDouble(int input) {
        if (input == 0) {
            throw new MyArithException("Zero input is not allowed.");
        } else if (input < 0) {
            throw new MyArithException("Negative input is not allowed.");
        }

        return input;
    }
}
