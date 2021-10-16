package CaseStudy.models;

public class Employee extends Person {
    private String employeeCode;
    private String level;
    private String salary;

    public Employee() {
    }

    public Employee(String fullName, String birthDay, String gender, String address, String IdNumber, String phoneNumber, String email, String employeeCode, String level, String salary) {
        super(fullName, birthDay, gender, address, IdNumber, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.level = level;
        this.salary = salary;
    }

    public Employee(String employeeCode, String level, String salary) {
        this.employeeCode = employeeCode;
        this.level = level;
        this.salary = salary;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return   "Employee{" + super.toString() +
                ", employeeCode='" + employeeCode + '\'' +
                ", level='" + level + '\'' +
                ", salary=" + salary +
                "} " ;
    }
    public String getToString(){
        return this.getEmployeeCode() + "," + super.getFullName() + "," +super.getBirthDay() + "," + super.getGender() + "," + super.getAddress() + ","+ super.getIdNumber() + "," +
                super.getPhoneNumber() + "," + super.getEmail() + "," + this.getLevel() + "," + this.getSalary();
    }
}