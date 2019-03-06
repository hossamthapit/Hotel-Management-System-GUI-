package Hossam;

import javax.swing.JOptionPane;

public class Menu extends Floor{
    public static Floor floors[] ;

    public Menu(Floor []f) {
        floors = f;
    }
    
    
    public static void statues_Of_The_Rooms(Floor []f){
        for(int i = 0 ; i < f.length ;i++){
            System.out.println("Floor Number : " + (i+1) + " ");
            for(int k = 0 ; k < f[i].numberOfRooms ;k++){
                System.out.println(f[i].rooms[k]);
            }
        } 
    }
    
    
    public static double total_Profits(Floor []f){
        double total = 0 ;
        for(int i = 0 ; i < f.length ;i++){
            for(int k = 0 ; k < f[i].numberOfRooms ;k++){
                if(f[i].rooms[k].isReserved==false)
                     total+= (f[i].rooms[k].getPrice()*f[i].rooms[k].daysOfReservation);
            }
        }
        return total;
       // JOptionPane.showMessageDialog(this, "Total Hotel Profit is " + total + " LE ");
    }
    
    
    public static int cancel_Reservation(int flor , int room_num){
        
        if(floors[flor].rooms[room_num].Reserved() == false){
            floors[flor].rooms[room_num].isReserved = true ;
            return 1 ;
        }
        else {
            return 0 ;
        }
    }    

    public static int check_Out(int flor , int room_num){
        if(floors[flor].rooms[room_num].Reserved() == false){
            floors[flor].rooms[room_num].isReserved = true ;
            return 1 ;
        }
        else {
            return 0;
        }
    }  
}
