/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadepattern.hotel;

/**
 *
 * @author DELL
 */
public class Cart implements HotelService {
    
    public void requestCart(int numberOfCarts){
        System.out.println("Requesting " + numberOfCarts + " luggage carts.");
    }
    
    @Override
    public void doService(){
        
    }
    
}
