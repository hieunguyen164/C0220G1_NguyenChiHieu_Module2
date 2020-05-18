package service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public double add(double number1, double number2) {
        return number1+number2;
    }

    @Override
    public double sub(double number1, double number2) {
        return number1-number2;
    }

    @Override
    public double mul(double number1, double number2) {
        return number1*number2;
    }

    @Override
    public double div(double number1, double number2) {
        return number1/number2;
    }
    @Override
    public double calculate(double number1,double number2,String operand){
        switch (operand){
            case "Addition(+)":
                return add(number1,number2);

            case "Subtraction(-)":
                return sub(number1,number2);

            case "Multiplication(*)":
                return mul(number1,number2);

            case "Division(/)":
                return div(number1,number2);
            default:
                return -1;
        }
    }
}
