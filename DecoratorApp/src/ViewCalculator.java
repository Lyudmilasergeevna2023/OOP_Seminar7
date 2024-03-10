

import java.util.Scanner;

public class ViewCalculator {

    private iCalculator calculator;

    public ViewCalculator(iCalculator calculator) {
        this.calculator = calculator;
    }

    public void run() {
        while (true) {
            ComplexNumber num1 = new ComplexNumber(promptInt("Введите вещественную часть первого числа: "),promptInt("Введите мнимую часть первого числа: "));
            calculator.summation(num1);
            //ComplexNumber num2 = new ComplexNumber(promptInt("Введите вещественную часть второго аргумента: "),promptInt("Введите мнимую часть второго аргумента: "));
                        
            while (true) {
                String cmd = prompt("Введите команду (+, *, /, =) : ");
                if (cmd.equals("+")) {                    
                    
                    continue;
                }
                if (cmd.equals("*")) { 
                    ComplexNumber num2 = new ComplexNumber(promptInt("Введите вещественную часть второго аргумента: "),promptInt("Введите мнимую часть второго аргумента: "));                   
                    calculator.multiplication(num2);
                    continue;
                }
                if (cmd.equals("/")) { 
                    ComplexNumber num2 = new ComplexNumber(promptInt("Введите вещественную часть второго аргумента: "),promptInt("Введите мнимую часть второго аргумента: "));                  
                    calculator.division(num2);
                    continue;
                }
                if (cmd.equals("=")) {
                    iCalculator result = calculator.getResult();
                    System.out.println("Результат: " + result);
                    break;
                }
            }
            String cmd = prompt("Ещё посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
