package CaseStudy.models;

public class House extends Facility{
    private String roomStandard;
    private String numberOfFloors;

    public House() {
    }

    public House(String serviceCode, String serviceName, String usableArea, String rentalCosts, String maxNumberOfPeople, String rentalType, String roomStandard, String numberOfFloors) {
        super(serviceCode, serviceName, usableArea, rentalCosts, maxNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
   public  String gettoString(){
        return  this.getServiceCode() + "," + this.getServiceName() + "," + this.getUsableArea()  + "," + this.getRentalCosts() + "," +
                this.getMaxNumberOfPeople() + "," + this.getRentalType()  + "," + this.getRoomStandard()  + "," + this.getNumberOfFloors();
   }

}
