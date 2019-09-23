package puto.lab;

import java.util.Random;

public class CompanyGenerator {
    public String generateName() {
        String[] names = {"Abraham", "William", "George", "Mike", "Rose", "Kate"};
        String[] surnames = {"Linkoln", "Barrows", "Scofield", "Kowalski", "Moniuszko"};
        int nameIndex = new Random().nextInt(names.length);
        int surnameIndex = new Random().nextInt(surnames.length);
        return names[nameIndex] + " " + surnames[surnameIndex];
    }

    public String generateRole() {
        String[] roles = {"Junior", "Regular", "Regular II", "Associate", "Lead", "Senior", "Senior II"};
        int roleIndex = new Random().nextInt(roles.length);
        return roles[roleIndex];
    }

    public Employee generateWorker() {
        boolean generateDeveloper = new Random().nextBoolean();
        if (generateDeveloper) {
            return new Developer(generateName(), generateRole());
        }
        return new Tester(generateName(), generateRole());
    }

    public Manager generateManager() {
        return new GroupManager(generateName(), generateRole(), new Random().nextInt(4) + 1);
    }

    public void hireEmployees(Manager manager, int h) {
        if (h <= 1) {
            while(manager.canHire()) {
                manager.hire(generateWorker());
            }
            return;
        }
        while (manager.canHire()) {
            boolean hireManager = new Random().nextBoolean();
            if (hireManager) {
                Manager managerToHire = generateManager();
                manager.hire(managerToHire);
                hireEmployees(managerToHire,h-1);
            }else{
                manager.hire(generateWorker());
            }
        }
    }

    public static void main(String[] args) {
        CompanyGenerator companyGenerator = new CompanyGenerator();
        Manager ceo = companyGenerator.generateManager();
        companyGenerator.hireEmployees(ceo,100);
        System.out.println(ceo.work());
    }
}
