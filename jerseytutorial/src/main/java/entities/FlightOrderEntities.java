/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.lang.model.element.Element;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import jdk.javadoc.internal.doclint.HtmlTag.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/**
 *
 * @author x18208746
 */


@Entity(name="flightorder")
@Table(name="flightorder")
public class FlightOrderEntities implements Serializable {
   
    @Id
	@Column(name="flightId=")
	int FlightOrderNum;
	
	@Column(name="Passengername")
	String PassengerName;
        
        public FlightOrderEntities() {
		
	}
    public FlightOrderEntities(int FlightOrderNum, String passengerName) {
		super();
		this.FlightOrderNum = FlightOrderNum;
		PassengerName = passengerName;
	}
    
     public int getFlightOrderNum() {
		return FlightOrderNum;
	}

	public void setFlightOrderNum(int FlightOrderNum) {
		this.FlightOrderNum = FlightOrderNum;
	}
    
        public String getPassengerName() {
		return PassengerName;
	}

	public void setPassengerName(String passengerName) {
		PassengerName = passengerName;
	}
        
        public void goToDatabase(@SuppressWarnings("exports") ActionEvent event)throws IOException, TransformerException {
     
            
                 	
    	
   	 String targetFile = "C:\\Users\\Kevwa\\eclipse-workspace\\javafx-uml.zip_expanded\\javafx-uml\\src\\files\\text.xml";
        
   	 
   	 
   	 
       
   
   	String jdbcUrl = "jdbc:sqlite:/C:\\Users\\Kevwa\\OneDrive\\Desktop\\SQLite\\sqlite-tools-win32-x86-3400100\\Bankusers.db";
		
   	
   	
   	try {
   		
   		
   	
   	Connection connection = DriverManager.getConnection(jdbcUrl);	
   	String sql = "SELECT * FROM Banklogin";
           
   	FileWriter fileWriter = new FileWriter (targetFile);
        BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
   	
   	Statement statement = connection.createStatement();
   	ResultSet result = statement.executeQuery(sql);
   	
   	
       
       
       
       
          
   	while (result.next() ) {
           
   	    
   
   	    String UserID = result.getString("UserID");
   	    String  Pin = result.getString("Pin");
   	    bufferWriter.write(UserID + "|" +Pin);
   	    Users Users = new Users();
   	    Users.setId(1);
   	    Users.setUsername(UserID);
   	    Users.setPincode(Pin);
   
     	
   
   	    
   	    DocumentBuilderFactory dbFactory = 
                   DocumentBuilderFactory.newInstance();
   	 

//Get DocumentBuilder object.
DocumentBuilder dBuilder = null;
try {
	
	
	dBuilder = dbFactory.newDocumentBuilder();
} catch (ParserConfigurationException e) {
                   // TODO Auto-generated catch block

}



//Get Document object.
        assert dBuilder != null;
        @SuppressWarnings("null")
Document document = dBuilder.newDocument();

//Define root element.
Element rootElement = (Element) document.createElement("login");
document.appendChild((Node) rootElement);

//Define students element.


//Write content into XML file.
TransformerFactory transformerFactory = 
                   TransformerFactory.newInstance();
Transformer transformer = transformerFactory.newTransformer();
DOMSource source = new DOMSource(document);
StreamResult result1 = new StreamResult(new File(targetFile));
transformer.transform(source, result1);

//For console Output.
StreamResult consoleResult = new StreamResult(System.out);
transformer.transform(source, consoleResult);			
         
   	}
   	
   	  

   	


} catch (SQLException e) {
   	    
   	    System.out.println("Error connecting to SQLite database");
   	    
   	    
   	}
   	        
   	


  		 
  	 }

    private static class Users {

        public Users() {
        }

        private void setId(int i) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setUsername(String UserID) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void setPincode(String Pin) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
  	 
   	
	
		
            
}
        



