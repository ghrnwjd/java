package lambdas;

import java.util.concurrent.Callable;

public class LambdaTest {

    public static void main(String [] args) throws Exception{
        execute(()-> "done");
    }

    static void execute(Runnable runnable) {
        System.out.println("Execiting Running");
        runnable.run();
    }

    static void execute(Callable<String> callable) throws Exception {
        System.out.println("Execiting Callable");
        callable.call();
    }

    /*
    static void execute(PrivilegedAction<String> action) {
        System.out.println("Execiting PrivilegedAction");
        action.run();
    }
     */
}
