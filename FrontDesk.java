/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadepattern.hotel;

/**
 *
 * @author DELL
 */
public class FrontDesk {
    private Valet valet;
    private HouseKeeping houseKeeping;
    private Cart cart;
    
    public FrontDesk(){
        this.valet = new Valet();
        this.houseKeeping = new HouseKeeping();
        this.cart = new Cart();
    }
    
    public void requestValetPickUpService(String plateNumber){
        valet.pickUpVehicle(plateNumber);
    }
    
    public void requestRoomCleaning(int roomNumber){
        houseKeeping.cleanRoom(roomNumber);
    }
    
    public void requestLuggageCarts(int numberOfCarts){
        cart.requestCart(numberOfCarts);
    }
    
}
