package CaseStudy.models;

public class Customer extends Person {
    private int idDonHang;
    private String loaiKhachHang;

    public Customer(String hoten, String ngaysinh, String gender, int cmnd, int sdt, String email, int idDonHang, String khachHang, String loaiKhachHang) {
        super(hoten, ngaysinh, gender, cmnd, sdt, email);
        this.idDonHang = idDonHang;
        this.loaiKhachHang = loaiKhachHang;
    }

}
