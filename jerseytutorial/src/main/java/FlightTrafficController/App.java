/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FlightTrafficController;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import Flight_Information_Model.Flightinformation;




/**
 *
 * @author x18208746
 */
public class App {
    
    static Client client = ClientBuilder.newClient();
	static WebTarget baseFlightinformationURL = client
    	.target("http://localhost:49000/jerseytutorial/FlightOrder/Flightinformation");
	static WebTarget FlightinformationURL = baseFlightinformationURL.path("{PassengerPassportNum}");
      
	public static void main(String[] args) {

		Flightinformation[] response = baseFlightinformationURL.request(MediaType.APPLICATION_JSON)
				.get(Flightinformation [].class);
		
		for(Flightinformation flightinformation: response) {
			System.out.println(flightinformation);
		}
		
		
	}

}

