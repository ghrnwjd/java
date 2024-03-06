package lambdas;

import domain.Employee;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        /*
        Lambda basically has 3 parts
        1. A list of parameters
        2. Funtion Body
        3. An arrow
         */


        Employee e1 = new Employee(10, "JAVA", "Jung");
        Employee e2 = new Employee(6, "Oracle", "Han");
        Employee e3 = new Employee(1, "React", "Kim");

        // Test 1
        Function<Employee, String> groupByExpr = (Employee employee) -> {
            return employee.yearsOfExpr >= 7 ?
                    "expert" : employee.yearsOfExpr >= 3 ? "Intermediate" : "Fresher";
        };

        groupByExpr.apply(e1);
        groupByExpr.apply(e2);
        groupByExpr.apply(e3);
    }

}
