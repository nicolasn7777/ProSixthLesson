package calc_documented;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Public class Main contains an entry point to the program.
 * @author Papa Carlo
 * @version 1.0
 * @since 30/01/2023
 */
public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Choose an arithmetic operation for numbers 100 and 200:");
            String sign = in.next();

            Calculation calculation = new Calculation();
            Class<?> cl = Calculation.class;
            try {
                switch (sign) {
                    case "+": {
                        Method method = cl.getMethod("sum", int.class, int.class);
                        Values values = method.getAnnotation(Values.class);
                        System.out.println("Result: ");
                        calculation.sum(values.number1(), values.number2());
                        break;
                    }
                    case "-": {
                        Method method = cl.getMethod("sub", int.class, int.class);
                        Values values = method.getAnnotation(Values.class);
                        System.out.println("Result: ");
                        calculation.sub(values.number1(), values.number2());
                        break;
                    }
                    case "*": {
                        Method method = cl.getMethod("mul", int.class, int.class);
                        Values values = method.getAnnotation(Values.class);
                        System.out.println("Result: ");
                        calculation.mul(values.number1(), values.number2());
                        break;
                    }
                    case "/": {
                        Method method = cl.getMethod("div", int.class, int.class);
                        Values values = method.getAnnotation(Values.class);
                        System.out.println("Result: ");
                        calculation.div(values.number1(), values.number2());
                        break;
                    }
                    default:
                        System.out.println("I didn't understand the action :(");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
