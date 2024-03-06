package domain;

public class Employee {
    public int yearsOfExpr;
    public String tech;
    public String name;

    public Employee(int yearsOfExpr, String tech, String name) {
        this.yearsOfExpr = yearsOfExpr;
        this.tech = tech;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}