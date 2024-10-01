/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facadepattern.hotel;

/**
 *
 * @author DELL
 */
public class HotelApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();
        
        frontDesk.requestValetPickUpService("NA127");
        frontDesk.requestRoomCleaning(205);
        frontDesk.requestLuggageCarts(5);
    }
    
}
