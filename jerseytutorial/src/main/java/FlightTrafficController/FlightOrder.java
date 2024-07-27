/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FlightTrafficController;

/**
 *
 * @author x18208746
 */


import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import Services.FlightOrderService;

import java.util.List;

@Path("/Flightinformation")
public class FlightOrder {
    
    FlightOrderService Services = new FlightOrderService();
    
	@GET
	@Path("/Orders")
	@Produces(MediaType.APPLICATION_XML)
	public List<FlightOrder> getFlightOrder() {
            List<FlightOrder> list  = Services.getFlightOrder();
		return list;
	}
		

	@POST
	@Path("/Orders")
	@Produces(MediaType.TEXT_PLAIN)
	public String postFlightOrder() {
		return "Add a new Flight Order";
	}
    
	@PUT
	@Path("/Orders/{Passengername}/{PassengerPassportNum}")
	@Produces(MediaType.TEXT_PLAIN)
	public String putFlightOrder(@PathParam("Passengername")  String Passengername,
			@PathParam("PassengerPassportNum")  int PassengerPassportNum) {
		return "Update Flight info with name & PassportID "+Passengername+" "+PassengerPassportNum;
	}
	
	@DELETE
	@Path("/Orders/{PassengerPassportNum}")
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteFlightOrder(@PathParam("PassengerPassportNum") int PassengerPassportNum) {
		return "delete brand from db with ID "+PassengerPassportNum;
	}
        
}

