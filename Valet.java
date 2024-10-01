/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadepattern.hotel;

/**
 *
 * @author DELL
 */
public class Valet implements HotelService {
    
    public void pickUpVehicle(String plateNumber){
        System.out.println("Picking up vehicle with plate number " + plateNumber + ".");
    }
    
    @Override
    public void doService(){
        
    }
    
}
