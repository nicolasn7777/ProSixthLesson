package calc_documented;

/**
 * Public class Calculation contains methods for primitive operations of addition, subtraction, multiplication
 * and division of default values, which are specified in the annotation @Values.
 * @author Papa Carlo
 * @version 1.0
 * @since 30/01/2023
 */

public class Calculation {
    /**
     * Method that performs the append action with default annotation values
     * */
    @Values()
    public void sum(int number1, int number2) {
        System.out.println(number1 + number2);
    }
    /**
     * Method that performs a subtraction operation with default annotation values
     * */
    @Values()
    public void sub(int number1, int number2) {
        System.out.println(number1 - number2);
    }
    /**
     * Method that performs a multiplication operation with default annotation values
     * */
    @Values()
    public void mul(int number1, int number2) {
        System.out.println(number1 * number2);
    }
    /**
     * Method that performs a division operation with default annotation values
     * */
    @Values()
    public void div(int number1, int number2) {
        if (number2 == 0) {
            try {
                System.out.println(number1 / number2);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } else {
            {
                System.out.println(number1 / number2);
            }
        }
    }
}
