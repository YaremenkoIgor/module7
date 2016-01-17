import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Калькулятор запущен в обычном режиме, если вы хотите выбрать инженерный режим введите слово switch. Для продолжения работы в обычном реыыжиме введите любой символ ");
        String change = scanner.next();

        if (!change.equals("switch")) {
            System.out.println("Введите первое число :");
            double number1 = scanner.nextDouble();

            System.out.println("Введите знак операции :");
            String operation = scanner.next();

            System.out.println("Введите второе число :");
            double number2 = scanner.nextDouble();

            scanner.close();

            System.out.println("Результат : " + Calc.defaultCalc(number1, operation, number2));
        } else {
            System.out.println("Вы в режиме инженерного калькулятора введите уровнение ");
            String exp = scanner.next();

            System.out.println("Результат :" + Calc.eval(exp));
        }
    }

}

