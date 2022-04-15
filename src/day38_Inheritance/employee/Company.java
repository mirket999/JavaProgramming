package day38_Inheritance.employee;

import day32_Constructors.Test;

public class Company {
    public static void main(String[] args) {
        BusinessAnalyst businessAnalyst = new BusinessAnalyst("ALi", "Male", "BA", "CYDEO", 120000);
        Developer developer = new Developer("Sefa", "Male", "FrontEndDev", "Microsoft", 250000);
        Driver driver = new Driver("Nebahat", "Female", "TruckDriver", "BMX", 200000);
        Pilot pilot = new Pilot("Osman", "Male", "F-16", "THK", 300000);
        ProductOwner productOwner = new ProductOwner("Hasan", "Male", "PO", "Cydeo", 140000);
        ScrumMaster scrumMaster = new ScrumMaster("Asiya", "Female", "SM", "IBM", 150000);
        Teacher teacher = new Teacher("Merve", "Female", "Förskola", "Vanerparken", 40000);
        Tester tester = new Tester("Omer", "Male", "QA Engineer", "Volvo", 250000);

        businessAnalyst.work();
        developer.work();
        driver.work();
        pilot.work();
        productOwner.work();
        scrumMaster.work();
        teacher.work();
        tester.work();

        System.out.println("********************************************************");

        System.out.println(businessAnalyst);
        System.out.println(developer);
        System.out.println(driver);
        System.out.println(pilot);
        System.out.println(productOwner);
        System.out.println(scrumMaster);
        System.out.println(teacher);
        System.out.println(tester);
    }
}
