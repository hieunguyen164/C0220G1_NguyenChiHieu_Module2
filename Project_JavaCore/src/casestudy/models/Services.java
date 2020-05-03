package casestudy.models;

public abstract class Services {
    private String id;
    private String nameOfService;
    private double usedArea;
    private double rentalFee;
    private int maxGuest;
    private String rentType;


    public Services(){

    }
    public Services(String id, String nameOfService, double usedArea, double rentalFee, int maxGuest, String rentType){
            this.id = id;
        this.nameOfService = nameOfService;
        this.usedArea = usedArea;
        this.rentalFee = rentalFee;
        this.maxGuest = maxGuest;
        this.rentType = rentType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameOfService() {
        return nameOfService;
    }

    public void setNameOfService(String nameOfService) {
        this.nameOfService = nameOfService;
    }

    public double getUsedArea() {
        return usedArea;
    }

    public void setUsedArea(double usedArea) {
        this.usedArea = usedArea;
    }

    public double getRentalFee() {
        return rentalFee;
    }

    public void setRentalFee(double rentalFee) {
        this.rentalFee = rentalFee;
    }

    public int getMaxGuest() {
        return maxGuest;
    }

    public void setMaxGuest(int maxGuest) {
        this.maxGuest = maxGuest;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }


    

    public abstract void showInfor();
}
