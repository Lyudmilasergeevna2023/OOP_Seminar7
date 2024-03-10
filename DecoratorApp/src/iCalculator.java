
/**
 * Интерфейс методов калькулятора
 */
public interface iCalculator {
    iCalculator summation(ComplexNumber other);
    iCalculator multiplication(ComplexNumber other);
    iCalculator division(ComplexNumber other);
    ComplexNumber getResult();
}
