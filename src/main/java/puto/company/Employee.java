package puto.company;

import java.math.BigDecimal;

public interface Employee {
    String getName();

    String getRole();

    void setManager(Manager manager);

    Manager getManager();

    String getResponsibilityChain();

    String work();

    BigDecimal getSalary();
}
