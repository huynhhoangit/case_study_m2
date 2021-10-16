package CaseStudy.services.impl;

import CaseStudy.controllers.FuramaController;
import CaseStudy.models.Customer;
import CaseStudy.models.Employee;
import CaseStudy.services.EmployeeServices;
import CaseStudy.utils.ReadWirteCSV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceimpl implements EmployeeServices {
    Scanner scanner = new Scanner(System.in);
    public void  employeeService() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 1) {
            System.out.println("Ứng dụng quản lý khu nghỉ dưỡng Furama\n" +
                    "Please enter your choice :\n " +
                    "1.\tDisplay list Employee\n" +
                    "2.\tAdd new Employee\n" +
                    "3.\ttEdit Employee \n" +
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
        List<Employee> employees = ReadWirteCSV.getListEmpFromCSV("D:\\CODEGYM\\CaseStudyM2\\case_study_m2\\src\\CaseStudy\\utils\\Employees.csv");

        System.out.println("List Employee");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(i + 1 + ". " + employees.get(i));
        }
    }


    @Override
    public void add() {

        System.out.println("Nhập họ tên KH");
        String fullName = scanner.nextLine();
        System.out.println(" Nhập ngày sinh KH");
        String birthDay = scanner.nextLine();
        System.out.println(" Nhập giới tính KH");
        String gender = scanner.nextLine();
        System.out.println(" Nhập Địa Chỉ");
        String address = scanner.nextLine();
        System.out.println(" Nhập số CMND KH");
        String IdNumber = scanner.nextLine();
        System.out.println(" Nhập số điện thoại KH");
        String phoneNumber = scanner.nextLine();
        System.out.println(" Nhập email KH");
        String email = scanner.nextLine();
        System.out.println("Nhập employee Code");
        String employeeCode = scanner.nextLine();
        System.out.println("Nhập bằng đại học ");
        String level = scanner.nextLine();
        System.out.println("Nhập salary");
        String salary = scanner.nextLine();

        Employee employee = new Employee( fullName, birthDay, gender, address, IdNumber, phoneNumber, email, employeeCode, level, salary);
        List<Employee> employeelist = new ArrayList();
        employeelist.add(employee);
      ReadWirteCSV.writeListEmpCSV(employeelist, "D:\\CODEGYM\\CaseStudyM2\\case_study_m2\\src\\CaseStudy\\utils\\Employees.csv", true);
    }

    @Override
    public void edit() {
        List<Employee> employeelist = ReadWirteCSV.getListEmpFromCSV("D:\\CODEGYM\\CaseStudyM2\\case_study_m2\\src\\CaseStudy\\utils\\Employees.csv");
        Scanner scanner = new Scanner(System.in);
        display();
        System.out.println("chọn employee cần Sửa");
        int chooseEdit = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập họ tên KH");
        String newfullName = scanner.nextLine();
        employeelist.get(chooseEdit - 1).setFullName(newfullName);
        System.out.println(" Nhập ngày sinh KH");
        String newbirthDay = scanner.nextLine();
        employeelist.get(chooseEdit - 1).setBirthDay(newbirthDay);
        System.out.println(" Nhập giới tính KH");
        String newgender = scanner.nextLine();
        employeelist.get(chooseEdit - 1).setGender(newgender);
        System.out.println(" Nhập Địa Chỉ");
        String newaddress = scanner.nextLine();
        employeelist.get(chooseEdit - 1).setAddress(newaddress);
        System.out.println(" Nhập số CMND KH");
        String newidNumber = scanner.nextLine();
        employeelist.get(chooseEdit - 1).setIdNumber(newidNumber);
        System.out.println(" Nhập số điện thoại KH");
        String newphoneNumber = scanner.nextLine();
        employeelist.get(chooseEdit - 1).setPhoneNumber(newphoneNumber);
        System.out.println(" Nhập email KH");
        String newemail = scanner.nextLine();
        employeelist.get(chooseEdit - 1).setEmail(newemail);
        System.out.println("Nhập employee Code");
        String newemployeeCode = scanner.nextLine();
        employeelist.get(chooseEdit - 1).setEmployeeCode(newemployeeCode);
        System.out.println("Nhập bằng đại học ");
        String newlevel = scanner.nextLine();
        employeelist.get(chooseEdit - 1).setLevel(newlevel);
        System.out.println("Nhập salary");
        String newsalary = scanner.nextLine();
        employeelist.get(chooseEdit - 1).setSalary(newsalary);
        ReadWirteCSV.writeListEmpCSV(employeelist, "D:\\CODEGYM\\CaseStudyM2\\case_study_m2\\src\\CaseStudy\\utils\\Employees.csv", false);
    }
}

