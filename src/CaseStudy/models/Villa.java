package CaseStudy.models;

public class Villa extends Facility {
    private String roomStandard;
    private String swimmingPoolArea;
    private String numberOfFloors;

    public Villa() {
    }

    public Villa(String serviceCode, String serviceName, String usableArea, String rentalCosts, String maxNumberOfPeople,
                 String rentalType, String roomStandard, String swimmingPoolArea, String numberOfFloors) {
        super(serviceCode, serviceName, usableArea, rentalCosts, maxNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(String swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", swimmingPoolArea=" + swimmingPoolArea +
                ", numberOfFloors=" + numberOfFloors +
                "} " + super.toString();
    }
    public String getToString(){
        return this.getServiceCode() + "," + this.getServiceName() + "," + this.getUsableArea() + "," + this.getRentalCosts() + "," +
                this.getMaxNumberOfPeople() + "," + this.getRentalType() + "," + this.getRoomStandard() + "," + this.getSwimmingPoolArea() + "," +
                this.getNumberOfFloors();
    }
}
