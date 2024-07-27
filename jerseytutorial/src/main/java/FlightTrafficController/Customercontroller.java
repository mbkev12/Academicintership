/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FlightTrafficController;



import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


import DAO.CustomerDao;
import DAO.DaoException;
import DAO.DaoFactory;
import entities.Customer; 

/**
 *
 * @author x18208746
 */
@Path ("/customers")
public class Customercontroller {
    
    
    private CustomerDao dao;
    
    public Customercontroller() throws DaoException { 
        
        dao = DaoFactory.getCustomerDao();
    }
    
    @GET
    @Produces ({"application/json", "text/csv"})
    public Response getAllCustomer()throws DaoException {
        return Response.ok(dao.viewAll()).build();
    } 
    
    
    
    @Path("/{customerpin_id}")
    @Produces({"application/json", "text/csv"})
    @GET
    public Response getOneCustomer(@PathParam("customer_id") Integer id) throws DaoException {
        return Response.ok (dao.findbyOrderId(id)).build();
    }
    
    @POST
    @Produces({"application/json", "text/csv"})
    @Consumes({"application/json", "text/csv"})
    public Response addNewCustomer(Customer customer)throws DaoException {
        customer = dao.addCustomer(customer);
        return Response.ok(customer).build();
    }
       @Path("/{customer_id}")  
       @PUT
       @Produces({"application/json"})
       @Consumes({"application/json"})
       public Response updateCustomer(@PathParam("customer_id")Integer id, Customer customer) throws DaoException {
              customer.setID(id);
              customer = dao .updateCustomer(customer);
              return Response.ok(customer).build();
    
}
       @DELETE
       @Path("/{customer_id}")
       @Produces({"application/json"})
       public Response deleteCustomer(@PathParam("customer_id")Integer id) throws DaoException {
           dao.deleteCustomer(id);
           return Response.ok().build();
           
       

       }
}