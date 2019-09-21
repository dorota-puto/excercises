package puto.lab;

public class Tester extends AbstractEmployee {
    public Tester(String name, String role) {
        super(name, role);
    }

    public String work() {
        return toString() + " currently testing new feature";
    }
    @Override
    public String toString() {
        return super.toString()+ " and tests well";
    }
}
