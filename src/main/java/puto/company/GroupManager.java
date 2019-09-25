package puto.company;

import java.util.ArrayList;
import java.util.List;

public class GroupManager extends AbstractEmployee implements Manager {

    private List<Employee> workers = new ArrayList<>();
    private int workerLimit;

    public GroupManager(String name, String role, int workerLimit) {
        super(name, role);
        this.workerLimit = workerLimit;
    }

    @Override
    public Boolean canHire() {
        return workers.size() < workerLimit;
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
        for (int i = 0; i < count-1; i++) {
            builder.append("    ");
        }
        builder.append("|---");
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" managing %d/%d workers", workers.size(), workerLimit);
    }
}
