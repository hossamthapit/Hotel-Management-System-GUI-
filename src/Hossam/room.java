package Hossam;

public abstract class room {
    int roomnumber;
    int daysOfReservation;
    boolean isReserved = true;

    public room() 
    {
        roomnumber = 0 ;
        daysOfReservation=0;
        isReserved=true;
        
    }

    public room(int roomnumber, int daysOfReservation, boolean isReserved) {
        this.roomnumber = roomnumber;
        this.daysOfReservation = daysOfReservation;
        this.isReserved = isReserved;
    }
    
    
    public abstract double getPrice ();
    
    
   public boolean Reserved (){
       return isReserved;
   }
   
   public abstract String toString ();
   
   public int reserve(int days){
       
       if (isReserved == false ){
           return 0;
       }
       else {
           isReserved = !isReserved;
           daysOfReservation = days;
           return 1;
       }
   } 
   
    
}
