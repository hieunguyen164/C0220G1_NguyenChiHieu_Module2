package casestudy.models;

public class Room extends Services {
    private String freeService;

    public Room(){

    }
    public Room(String id, String nameOfService, double usedArea, double rentalFee, int maxGuest, String rentType,String freeService){
        super(id,nameOfService,usedArea,rentalFee,maxGuest,rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public void showInfor() {
        System.out.println( "1. ID Service: "+this.getId()+"\n"+
                "2. Name of Service: "+this.getNameOfService()+"\n"+
                "3. Used Area: "+this.getUsedArea()+"\n"+
                "4. Rent Fee: "+this.getRentalFee()+"\n"+
                "5. Maximum number of guest: "+this.getMaxGuest()+"\n"+
                "6. Rent Type: "+this.getRentType()+"\n"+
                "7. Include free servies: "+this.getFreeService()+"\n"
                );
    }
}
