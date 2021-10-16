package CaseStudy.services.impl;

import CaseStudy.controllers.FuramaController;
import CaseStudy.models.Customer;
import CaseStudy.services.CustomerServices;
import CaseStudy.utils.ReadWirteCSV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServicesimpl implements CustomerServices {



        Scanner scanner = new Scanner(System.in);

    public void customerService() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 1) {
            System.out.println("Ứng dụng quản lý khu nghỉ dưỡng Furama\n" +
                    "Please enter your choice :\n " +
                    "1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\ttEdit customer \n" +
                    "4.\tReturn main menu\n");
            int chooseService = Integer.parseInt(scanner.nextLine());
            switch (chooseService) {
                case 1:
                    display();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    edit();
                    break;
                case 4:
                    FuramaController.displaymenu();


            }

        }
    }

    @Override
    public void display() {
        List<Customer> customers = ReadWirteCSV.getListCusFromCSV("D:\\CODEGYM\\CaseStudyM2\\case_study_m2\\src\\CaseStudy\\utils\\Customers.csv");
        for (int i = 0; i < customers.size(); i++) {
            System.out.println((i + 1) + ". " + customers.get(i));
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập mã KH");

        String idOfCustomer = scanner.nextLine();
        System.out.println("Nhập họ tên KH");
        String fullName = scanner.nextLine();
        System.out.println(" Nhập ngày sinh KH");
        String birthDay = scanner.nextLine();
        System.out.println(" Nhập giới tính KH");
        String gender = scanner.nextLine();
        System.out.println(" Nhập số CMND KH");
        String idNumber = scanner.nextLine();
        System.out.println(" Nhập số điện thoại KH");
        String phoneNumber = scanner.nextLine();
        System.out.println(" Nhập email KH");
        String email = scanner.nextLine();
        System.out.println("Nhập CustomerCode");
        String customerCode = scanner.nextLine();
        System.out.println("Nhập loại KH");
        String customerType = scanner.nextLine();
        System.out.println("Nhập địa chỉ KH");
        String address = scanner.nextLine();
//        Customer(String fullName, String birthDay, String gender, String address, String idNumber, String phoneNumber, String email, String customerCode, String customerType)
        Customer customer = new Customer( fullName, birthDay, gender, idNumber, phoneNumber, email, customerCode, customerType, address);
        List<Customer> customerlist = new ArrayList<>();
        customerlist.add(customer);
        ReadWirteCSV.writeListCusCSV(customerlist, "D:\\CODEGYM\\CaseStudyM2\\case_study_m2\\src\\CaseStudy\\utils\\Customers.csv", true);
    }

    @Override
    public void edit() {
        List<Customer> customerlist = ReadWirteCSV.getListCusFromCSV("D:\\CODEGYM\\CaseStudyM2\\case_study_m2\\src\\CaseStudy\\utils\\Customers.csv");
        Scanner scanner = new Scanner(System.in);
        display();
        System.out.println("chọn Customer cần Sửa");
        int chooseEdit = Integer.parseInt(scanner.nextLine());
        System.out.println("Sửa họ tên KH");
        String newfullName = scanner.nextLine();
        customerlist.get(chooseEdit - 1).setFullName(newfullName);
        System.out.println(" Sửa ngày sinh KH");
        String newbirthDay = scanner.nextLine();
        customerlist.get(chooseEdit - 1).setBirthDay(newbirthDay);
        System.out.println(" Sửa giới tính KH");
        String newgender = scanner.nextLine();
        customerlist.get(chooseEdit - 1).setGender(newgender);
        System.out.println(" Sửa số CMND KH");
        String newidNumber = scanner.nextLine();
        customerlist.get(chooseEdit - 1).setIdNumber(newidNumber);
        System.out.println(" Sửa số điện thoại KH");
        String newphoneNumber = scanner.nextLine();
        customerlist.get(chooseEdit - 1).setPhoneNumber(newphoneNumber);
        System.out.println(" Sửa email KH");
        String newemail = scanner.nextLine();
        customerlist.get(chooseEdit - 1).setEmail(newemail);
        System.out.println("Sửa CustomerCode");
        String newcustomerCode = scanner.nextLine();
        customerlist.get(chooseEdit - 1).setCustomerCode(newcustomerCode);
        System.out.println("Sửa loại KH");
        String newcustomerType = scanner.nextLine();
        customerlist.get(chooseEdit - 1).setCustomerType(newcustomerType);
        System.out.println("Sửa địa chỉ KH");
        String newaddress = scanner.nextLine();
        customerlist.get(chooseEdit - 1).setAddress(newaddress);
        ReadWirteCSV.writeListCusCSV(customerlist, "D:\\CODEGYM\\CaseStudyM2\\case_study_m2\\src\\CaseStudy\\utils\\Customers.csv", false);
    }
}


