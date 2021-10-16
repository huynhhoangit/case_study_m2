package CaseStudy.controllers;

import CaseStudy.services.impl.CustomerServicesimpl;
import CaseStudy.services.impl.EmployeeServiceimpl;
import CaseStudy.services.impl.FacilityServiceimpl;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);
    static CustomerServicesimpl customerService = new CustomerServicesimpl();
    static EmployeeServiceimpl employeeService = new EmployeeServiceimpl();
    static FacilityServiceimpl facilityService = new FacilityServiceimpl();

    public static void displaymenu() {


        int choice = 0;
        boolean flag = true;
        while (flag) {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            int choice1 = Integer.parseInt(scanner.nextLine());
            switch (choice1) {

                case 1:
                    System.out.println("Employee Management");
                    displayEmployeeManagement();
                    break;
                case 2:
                    System.out.println("Customer Management");
                    displayCustomerManagement();
                    break;
                case 3:
                    System.out.println("Facility Management");
//                    displayFacilityManagement();
                    break;
                case 4:
                    System.out.println("Booking Management");
                    break;
                case 5:
                    System.out.println("Promotion Management");
                    break;
                case 6:
                    flag = false;


            }

        }
    }

    public static void displayEmployeeManagement() {
        boolean flag = true;
        while (flag) {
            System.out.println("1 Display list employees");
            System.out.println("2 Add new employee");
            System.out.println("3 Edit employee");
            System.out.println("4 Return main menu");

            int choice1 = Integer.parseInt(scanner.nextLine());
            switch (choice1) {

                case 1:
                    System.out.println("1 Display list employees");
                     employeeService.display();
                    break;
                case 2:
                    System.out.println("2 Add new employee");
                    employeeService.add();
                    break;
                case 3:
                    System.out.println("3 Edit employee");
                    employeeService.edit();
                    break;
                case 4:
                    System.out.println("4 Return main menu");
                    FuramaController.displaymenu();
                    break;

            }
        }
    }
    public static void displayCustomerManagement() {
        boolean flag = true;
        while (flag) {
            System.out.println("1 Display list Customer");
            System.out.println("2 Add new Customer");
            System.out.println("3 Edit Customer");
            System.out.println("4 Return main menu");

            int choice1 = Integer.parseInt(scanner.nextLine());
            switch (choice1) {

                case 1:
                    System.out.println("1 Display list Customer");
                    customerService.display();
                    break;
                case 2:
                    System.out.println("2 Add new Customer");
                    customerService.add();
                    break;
                case 3:
                    System.out.println("3 Edit Customer");
                    customerService.edit();
                    break;
                case 4:
                    System.out.println("4 Return main menu");
                    FuramaController.displaymenu();
                    break;

            }
        }
    }
//    public static void displayFacilityManagement(){
//        boolean flag = true;
//        while (flag) {
//            System.out.println("1 Display list Customer");
//            System.out.println("2 Add new Customer");
//            System.out.println("3 Edit Customer");
//            System.out.println("4 Return main menu");
//
//            int choice1 = Integer.parseInt(scanner.nextLine());
//            switch (choice1) {
//
//                case 1:
//                    System.out.println("1 Add New Villa");
//                    facilityService.add();
//                    break;
//                case 2:
//                    System.out.println("2 Add New Villa");
//                    facilityService.add();
//                    break;
//                case 3:
//                    System.out.println("3 Add New Room");
//                    facilityService.add();
//                    break;
//                case 4:
//                    System.out.println("4 Return main menu");
//                    FuramaController.displaymenu();
//                    break;
//
//            }
//        }
//    }



}

