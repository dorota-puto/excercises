package puto.company;

import java.math.BigDecimal;

public abstract class AbstractEmployee implements Employee {
    private static final BigDecimal DEFAULT_SALARY = new BigDecimal(5000);
    private String name;
    private String role;
    private Manager manager;
    private BigDecimal salary;


    public AbstractEmployee(String name, String role) {
        this(name, role, DEFAULT_SALARY);
    }

    public AbstractEmployee(String name, String role, BigDecimal salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + name + " is a " + role;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public Manager getManager() {
        return manager;
    }

    @Override
    public String getResponsibilityChain() {
        if (manager == null) {
            return getRole();
        } else
            return manager.getResponsibilityChain() + "/" + getRole();
    }

    @Override
    public BigDecimal getSalary() {return salary;}

}

