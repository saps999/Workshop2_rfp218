package com.bridgelabz;

public class StudentMain {
    public static void main(String[] args) {
        Student sam = new Student();
        System.out.println("Details of Sam:");
        sam.setRollNumber(10);
        sam.setPhoneNumber(1234567890);
        sam.setCity("Gangnapur");
        sam.setState("WB");
        sam.setZip(123);
        sam.print();

        Student john = new Student();
        System.out.println("\nDetails of John:");
        john.setRollNumber(11);
        john.setPhoneNumber(1023456789);
        john.setCity("Mithapur");
        john.setState("WB");
        john.setZip(1243);
        john.print();
    }
}
