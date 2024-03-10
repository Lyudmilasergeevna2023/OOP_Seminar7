
/**
 * Класс комплексного числа 
 * Общий вид комплексного числа: z = a + b*i, где a - вещественная часть, b*i - мнимая часть (b - вещественное число, i - мнимая единица).
 */
public class ComplexNumber implements iCalculator {
    private int realPart; // вещественная часть комплексного числа
    private int imaginaryPart; // мнимая часть комплексного числа

    public ComplexNumber(int realPart, int imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }    

    
     /**
     * Метод получения вещественной части комплексного числа
     *
     * @return вещественная часть комплексного числа
     */
    public int getRealPart() {
        return realPart;
    }

    
    /**
     * Метод получения мнимой части комплексного числа
     *
     * @return мнимая часть комплексного числа
     */
    public int getImaginaryPart() {
        return imaginaryPart;
    }


    @Override
    public String toString() {
        return realPart + " + " + imaginaryPart + "i";
    }


    /**
     * Метод сложения комплексных чисел
     *
     * @param other - другое комплексное число
     * @return результат сложения комплексных чисел
     */
    @Override
    public iCalculator summation(ComplexNumber other) {
        return new ComplexNumber(this.realPart + other.getRealPart(), this.imaginaryPart + other.getImaginaryPart());
    }


    /**
     * Метод умножения комплексных чисел
     *
     * @param other - другое комплексное число
     * @return результат умножения комплексных чисел
     */
    @Override
    public iCalculator multiplication(ComplexNumber other) {
        int newReal = this.realPart * other.getRealPart() - this.imaginaryPart * other.getImaginaryPart();
        int newImag = this.imaginaryPart * other.getRealPart() + this.realPart * other.getImaginaryPart();
        return new ComplexNumber(newReal, newImag);
    }

    /**
     * Метод деления комплексных чисел
     *
     * @param other - другое комплексное число
     * @return результат деления комплексных чисел
     */
    @Override
    public iCalculator division(ComplexNumber other) {
        int denominator = other.getRealPart() * other.getRealPart() + other.getImaginaryPart() * other.getImaginaryPart();
        int newReal = (this.realPart * other.getRealPart() + this.imaginaryPart * other.getImaginaryPart()) / denominator;
        int newImag = (this.imaginaryPart * other.getRealPart() - this.realPart * other.getImaginaryPart()) / denominator;
        return new ComplexNumber(newReal, newImag);
    }


    /**
     * Метод получения результата операций над комплексными числами
     *
     * @return результат 
     */
    @Override
    public ComplexNumber getResult() {
        return new ComplexNumber(realPart, imaginaryPart);        
    }
}
