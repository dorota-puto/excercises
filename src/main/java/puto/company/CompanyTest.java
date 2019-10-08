package puto.company;

import puto.company.hireStrategy.TeamSizeHireStrategy;

public class CompanyTest {
    public static void main(String[] args) {
        Company company = Company.getInstance();
        Developer developer = new Developer("Mike", "Senior");
        Tester tester = new Tester("Luke", "Regular");
        Manager manager = new GroupManager("Andreas", "Lead", new TeamSizeHireStrategy(5));


        manager.hire(developer);
        manager.hire(tester);

        Manager manager2 = new GroupManager("Bonawentura", "Senior Lead", new TeamSizeHireStrategy(6));
        manager2.hire(new Developer("Zbyszko", "senior II"));

        Developer employee = new Developer("Pankracy", "Junior");
        manager2.hire(new Tester("WolnyPtak", "Regular"));


        GroupManager manager3 = new GroupManager("William", "Senior I", new TeamSizeHireStrategy(3));
        manager3.hire(new Developer("Jasko", "junior"));
        manager2.hire(manager3);
        manager.hire(manager2);
        manager2.hire(employee);
        manager.hire(new Tester("Janka", "Associate"));

        System.out.println(employee.getResponsibilityChain());

        System.out.println(manager.work());
    }
}
