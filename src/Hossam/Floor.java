package Hossam;

public class Floor {
    int floor_num =0;
    int numberOfRooms=0 ;
    room [] rooms ; 

    public Floor() {
        floor_num=0;
        numberOfRooms = 0 ;
        rooms = new room [numberOfRooms+2];

    }

    public Floor(int floor_num , int numberOfRooms) {
        this.floor_num = floor_num;
        this.numberOfRooms = numberOfRooms;
        rooms = new room [numberOfRooms+2];
        
    }
    
    
    public double floorProfits(){
        double sum=0;
        for (int i=0 ; i<numberOfRooms;i++){
            sum+=rooms[i].getPrice();
        }
        return sum;
    }
    
    public void availablerooms(){
        for (int i=0 ; i<numberOfRooms;i++){
            if (rooms[i].isReserved==false){
                System.out.println("Room Index : " + i+" , "+rooms[i].toString());
            }
        }
    }
    
    
}
