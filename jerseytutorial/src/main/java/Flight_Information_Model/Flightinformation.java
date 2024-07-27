/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Flight_Information_Model;

/**
 *
 * @author x18208746
 */
import java.sql.Connection;
import java.util.Arrays;

public class Flightinformation{ 

     private int FlightOrderNum;
	 private String Passengername;
	 private int PassengerPassportNum;
	 private String PassengerflightDeperture;
	 private String Flightinfo;
         private Connection[] Connections;
	 
	 public Flightinformation(){
	 }
	 
	 public Flightinformation(String Passengername,String Flightinfo){
	
	super();
	this.Passengername = Passengername;
        this.Flightinfo = Flightinfo;
	 }
	 
	 public Flightinformation(int FlightOrderNum, String Passengername, int PassengerPassportNum, String PassengerflightDeperture, String Flightinfo) {
		 
		 super();
		 this.FlightOrderNum = FlightOrderNum;
		 this.Passengername = Passengername;
		 this.PassengerPassportNum = PassengerPassportNum;
		 this.PassengerflightDeperture = PassengerflightDeperture;
		 this.Flightinfo = Flightinfo; 
		 
	 }
	 
	 
	 public Flightinformation(int FlightOrderNum,  String Passengername, Connection[] Connections){
		 
	 this.FlightOrderNum = FlightOrderNum;
	 this.Passengername = Passengername;
	 this.Connections = Connections;
	 
	 }
	 
	 
    public int getFlightOrderNum() {
		
		return FlightOrderNum;

    }
	
	public void setFlightOrderNum(int FlightOrderNum){
		this.FlightOrderNum = FlightOrderNum;
		

}
        public int getPassengerPassportNum() {
        
            return PassengerPassportNum;
        }
        
        public void setPassengerPassportNum(int PassengerPassportNum ){
            this.PassengerPassportNum = PassengerPassportNum;
                   
        }
        public void setFlightinfo(String Flightinfo){
            this.Flightinfo = Flightinfo;
        }
        public String getFlightinfo(){
        return Flightinfo;
        }
        

public String Passengername(){
	return Passengername;
}

public void setPassengername(String Passengername){
this.Passengername = Passengername;
}
public String PassengerflightDeperture(){
    return PassengerflightDeperture;
}
public void setPassengerflightDeperture(String PassengerflightDeperture){
    this.PassengerflightDeperture = PassengerflightDeperture;
}


public Connection[] getConnections(){
	return Connections;
}

public void setConnections(Connection[] Connections){
this.Connections = Connections;
}



@Override
public String toString() {
	return "Flight ID[flightId=" + FlightOrderNum + "Passengername=" + Passengername+ ", Connections" + Arrays.toString( Connections) + "]";
     } 

public String displayPassengerinfo(){
	return "Flight ID[flightId" +FlightOrderNum+ "Passengername=" +Passengername+ "]";
}



}


