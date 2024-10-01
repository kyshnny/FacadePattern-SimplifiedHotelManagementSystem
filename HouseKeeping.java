/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadepattern.hotel;

/**
 *
 * @author DELL
 */
public class HouseKeeping implements HotelService {
     
    public void cleanRoom(int roomNumber){
        System.out.println("Cleaning room number " + roomNumber + ".");
    }
    
    @Override
    public void doService(){
        
    }
    
}
