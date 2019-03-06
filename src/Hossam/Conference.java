package Hossam;


public class Conference extends room {

        int numberOfSeats;
        double seatPrice;

    public Conference() {
        numberOfSeats=0;
        seatPrice=0;

    }

    public Conference(int numberOfSeats, double seatPrice) {
        this.numberOfSeats = numberOfSeats;
        this.seatPrice = seatPrice;
    }

    public Conference(int numberOfSeats, double seatPrice, int roomnumber, 
            int daysOfReservation, boolean isReserved) {
        super(roomnumber, daysOfReservation, isReserved);
        this.numberOfSeats = numberOfSeats;
        this.seatPrice = seatPrice;
    }

    @Override
    public String toString() {

        return "Room Type: Conference, "+"Room Number: "+roomnumber+" ,available: "+isReserved
                +" ,Number Of Seats"+numberOfSeats+" ,Price Per seat: "+seatPrice;

    }

    @Override
    public double getPrice() {
        return numberOfSeats* seatPrice;
    }
    
      
        
}
