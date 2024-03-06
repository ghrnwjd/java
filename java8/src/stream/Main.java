package stream;

import domain.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* 1. Predicate<T> 하나의 파라미터, 불린값 리턴
* 2. Consumer<T> 하나의 파라미터, 리턴값 없음
* 3. Function<T,R> 하나의 파라미터, 결과 리턴
* 4. Supplier<T> 파라미터 없이 결과 리턴
*/
public class Main {

      public static void main(String [] args) {
            System.out.print("Filtering Method \n->  ");
            filterMethod();
            System.out.print("Truncating Method\n->  ");
            truncateMethod();
            System.out.print("Consuming Method\n->  ");
            consumingMethod();
            System.out.print("Mapping Method\n->  ");
            mapMethod();
            System.out.print("Matching Method\n->  ");
            matchingMethod();
      }


      public static void matchingMethod() {
            // anyMatch  boolean 리턴
            Stream<Integer> integerStream = Stream.of(1, 3, 5, 7, 9);
            System.out.println(integerStream.anyMatch(i -> i % 2 == 0)); // 하나라도 있으면 True
            System.out.println(Stream.of(1,3,5,7,9).allMatch(i -> i % 2 != 0)); // 모든것이 맞아야 True 리턴
            System.out.println(Stream.of(1,3,5,7,9).noneMatch(i -> i % 2 == 0)); // allMatch와 반대로 모든것이 틀려야 True 리턴
      }
      public static void mapMethod() {
            // <R> Stream<R> map(Function<? super T, ? extends R> mapper)
            List<Employee> employeeList = new ArrayList<>();
            employeeList.add(new Employee(10, "JAVA", "Jung"));
            employeeList.add(new Employee(6, "Oracle", "Han"));
            employeeList.add(new Employee(1, "React", "Kim"));

            employeeList.stream().map(Employee::getName).forEach(name -> System.out.println(name));

      }
      public static void consumingMethod() {
            // Stream<T> peek(Consumer<? super T> action>
            // 변수 선언과 동시에 함수 실행
            Stream<Integer> integerStream1 = Stream.of(1, 2, 3, 4, 5, 6,7, 8, 9, 10);
            List<Integer> peekList = integerStream1.peek(s -> System.out.print(s+ " ")).collect(Collectors.toList());

            System.out.println();
            // void forEach(Consumer<? super T> action>
            // 변수 선언과 동시에 함수 실행
            Stream<Integer> integerStream2 = Stream.of(1, 2, 3, 4, 5, 6,7, 8, 9, 10);
            integerStream2.forEach(System.out::print);
            System.out.println();

      }
      public static void filterMethod() {
            // Stream<T> filter(Predicate<? super T> p)

            Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6,7, 8, 9, 10);

            List<Integer> oddNumber = integerStream.filter(x -> x % 2 == 0).collect(Collectors.toList());

            for(int oddNum : oddNumber) {
                  System.out.print(oddNum + " ");
            }
            System.out.println();
            return;
      }

      public static void truncateMethod() {
            // Stream<T> limit(long maxSize)
            // Stream<T> skip(long n)

            Stream<Integer> integerStream1 = Stream.of(1, 2, 3, 4, 5, 6,7, 8, 9, 10);

            // 인덱스 0부터 갯수
            List<Integer> limitList = integerStream1.limit(5).collect(Collectors.toList());
            for(int limit : limitList) {
                  System.out.print(limit+ " ");
            }
            System.out.println();


            // 한번 사용한 스트림은 재사용할 수 없음.
            // stream has already been operated upon or closed
            Stream<Integer> integerStream2 = Stream.of(1, 2, 3, 4, 5, 6,7, 8, 9, 10);
            List<Integer> skipList = integerStream2.skip(3).collect(Collectors.toList());

            for(int skip : skipList) {
                  System.out.print(skip+ " ");
            }
            System.out.println();
      }
}
