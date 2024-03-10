
/**
 * Класс описывает структуру калькулятора комплексных чисел
 */
public final class CalculatorComplexNumber implements iCalculator {
    private ComplexNumber num;
    
    public CalculatorComplexNumber(ComplexNumber num) {
        this.num = num;
    }
  
    
    /**
     * Метод сложения комплексных чисел
     *
     * @param otherNumber - другое комплексное число
     * @return результат сложения комплексных чисел
     */
    @Override
    public iCalculator summation(ComplexNumber otherNumber) {
        return new ComplexNumber(this.num.getRealPart() + otherNumber.getRealPart(), this.num.getImaginaryPart() + otherNumber.getImaginaryPart());
    }


    /**
     * Метод умножения комплексных чисел
     *
     * @param otherNumber - другое комплексное число
     * @return результат умножения комплексных чисел
     */
    @Override
    public iCalculator multiplication(ComplexNumber otherNumber) {
        int newReal = this.num.getRealPart() * otherNumber.getRealPart() - this.num.getImaginaryPart() * otherNumber.getImaginaryPart();
        int newImag = this.num.getImaginaryPart() * otherNumber.getRealPart() + this.num.getRealPart() * otherNumber.getImaginaryPart();
        return new ComplexNumber(newReal, newImag);
    }



    /**
     * Метод деления комплексных чисел
     *
     * @param otherNumber - другое комплексное число
     * @return результат деления комплексных чисел
     */
    @Override
    public iCalculator division(ComplexNumber otherNumber) {
        int denominator = otherNumber.getRealPart() * otherNumber.getRealPart() + otherNumber.getImaginaryPart() * otherNumber.getImaginaryPart();
        int newReal = (this.num.getRealPart() * otherNumber.getRealPart() + this.num.getImaginaryPart() * otherNumber.getImaginaryPart()) / denominator;
        int newImag = (this.num.getImaginaryPart() * otherNumber.getRealPart() - this.num.getRealPart() * otherNumber.getImaginaryPart()) / denominator;
        return new ComplexNumber(newReal, newImag);
    }

    
    
    /**
     * Метод получения результата операций над комплексными числами
     *
     * @return результат 
     */
    @Override
    public ComplexNumber getResult() {
        return new ComplexNumber(this.num.getRealPart(), this.num.getImaginaryPart());
    }

    
} 
