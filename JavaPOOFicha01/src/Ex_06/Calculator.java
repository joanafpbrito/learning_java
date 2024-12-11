package Ex_06;

public class Calculator {

    public Calculator() {
    }

    public double result (String operator, double number, double numberTwo) {
        double result = 0;
        switch (operator) {
            case "+" :
                result = number + numberTwo;
                break;
            case "-" :
                result = number - numberTwo;
            break;
            case "*" :
                result = number * numberTwo;
            break;
            case "/" :
                result = number / numberTwo;
            break;
        }
        return result;
    }

}
