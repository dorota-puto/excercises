package puto.company.hireStrategy;

import puto.company.Employee;
import puto.company.Manager;

import java.util.Iterator;

public class TeamSizeHireStrategy implements HireStrategy {
    private int teamSize;

    public TeamSizeHireStrategy(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public boolean canHire(Manager manager) {
        int counter = 0;
        for (Employee employee : manager) {
            counter++;
        }
        return counter < teamSize;
    }
}
