package CaseStudy.services;

import CaseStudy.models.Customer;

import java.util.Scanner;

public class CustomerSevicesimpl implements CustomerSevices {
    public static Customer[] customerList = new Customer[100];
    static {
        customerList[0] = new Customer("chanh", "11/02/1996", "nam", 1, 1259554785, "hoang@abc.com",1, "3", "109 hoang sy khai");

    }
    static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Họ Và Tên: ");
        String hoten = scanner.nextLine();

        System.out.print("Nhập Ngày Sinh (dd/mm/yyyy):");
        String ngaysinh = scanner.nextLine();
        System.out.println("Nhập Giới Tính: \n 1. Nam \n 2. Nữ");
        String gender = scanner.nextLine();
        System.out.println("Nhập ID: ");
        int idDonHang = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Số Phone: ");
        int sdt = Integer.parseInt(scanner.nextLine());
        String email = scanner.nextLine();
        System.out.println("Nhập Mã Giảm Giá: ");
        String customerCode = scanner.nextLine();
        System.out.println("Chọn Loại Khách Hàng: \n 1. Diamond \n 2. Platinium \n 3. Gold \n 4. Silver \n 5. Member ");
        int loaiKhachHang = Integer.parseInt(scanner.nextLine());
        String customerType = "";
        switch (loaiKhachHang) {
            case 1:
                customerType = "Diamond";
                break;
            case 2:
                customerType = "Platinium";
                break;
            case 3:
                customerType = "Gold";
                break;
            case 4:
                customerCode = "Silver";
                break;
            case 5:
                customerCode = "Member";
                break;
            default:
                System.out.println("No choice");
        }
        System.out.println("Nhập Địa Chỉ: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(hoten, ngaysinh, gender, idDonHang, sdt, email, loaiKhachHang, "3", address);
        for (int i = 0; i < CustomerSevicesimpl.customerList.length; i++) {
            if (CustomerSevicesimpl.customerList[i] == null) {
                CustomerSevicesimpl.customerList[i] = customer;

                break;
            }
        }
    }

    @Override
    public void displaymenu() {
        for (Customer customer : customerList) {
            if (customer != null) {
               System.out.println(customer);
            }
        }
    }

}
