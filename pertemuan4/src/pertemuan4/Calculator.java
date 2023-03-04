package pertemuan4;

public class Calculator {
    private String inputString;

    public Calculator(String perhitungan) {
        this.inputString = perhitungan;
    }

    public double calculateHasil() {
        String[] input_splitted = inputString.split(" ");
        double temp_hasil = 0.0;
        String current_operator = "";
        double temp_number1 = 0.0, temp_number2 = 0.0;
        boolean number1_empty = true, number2_empty = true, operator_empty = true;
        for (String eachCharacter : input_splitted) {
            if (number1_empty) {
                temp_number1 = Integer.parseInt(eachCharacter);
                number1_empty = false;
            } else if (operator_empty) {
                current_operator = eachCharacter;
                operator_empty = false;
            } else if (number2_empty) {
                temp_number2 = Integer.parseInt(eachCharacter);
                number2_empty = false;
            }
            if (!number1_empty && !number2_empty && !operator_empty) {
                temp_hasil = calculateTwoNumbers(temp_number1, temp_number2, current_operator);
                temp_number1 = temp_hasil;
                number2_empty = true;
                operator_empty = true;
            }
        }
        return temp_hasil;
    }

    public double calculateTwoNumbers(double a, double b, String operator) {
        double result;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "/":
                result = a / b;
                break;
            case "*":
                result = a * b;
                break;
            case "%":
                result = a % b;
                break;
            default:
                System.out.println("Operator not Valid");
                return 0;
        }
        System.out.println(a + " " + operator + " " + b + " = " + result);
        return result;
    }

    public String getInput() {
        return this.inputString;
    }
}
