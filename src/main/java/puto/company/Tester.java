package puto.company;

import java.math.BigDecimal;

public class Tester extends AbstractEmployee {
    public Tester(String name, String role) {
        super(name, role);
    }

    public Tester(String name, String role, BigDecimal salary) {
        super(name, role, salary);
    }

    public String work() {
        return toString() + " currently testing new feature";
    }

    @Override
    public String toString() {
        return super.toString() + " and tests well";
    }
}
