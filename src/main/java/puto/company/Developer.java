package puto.company;

import java.math.BigDecimal;

public class Developer extends AbstractEmployee {
    public Developer(String name, String role) {
        super(name, role);
    }

    public Developer(String name, String role, BigDecimal salary){
        super(name, role, salary);
    }

    @Override
    public String work() {
        return toString() + " currently implementing new feature";
    }

    @Override
    public String toString() {
        return super.toString()+ " and writes good code";
    }

}
