package puto.company.hireStrategy;

import puto.company.Employee;
import puto.company.Manager;

import java.math.BigDecimal;

public class BudgetBasedHireStrategy implements HireStrategy {
    private BigDecimal salaryLimit;

    public BudgetBasedHireStrategy(BigDecimal salaryLimit) {
        this.salaryLimit = salaryLimit;
    }

    @Override
    public boolean canHire(Manager manager) {
        BigDecimal salarySum = new BigDecimal(0);

        for (Employee employee : manager) {

            salarySum = salarySum.add(employee.getSalary());
        }
        return salarySum.compareTo(salaryLimit) < 0;
    }
}
