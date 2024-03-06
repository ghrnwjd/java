package interfaces;

public class DefaultStaticMethod {
      public static void main(String[] args) {

            InterfaceStaticTest interfaceStaticTest = new ImplInterfaceStaticTest();
            InterfaceDefaultTest interfaceDefaultTest = new ImplInterfaceDefaultTest();

            // 인스턴스로 접근
            // interfaceStaticTest.staticMethod(); //컴파일에러 발생.
            interfaceDefaultTest.defaultMethod();

            // 클래스로 접근
            InterfaceStaticTest.staticMethod();
            // InterfaceDefaultTest.defaultMethod(); // 컴파일에러발생
      }
}

class ImplInterfaceDefaultTest implements InterfaceDefaultTest {
      @Override
      public void test() {
            System.out.println("## test1 메소드 실행 ## ");
      }

      @Override
      public void test2() {
            System.out.println("## test2 메소드 실행 ## ");
      }
}
class ImplInterfaceStaticTest implements InterfaceStaticTest {

      @Override
      public void test() {
            System.out.println("## test1 메소드 실행 ## ");
      }

      @Override
      public void test2() {
            System.out.println("## test2 메소드 실행 ## ");
      }
}
interface InterfaceStaticTest {
      public abstract void test();

      // public abstract 생략 가능
      void test2();

      static void staticMethod() {
            System.out.println("## 인터페이스 static method 입니다. ##");
      }

      public final double PI = 3.14;
      double a = 3.12; // 변수는 public final 생략

}

interface InterfaceDefaultTest {

      public abstract void test();

      // public abstract 생략 가능
      void test2();

      default void defaultMethod() {
            System.out.println("## 인터페이스 default method 입니다. ##");
      }

      public final double PI = 3.14;
      double a = 3.12; // 변수는 public final 생략

}
