package puto.lab;

public class CompanyTest {
    public static void main(String[] args) {
        Company company = Company.getInstance();
        Developer developer = new Developer("Mike", "Senior");
        Tester tester = new Tester("Luke", "Regular");
        Manager manager = new GroupManager("Andreas", "Lead", 5);


        manager.hire(developer);
        manager.hire(tester);

        Manager manager2 = new GroupManager("Bonawentura", "Senior Lead", 3);
        manager2.hire(new Developer("Zbyszko", "senior II"));
        manager2.hire(new Developer("Pankracy", "Junior"));
        manager2.hire(new Tester("WolnyPtak", "Regular"));

        manager.hire(manager2);
        manager.hire(new Tester("Janka", "Associate"));

        System.out.println(manager.work());
    }
}
