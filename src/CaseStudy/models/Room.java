package CaseStudy.models;

public class Room extends Facility{
    private String freeService;
    public Room() {
    }

    public Room(String serviceCode, String serviceName, String usableArea,
                String rentalCosts, String maxNumberOfPeople, String rentalType, String freeService) {
        super(serviceCode, serviceName, usableArea, rentalCosts, maxNumberOfPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                "} " + super.toString();
    }
    public String getToString(){
        return this.getServiceCode() + "," + this.getServiceName() + "," + this.getUsableArea() + "," + this.getRentalCosts() + "," +
                this.getMaxNumberOfPeople() + "," + this.getRentalType() + "," + this.getFreeService();
    }
}
