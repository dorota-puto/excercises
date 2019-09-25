package puto.company;

public interface Manager extends Employee {
    Boolean canHire();
    Boolean hire(Employee employee);
    Boolean fire(Employee employee);
}