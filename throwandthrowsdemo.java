package AssistedPractice;

class CustomException extends Exception {
    CustomException(String message) {
        super(message);
    }
}

public class throwandthrowsdemo {
    public static void main(String[] args) {
        try {
            int age = 15;
            validateAge(age);
        } catch (CustomException e) {
            System.err.println("Custom Exception: " + e.getMessage());
        }
    }

    static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age is below 18. Not eligible.");
        }
    }
}