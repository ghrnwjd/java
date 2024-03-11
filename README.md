틀린 내용이 `다수 존재` 할 수 있음.
### 자바 코어

**Q1. 자바에서 객체란?**

	붕어빵틀(클래스)와 붕어빵(객체)의 관계, 붕어빵틀로는 붕어빵, 슈크림붕어빵 등 다양한 붕어빵을 만들 수 있듯이 붕어빵틀이라는 클래스안에 들어가는 매개변수에 따라 여러가지 객체가 생성될 수 있다.

**Q2. C++와 Java의 차이점은 무엇입니까?**

|비교|C++|JAVA|
|:---|:---:|:---:|
|프로그래밍모델|절차지향과 객체지향|객체지향|
|플랫폼종속성|플랫폼 종석적|비종속적(Write Once Run Anywhere)|
|특징|연산자오버로딩, Goto, 구조체, 포인터 등 지원|앞선 C++의 특징을 지원하지 않음|
|컴파일, 인터프리션|컴파일만 가능|둘다 가능|
|메모리관리|개발자의 의한 메모리 관리|시스템에 의한 메모리 관리|
|전역범위|전역 범위 지원|전역 범위 지원 X|

**Q3. 자바에서 바이트코드란?**

	개발자가 자바언어로 작성한 `.java`파일을 자바 컴파일러를 통해 바이트코드로 변환하고, 이 바이트코드는 JVM에서 이해할 수 있는 언어 형식이며 확장자는 `.class`이다.

**Q4. Java에서 메서드 오버로딩과 메서드 재정의의 차이점은 무엇입니까?**

	메서드 오버로딩은 같은 메서드 이름으로 정의하는 매개변수에 따라 다르게 동작하도록 한다. 하지만 메서드 오바라이딩은 부모클래스에서 정의한 함수를 자식클래스에서 같은 메서드 이름, 같은 매개변수 수를 이용하여 새롭게 정의하는 것을 말한다.

```java
public class Overloading {  
      public static void main(String[] args) {  
            Calculator calculator = new Calculator();  
            System.out.println(calculator.sum(1, 2));  
            System.out.println(calculator.sum(1, 2, 3));  
  
      }  
}  
class Calculator{  
  
      public int sum(int num1, int num2) {  
            return num1 + num2;  
      }  
      public int sum(int num1, int num2, int num3) {  
            return num1 + num2 + num3;  
      }  
}
```

```java
public class Overriding {  
      public static void main(String[] args) {  
            Parent parent = new Parent();  
            Child child = new Child();  
            System.out.println(parent.printMyName());  
            System.out.println(child.printMyName());  
             /* My name is DAD             * My name is BOY */     
    }  
}  
  
  
class Parent {  
      public String printMyName() {  
            return "My name is DAD";  
      }  
}  
  
class Child extends Parent {  
      @Override  
      public String printMyName() {  
            return "My name is BOY";  
      }  
}

```

**Q5. 추상 클래스와 인터페이스의 차이점은 무엇입니까?**

	추상클래스는 `abstract class 클래스이름` 으로 선언하고  인터페이스는 `interface 인터페이스이름`으로 선언하고 모든 메소드는 추상클래스여야 한다. 또한 인터페이스안에 정의하는 메소드들이 앞에 접근제어자가 선언되지 않으면 자동으로 `public abstract`가 포함된다.
	추상클래스에는 메소드를 일부 정의할 수 있지만 인터페이스는 정의할 수 없다. 하지만 java8이후로 default 메서드를 통해서 정의가 가능하다.
```java
public class Overloading {  
      public static void main(String[] args) {  
            InterfaceExample example = new ImplementsExample();  
            example.printMyName();  
            example.print();  
      }  
}  
class ImplementsExample implements InterfaceExample {  
      @Override  
      public void printMyName() {  
            System.out.println("나는 클래스의 메서드");  
      }  
}  
interface InterfaceExample {  
      void printMyName();  
      default void print() {  
            System.out.println("나는 인터페이스의 default 메서드.");  
      }  
}
```

**Q6. Java 플랫폼이 독립적인 이유는 무엇입니까?**

	자바코드는 자바컴파일러의 의해 자바 바이트코드파일(.class)파일로 변환되고 운영체제 위의 떠있는 JVM에 의해 코드가 해석되기 때문에

**Q7. Java의 가장 중요한 기능은 무엇입니까?**

	 외부적으로는 JVM, 내부적으로는 가비지컬렉터의 기능이 가장 중요하다고 생각함.

**Q8. 플랫폼 독립성이란 무엇을 의미합니까?**

	자바로 코드를 작성 시 자바컴파일러에 의해 바이트코드로 변경되고 운영체제에 상관없이 JVM에 의해 기계어로 번역된다. `WORA`

**Q9. JVM이란 무엇입니까?**

	Java Virtual Machine의 줄임말로 자바를 실행하기 위한 가상기계로 번역된다. OS에 종속받지 않고 자바를 인식 및 실행할 수 있도록 한다. 자바 컴파일러에 의해 .java 파일이 자바 바이트코드 파일인 .class로 변환되고 OS에 관계없이 실행될 수 있도록 한다.

**Q10. JVM은 플랫폼 독립적입니까?**

	 Q8 답변과 동일

**Q11. JDK와 JVM의 차이점은 무엇입니까?**

	JVM은 JRE안에 포함되며 JRE는 JDK안에 포함된다. Java 프로그램을 개발하기 위해선 JDK가 필요하고 컴파일된 자바 프로그램을 실행시키려면 JRE가 필요하다. JDK안에 자바 개발 시 필요한 라이브러리, javac(자바 컴파일러), javadoc 등 개발 도구들이 포함되어 있다.

**Q12. 포인터란 무엇이며 Java는 포인터를 지원합니까?**

	자바에서는 포인터를 지원하지 않고 참조(reference)를 지원한다. 포인터를 통해 메모리를 직접 핸들링하는데 사용된다. 자바에서는 `가비지컬렉터`로 인해 메모리 관리가 되기에 포인터를 제공하지 않고 참조를 제공한다.
	근데 포인터와 레퍼런스는 거의 비슷하다고 생각한다.

**Q13. 모든 클래스의 기본 클래스는 무엇입니까?**

	`Object Class`가 모든 클래스의 최상위클래스이다. 자주 사용하는 메서드로는 `toString()`, `equals()`, `hashCode()`, `clone()`, `getClass()`등이 있다.

**Q14. Java는 다중 상속을 지원합니까?**

	다중상속을 지원하지 않는다.

**Q15. 런타임 예외는 확인된 예외와 어떻게 다릅니까?**

	확인된 예외의 경우 컴파일단계에러 에러를 발생시키지만 런타임에러와 같은 경우는 프로그램이 실행중에 발생되는 에러이기때문에 관리가 필요하다.

**Q16. Java 5, 7 및 8에 각각 도입된 가장 중요한 기능은 무엇입니까?**

**Q17. Java는 순수한 객체 지향 언어입니까?**

	순수한객체지향언어는 다음 7가지 특성을 만족해야한다.
	1. Abstraction / 추상화
	2. Encapsulation / 캡슐화
	3. Inheritance / 상속
	4. Polymorphism / 다형성
	5. All predefined types are objects / 모든 사전에 정의된 타입은 객체여야 함
	6. All operations performed on objects must be only through methods exposed at the objects. / 객체에 대해서 수행되는 모든 작업은 반드시 객체의 메소드를 통해서만 이루어 져야 함
	7. All user-defined types are objects. / 모든 사용자가 정의한 타입은 객체여야 함
	하지만 자바에서는 `int`, `short`, `bool`등 다양한 원시타입이 존재하고(5번 위배) 메서드를 선언할 때 static 메서드로 선언을 하는 경우 객체를 생성하지 않아도 호출이 가능하기에 6번을 위배한다고 볼 수 있다.

**Q18. Java는 정적 또는 동적으로 유형이 지정되는 언어입니까?**

	자바는 정적타입언어이며, 변수를 선언할 때 해당되는 자료형을 지정하여야 한다.
  
**Q19. Java의 인수는 참조 또는 값으로 전달됩니까?**

	Java는 Call by value로 전달이 된다.

**Q20. Java에서 this()와 super()의 차이점은 무엇입니까?**

	1. this : 인스턴스 자기 자신을 가리키는 참조변수
	2. this() : 같은 클래스의 다른 생성자를 호출할 때 사용
	3. super : 부모클래스와 자식클래스가 변수, 메서드 이름이 같을 때 구분하기 위해 사용
	4. super() : 부모클래스의 생성자를 호출할 때 사용

**Q21. 유니코드란 무엇입니까?**

	유니코드란 세계 모든 언어와 기호에 코드값을 부여하며 하나의 문자를 표기하는데 1~4byte를 사용한다. 문자를 코드값으로 인코딩하는 방식에는 `UTF-8`, `UTF-16`, `EUC-KR` 등이 있다.

### 자바 스레드

1. **자바에서 쓰레드란?**
2. **프로세스와 스레드의 차이점은 무엇입니까?**
3. **멀티태스킹이란 무엇입니까?**
4. **프로세스 기반 멀티태스킹과 스레드 기반 멀티태스킹의 차이점은 무엇입니까?**
5. **멀티스레딩이란 무엇이며 응용 분야는 무엇입니까?**
6. **멀티스레딩의 장점은 무엇입니까?**
7. **스레드를 지원하는 Java API를 나열합니다.**
8. **얼마나 많은 방법으로 Java에서 스레드를 만들 수 있습니까?**
9. **Runnable 클래스를 구현하여 스레드를 생성하는 방법을 설명합니다.**
10. **Thread 클래스를 확장하여 스레드를 생성하는 방법을 설명합니다.**
11. **스레드를 생성하는 가장 좋은 방법은 무엇입니까?**
12. **Java에서 스레드 스케줄러의 중요성을 설명하십시오.**
13. **쓰레드의 생명주기에 대해 설명하시오.**
14. **Java에서 죽은 스레드를 다시 시작할 수 있습니까?**
15. **한 스레드가 다른 스레드를 차단할 수 있습니까?**
16. **Java에서 이미 시작된 스레드를 다시 시작할 수 있습니까?**
17. **Java에서 잠금 또는 잠금 목적은 무엇입니까?**
18. **얼마나 많은 방법으로 Java에서 동기화를 수행할 수 있습니까?**
19. **동기화 방법이란 무엇입니까?**
20. **Java에서 동기화된 메서드는 언제 사용합니까?**
21. **Java에서 동기화된 블록이란 무엇입니까?**
22. **동기화 블록은 언제 사용하며 동기화 블록을 사용하면 어떤 이점이 있습니까?**
23. **클래스 레벨 잠금이란 무엇입니까?**
24. **Java에서 정적 메소드를 동기화할 수 있습니까?**
25. **프리미티브에 동기화된 블록을 사용할 수 있습니까?**

### 자바의 OOP

**Q1. 객체 지향 프로그래밍과 그 특징에 대해 설명하십시오.**

**Q2. 추상화란 무엇입니까?**

	인터페이스와 구현하는 클래스를 다르게 두어 외부에서 코드의 구현부분을 알 수 없게 하는 경우
```java
public class Main {  
    public static void main(String[] args) {  
        Person person = new Men();  
        person.say();  // Men 클래스에 정의된 메서드를 보지 못한다.
    }  
}   
interface Person {  
    void say();  
}  
class Men implements Person {  
    @Override  
    public void say() {  
        System.out.println("I am a Men");  
    }  
}
```

**Q3. 캡슐화란 무엇입니까?**

	접근지정자를 private으로 설정하여 데이터를 보호하고 public으로 설정한 getter/setter 메서드를 통해 간접적인 접근을 허용하게 한다.

**Q4. 추상화와 캡슐화의 차이점은 무엇입니까?**

	추상화는 인터페이스를 사용하여 구현부를 분리한 것이며, 캡슐화는 클래스 내부의 로직을 감추는 용도로 사용한다.

**Q5. 객체 지향 프로그래밍 언어의 이점을 나열하십시오.**

**Q6. 전통적인 프로그래밍 언어와 객체 지향 프로그래밍 언어의 차이점은 무엇입니까?**

**Q7. 상속이란 무엇입니까?**

	코드를 재사용할 수 있게하며, `IS-A`, `HAS-A` 관계일 때 주로 상속을 사용한다.
	
**Q8. 다형성이란 무엇입니까?**

	상속을 통해서 기능을 확장하거나 변경하여 재구성하는 것을 말하며 오버라이딩 또는 오버로딩을 사용한다. 도형이라는 상위클래스를 상속하는 사각형, 삼각형 클래스가 있을 때, 넓이를 구하는 메서드를 작성한다고 할 때 각 하위 클래스는 다른 공식에 의해 넓이가 도출된다.
	
**Q9. Java는 다형성을 어떻게 구현합니까?**

```java
public class Main {  
    public static void main(String[] args) {  
        Shape rect = new Rectangle(10, 20);  
        Shape tri = new Triangle(10, 50);  
  
        System.out.println(rect.getX() + ", " + rect.getY() + "의 넓이는 " + rect.getArea());  
        System.out.println(tri.getX() + ", " + tri.getY() + "의 넓이는 " + tri.getArea());  
    }  
}  
class Shape{  
    private int x;  
  
    public int getX() {  
        return x;  
    }  
  
    public int getY() {  
        return y;  
    }  
  
    private int y;  
  
    public Shape(int x, int y) {  
        this.x = x;  
        this.y = y;  
    }  
  
    public double getArea() {  
        System.out.println("도형의 넓이를 출력함");  
        return 0;  
    }  
}  
  
class Rectangle extends Shape{  
    public Rectangle(int x, int y) {  
        super(x, y);  
    }  
  
    @Override  
    public double getArea() {  
        return super.getX() * super.getY();  
    }  
}  
class Triangle extends Shape{  
  
    public Triangle(int x, int y) {  
        super(x, y);  
    }  
  
    @Override  
    public double getArea() {  
        return super.getX() * super.getY() * 0.5;  
    }  
}
```

**Q10. 다양한 형태의 다형성에 대해 설명하십시오.**

	다형성은 클래스 간 상속관계에 있을 때 다채로운 성질을 나타내는 방법으로, 오버로딩, 오버라이딩, 업캐스팅, 다운캐스팅, 인터페이스, 추상메서드, 추상클래스등이 다양한 형태의 다형성 중 하나이다.  
**Q11. 런타임 다형성 또는 동적 메서드 디스패치란 무엇입니까?**

	메서드 디스패치란 정적방식과 동적방식으로 나누어진다. 정적방식으로는 컴파일 시점에서 컴파일러가 특정메서드를 호출할 것이라고 명확하게 알고 있는 경우를 말한다. 
	참고 : https://doompok.tistory.com/21

**Q12. 동적 바인딩이란 무엇입니까?**

	바인딩이란 프로그래밍에서 값들이 확정되어 더 이상 변경할 수 없는 bind된 상태를 말하며 식별자에 의해 그 대상의 메모리 주소, 데이터형, 실제값으로 배정되는 것을 말한다.
	정적바인딩의 대표적인 예로 `static`, `private`, `final` 키워드가 있다. 이 키워드들을 사용하면 override가 되지 않고 컴파일시점에서 타입이 결정된다. 동적 바인딩이란 부모클래스의 메서드를 자식클래스에서 오버라이딩한 경우를 말하고 실행시점에 해당 타입이 결정된다.

**Q13. 메서드 오버로딩이란?**

	자바코어 Q4 답변과 동일

**Q14. 메서드 오버라이딩이란?**

	자바코어 Q4 답변과 동일

**Q15. 메서드 오버로딩과 메서드 재정의의 차이점은 무엇입니까?**

	자바코어 Q4 답변과 동일

**Q16. 기본 메소드를 재정의할 수 있습니까?**

	기본메서드, 즉 `default` 메서드는 재정의할 수 있다.
```java
public class Main {  
    public static void main(String[] args) {  
        MyInterface test1 = new MyClass1();  
        MyInterface test2 = new MyClass2();  
  
        test1.print();  // Class Method
        test2.print();  // Interface Method
    }  
}  
interface MyInterface {  
    default void print() {  
        System.out.println("Interface Method");  
    }  
}  
class MyClass1 implements MyInterface {  
    @Override  
    public void print() {  
        System.out.println("Class Method");  
    }  
}  
class MyClass2 implements MyInterface{  
}
```
	
**Q17. 재정의된 메서드의 슈퍼클래스 버전을 호출하는 방법은 무엇입니까?**

	자식클래스에 의해 재정의된 메서드에서 `super.메서드명`으로 호출한다.
```java
class Parent {  
    void print() {  
        System.out.println("I am parent");  
    }  
}  
  
class Child extends Parent {  
    @Override  
    void print() {  
        super.print();  
        System.out.println("I am Child");  
    }  
}
```

**Q18. 메서드가 재정의되는 것을 어떻게 방지합니까?**

	메서드가 재정의되지 않도록 `static`, `private`, `final` 등의 키워드를 사용하여 컴파일시점에서 바인딩한다.

**Q19. 인터페이스란 무엇입니까?**

	구현하는 클래스들이 필수로 구현해야할 메서드, 사용해야할 변수를 모아둔 추상 클래스이다. 가이드라인 느낌

**Q20. 인터페이스용 객체를 만들 수 있습니까?**

	인터페이스용 객체는 생성할 수 없다. 객체를 생성하기 위해선 인터페이스의 추상메서드를 모두 구현하여야된다.

**Q21. 인터페이스에 멤버 변수가 있습니까?**

	인터페이스의 멤버변수를 할당할 수 있다. 

**Q22. 인터페이스의 메서드에는 어떤 수정자가 허용됩니까?**

	인터페이스를 선언 시 자바컴파일러는 자동으로 키워드를 추가한다.
	1. Method : `public abstract`
	2. Field : `public static final`
	인터페이스에는 `private`, `protected` 와 같은 수정자는 허용하지 않는다.

**Q23. 마커 인터페이스란?**

	마커 인터페이스란 아무런 메서드도 선언하지 않은 인터페이스를 말하고 대표적으로 `Serializable`이 있다. 마커 인터페이스는 어노테이션으로도 대체가 가능하며, 해당 클래스가 기능을 구현했는지 여부를 체크하는 정도로 사용한다. 

**Q24. 추상 클래스란 무엇입니까?**

	클래스 중 추상메서드가 하나라도 존재하는 클래스를 말한다. 

**Q25. 추상 클래스를 인스턴스화할 수 있습니까?**

	추상 클래스는 인스턴스화 할 수 없다. `abstract`라는 키워드 자체에서 객체화할 수 없음의 의미가 내포되어 있다.

### 자바의 예외

1. **Java에서 예외란 무엇입니까?**
2. **예외 처리의 목적은 무엇입니까?**
3. **예외 처리의 의미는 무엇입니까?**
4. **Java의 기본 예외 처리 메커니즘을 설명합니다.**
5. **'시도'의 목적은 무엇입니까?**
6. **catch 블록의 목적은 무엇입니까?**
7. **Exception 정보를 인쇄하는 다양한 방법은 무엇입니까? 그리고 그들을 구별하십시오.**
8. **try 블록 내에서 try-catch를 사용할 수 있습니까?**
9. **catch 블록 내에서 try-catch를 사용할 수 있습니까?**
10. **캐치 없이 시도를 할 수 있습니까?**
11. **finally 블록의 목적은 무엇입니까?**
12. **finally 블록은 항상 실행됩니까?**
13. **어떤 상황에서 finally 블록이 실행되지 않습니까?**
14. **final, finally 및 finalize()의 차이점은 무엇입니까?**
15. **try-catch와 finally 사이에 명령문을 작성할 수 있습니까?**
16. **동일한 시도에 두 개의 finally 블록을 사용할 수 있습니까?**
17. **던지는 목적은 무엇입니까?**
18. **오류를 던질 수 있습니까?**
19. **Java 객체를 던질 수 있습니까?**
20. **이들던지다그리고 던지다의 차이점은 무엇인가요?**
21. **이들던지다그리고 던지다의 차이점은 무엇인가요?**
22. **Java 클래스에 throws 키워드를 사용할 수 있습니까?**
23. **오류와 예외의 차이점은 무엇입니까?**
24. **확인된 예외와 확인되지 않은 예외의 차이점은 무엇입니까?**
25. **부분적으로 확인된 예외와 완전히 확인된 예외의 차이점은 무엇입니까?**

### 자바의 컬렉션

1. **개체 배열의 제한 사항은 무엇입니까?**
2. **배열과 컬렉션의 차이점은 무엇입니까?**
3. **배열과 ArrayList의 차이점은 무엇입니까?**
4. **배열과 벡터의 차이점은 무엇입니까?**
5. **컬렉션 API란?**
6. **컬렉션 프레임워크란?**
7. **컬렉션과 컬렉션의 차이점은 무엇입니까?**
8. **Collection 인터페이스에 대해 설명하시오.**
9. **List 인터페이스에 대해 설명하시오.**
10. **Set 인터페이스에 대해 설명하시오.**
11. **SortedSet 인터페이스에 대해 설명하세요.**
12. **Vector 클래스에 대해 설명하시오.**
13. **ArrayList와 Vector의 차이점은 무엇입니까?**
14. **ArrayList의 동기화된 버전을 어떻게 얻을 수 있습니까?**
15. **컬렉션 개체의 크기와 용량의 차이는 무엇입니까?**
16. **ArrayList와 Linked List의 차이점은 무엇입니까?**
17. **컬렉션 프레임워크에 존재하는 레거시 클래스와 인터페이스는 무엇입니까?**
18. **열거형과 반복자의 차이점은 무엇입니까?**
19. **열거형의 제한 사항은 무엇입니까?**
20. **열거형과 열거형의 차이점은 무엇인가요?**
21. **Iterator와 ListIterator의 차이점은 무엇입니까?**
22. **Comparable 인터페이스란?**
23. **Comparator 인터페이스란?**
24. **Comparable과 Comparator의 차이점은 무엇입니까?**
25. **HashSet과 TreeSet의 차이점은 무엇입니까?**

### 최대 절전 모드

1. **최대 절전 모드 란 무엇입니까?**
2. **ORM이란 무엇입니까?**
3. **ORM 수준은 무엇입니까?**
4. **Hibernate와 같은 ORM 도구가 필요한 이유는 무엇입니까?**
5. **Entity Bean과 Hibernate의 주요 차이점은 무엇입니까?**
6. **Hibernate 프레임워크의 핵심 인터페이스와 클래스는 무엇입니까?**
7. **RDBMS와의 Hibernate 통신의 일반적인 흐름은 무엇입니까?**
8. **hibernate.cfg.xml의 중요한 태그는 무엇입니까?**
9. **Hibernate에서 Session 인터페이스는 어떤 역할을 합니까?**
10. **SessionFactory 인터페이스는 Hibernate에서 어떤 역할을 합니까?**
11. **Hibernate 구성 속성을 지정하는 가장 일반적인 방법은 무엇입니까?**
12. **Java 개체를 데이터베이스 테이블과 어떻게 매핑합니까?**
13. **Hibernate에서 시퀀스 생성 기본 키 알고리즘을 어떻게 정의합니까?**
14. **Hibernate에서 구성 요소 매핑이란 무엇입니까?**
15. **Hibernate 인스턴스 상태의 유형은 무엇입니까?**
16. **Hibernate의 상속 모델 유형은 무엇입니까?**
17. **명명된 SQL 쿼리란 무엇입니까?**
18. **명명된 SQL 쿼리의 이점은 무엇입니까?**
19. **코드 변경 없이 관계형 데이터베이스 간에 어떻게 전환합니까?**
20. **콘솔에서 Hibernate 생성 SQL 문을 보는 방법은 무엇입니까?**
21. **파생 속성이란 무엇입니까?**
22. **일대다 매핑에서 캐스케이드 및 역 옵션을 정의합니다.**
23. **트랜잭션 파일이란 무엇입니까?**
24. **Named ñ SQL 쿼리는 무엇을 의미합니까?**
25. **저장 프로시저를 어떻게 호출합니까?**

질문 출처
https://codegym.cc/ko/groups/posts/ko.402.java-gaebaljaleul-wihan-gajang-jaju-mudneun-150gaji-myeonjeob-jilmun
