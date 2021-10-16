package CaseStudy.models;

public class Customer extends Person {
    private String customerCode;
    private String customerType;

    public Customer() {
    }

    public Customer(String fullName, String birthDay, String gender, String address, String idNumber, String phoneNumber, String email, String customerCode, String customerType) {
        super(fullName, birthDay, gender, address, idNumber, phoneNumber, email);
        this.customerCode = customerCode;
        this.customerType = customerType;
    }

    public Customer(String customerCode, String customerType) {
        this.customerCode = customerCode;
        this.customerType = customerType;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "customerCode='" + customerCode + '\'' +
                ", customerType='" + customerType + '\'' +
                '}';
    }

    public String getToString() {
        return this.customerCode + "," + this.getFullName() + "," + this.getBirthDay() + "," + this.getGender() + "," +
                this.getIdNumber() + "," + this.getPhoneNumber() + "," + this.getEmail() + "," + this.getCustomerType() + "," + this.getCustomerType();

    }
}
