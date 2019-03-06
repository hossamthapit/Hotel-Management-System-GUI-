package Hossam;

public class Sweet extends room{

   double pricePerNight ;

    public Sweet() {
    }
    
    Sweet (double p)
    {
        pricePerNight=p;
    }

    public Sweet(double pricePerNight, int roomnumber, int daysOfReservation, boolean isReserved) {
        super(roomnumber, daysOfReservation, isReserved);
        this.pricePerNight = pricePerNight;
    }
    
 
    @Override
    public String toString() {
        return "Room Type: Sweet, "+"Room Number: "+roomnumber+" ,available: "+isReserved
                +" ,Price Per Night: "+pricePerNight;

    }

    @Override
    public double getPrice() {
        return pricePerNight;

    }
    
}
