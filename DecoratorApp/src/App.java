public class App {
   
    public static void main(String[] args) throws Exception {   
       
      CalculatorComplexNumber calc = new CalculatorComplexNumber(new ComplexNumber(0, 0)); // создаем экземпляр калькулятора комплексных чисел
      Decorator decorator = new Decorator(calc, new Logger()); // создаем экземпляр Decorator
      ViewCalculator view = new ViewCalculator(decorator);
      view.run(); 
    }

}
