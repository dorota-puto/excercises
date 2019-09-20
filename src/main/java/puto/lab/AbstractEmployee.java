package puto.lab;

public abstract class AbstractEmployee implements Employee {
    private String name;
    private String role;
    private Manager manager;

    public AbstractEmployee(String name, String role) {
        this.name = name;
        this.role = role;
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
            return manager.getResponsibilityChain() + getRole();
    }

}

