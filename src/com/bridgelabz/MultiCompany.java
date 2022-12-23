package com.bridgelabz;

public class MultiCompany {
    public static void main(String[] args) {
        Employee TCS = new Employee();
        System.out.println("Employee details of TCS: ");
        TCS.setName("Saptarshi");
        TCS.setAge(24);
        TCS.setPhoneNumber(938299453);
        TCS.setCity("Gangnapur");
        TCS.setState("WB");
        TCS.setDepartment("Developer");
        TCS.print();

        Employee Wipro = new Employee();
        System.out.println("\nEmployee details of Wipro: ");
        Wipro.setName("Rakib");
        Wipro.setAge(23);
        Wipro.setPhoneNumber(938291553);
        Wipro.setCity("Mithapur");
        Wipro.setState("WB");
        Wipro.setDepartment("System");
        Wipro.print();
    }
}
