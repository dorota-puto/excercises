package puto.company;

import puto.company.hireStrategy.HireStrategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GroupManager extends AbstractEmployee implements Manager {

    private List<Employee> workers = new ArrayList<>();
    private HireStrategy hireStrategy;
    private static final BigDecimal DEFAULT_MANAGER_SALARY = new BigDecimal(10000);


    public GroupManager(String name, String role, HireStrategy hireStrategy) {
        super(name, role, DEFAULT_MANAGER_SALARY);
      this.hireStrategy=hireStrategy;
    }

    public GroupManager(String name, String role, HireStrategy hireStrategy, BigDecimal salary) {
        super(name, role, salary);
        this.hireStrategy=hireStrategy;
    }

    @Override
    public Boolean canHire() {
        return hireStrategy.canHire(this);
    }

    @Override
    public Boolean hire(Employee employee) {
        if (canHire()) {
            workers.add(employee);
            employee.setManager(this);
            return true;
        }
        return false;
    }

    @Override
    public Boolean fire(Employee employee) {
        if (workers.remove(employee)) {
            employee.setManager(null);
            return true;
        }
        return false;
    }

    @Override
    public String work() {
        StringBuilder builder = new StringBuilder();
        builder.append(toString() + " currently working on:\n");

        for (Employee worker : workers) {
            appendSpacing(builder, worker);
            builder.append(worker.work());
            appendNewLineIfMissing(builder);
        }
        return builder.toString();
    }

    private void appendNewLineIfMissing(StringBuilder builder) {
        if (builder.lastIndexOf("\n") != builder.length() - 1) {
            builder.append("\n");
        }
    }

    private void appendSpacing(StringBuilder builder, Employee worker) {

        String responsibilityChain = worker.getResponsibilityChain();
        int count = responsibilityChain.length() - responsibilityChain.replace("/", "").length();
        for (int i = 0; i < count - 1; i++) {
            builder.append("    ");
        }
        builder.append("|---");
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" managing %d workers", workers.size());
    }

    @Override
    public Iterator<Employee> iterator() {
        return workers.iterator();
    }
}
