package CaseStudy.models;

public class Employee extends Person {
    private int idEmployee;
    public int lvelchucvu;
    public int chucvu;


    public Employee(String hoten, String ngaysinh, String gender, int cmnd, int sdt, String email) {
        super(hoten, ngaysinh, gender, cmnd, sdt, email);
    }
}