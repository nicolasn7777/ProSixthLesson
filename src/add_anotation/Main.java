package add_anotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        MathSum mathSum = new MathSum();
        Class <?> cl = MathSum.class;
        try {
            Method m = cl.getDeclaredMethod("mathSum", int.class, int.class);
            Math math = m.getAnnotation(Math.class);
            mathSum.mathSum(math.num1(), math.num2());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
