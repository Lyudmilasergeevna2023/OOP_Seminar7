

public class Decorator implements iCalculator {
        
    private CalculatorComplexNumber a;
    private Logger b;

    public Decorator(CalculatorComplexNumber a, Logger b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public iCalculator summation(ComplexNumber otherNumber) {
        ComplexNumber firstNumber = a.getResult();
        b.log("Первое значение калькулятора " + otherNumber + ". Вызов метода summation с числом " + otherNumber);
        iCalculator result = a.summation(otherNumber);
        b.log(String.format("Вызов метода summation произошел"));
        return result;
    }

    
    @Override
    public iCalculator multiplication(ComplexNumber otherNumber) {
        ComplexNumber firstNumber = a.getResult();
        b.log("Первое значение калькулятора " + firstNumber + ". Вызов метода multiplication с числом " + otherNumber);
        iCalculator result = a.multiplication(otherNumber);
        b.log(String.format("Вызова метода multiplication произошел"));
        return result;
    }

    @Override
    public ComplexNumber getResult() {
        ComplexNumber result = a.getResult();
        b.log("Получение результата: " + result);
        return result;
    }



    @Override
    public iCalculator division(ComplexNumber otherNumber) {
        ComplexNumber firstNumber = a.getResult();
        b.log("Первое значение калькулятора " + firstNumber + "Начало вызова метода division с числом " + otherNumber);
        iCalculator result = a.division(otherNumber);
        b.log(String.format("Вызова метода division произошел"));
        return result;
    }


     
}
