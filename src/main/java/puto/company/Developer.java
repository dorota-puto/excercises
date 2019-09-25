package puto.company;

public class Developer extends AbstractEmployee {
    public Developer(String name, String role) {
        super(name, role);
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
