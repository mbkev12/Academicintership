/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import java.util.List;

import DAO.FlightOrderDAO;
import FlightTrafficController.FlightOrder;
import entities.FlightOrderEntities;

/**
 *
 * @author x18208746
 */
public class FlightOrderService {
    
    FlightOrderDAO DAO = new  FlightOrderDAO();
    
    public List<FlightOrder> getFlightOrder() {
		List<FlightOrder> list = DAO.getFlightOrder();
		
                return list;
	}
    public void addFlightOrder(FlightOrderEntities flightOrder) {
		DAO.addFlightOrder(flightOrder);
		
	}
    
   public void updateFlightOrder(FlightOrderEntities updatedFlightOrder) {
		DAO.updateFlightOrder(updatedFlightOrder);
		
	}
  
		
	
   
   

	
    
    
}
