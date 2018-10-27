public class Calculator {

    public Calculator() {
    }

    public Calculator(int a, int b) {
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {

        int result = 0;

        if (a == 0) {
            return result;
        } else if (b == 0) {
            System.out.println("Cannot divide by 0");
        } else {
            result = a / b;
        }
        return result;
    }
}
