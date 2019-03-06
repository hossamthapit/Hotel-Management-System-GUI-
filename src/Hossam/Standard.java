package Hossam;

public class Standard extends room{
    int numberOfBeds=0;
    double bedPrice=0;

    public Standard() {
        numberOfBeds = 0;
        bedPrice = 0;
    }

    public Standard(int numberOfBeds, double bedPrice) {
        this.numberOfBeds = numberOfBeds;
        this.bedPrice = bedPrice;
    }

    public Standard(int numberOfBeds, double bedPrice, int roomnumber,
            int daysOfReservation, boolean isReserved) {
        super(roomnumber, daysOfReservation, isReserved);
        this.numberOfBeds = numberOfBeds;
        this.bedPrice = bedPrice;
    }

    @Override
    public String toString() {
        return "Room Type: Standard, "+"Room Number: "+roomnumber+" ,available: "
                +isReserved+" ,Number of beds: "+numberOfBeds+" ,Bed price: "+bedPrice;

    }

    @Override
    public double getPrice() {
        return bedPrice*numberOfBeds;

    }
    
    
    
    
    
}
