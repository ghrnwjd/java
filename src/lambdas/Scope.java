package lambdas;
import java.util.function.Consumer;

public class Scope {
    static int x = 100;
    public static void scopeTest() {

        // 하나의 인자를 받지만, 여기서는 사용하지 않기 때문에 str은 의미 없는 값이된다.
        Consumer<String> fun = str -> {
            System.out.println("x is: " + x);
            int x = 10;
            System.out.println("x is: " + x);
        };

        fun.accept("");

    }

    public static void main(String [] args) {
        scopeTest();
    }
}
