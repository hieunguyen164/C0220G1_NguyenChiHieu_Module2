package casestudy.models;

public class House extends Services {
    private String roomType;
    private String facilities;
    private int numberOfFloor;

    public House(){

    }
    public House(String id, String nameOfService, double usedArea, double rentalFee, int maxGuest, String rentType,
                 String roomType,String facilities, int numberOfFloor){
        super(id,nameOfService,usedArea,rentalFee,maxGuest,rentType);
        this.roomType = roomType;
        this.facilities = facilities;
        this.numberOfFloor = numberOfFloor;

    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }


    @Override
    public void showInfor() {
        System.out.println( "1. ID Service: "+this.getId()+"\n"+
                "2. Name of Service: "+this.getNameOfService()+"\n"+
                "3. Used Area: "+this.getUsedArea()+"\n"+
                "4. Rent Fee: "+this.getRentalFee()+"\n"+
                "5. Maximum number of guest: "+this.getMaxGuest()+"\n"+
                "6. Rent Type: "+this.getRentType()+"\n"+
                "7. Room Type: "+this.getRoomType()+"\n"+
                "8. Facilities: "+this.getFacilities()+"\n"+
                "9. Number of Floors: "+this.getNumberOfFloor()+"\n"
                );
    }
}
