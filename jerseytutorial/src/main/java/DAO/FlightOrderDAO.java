/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import FlightTrafficController.FlightOrder;
import entities.FlightOrderEntities;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 *
 * @author x18208746
 */
public class FlightOrderDAO {
    
    SessionFactory factory = new Configuration()
			                 .configure("hibernate.cfg.xml")
			                 .addAnnotatedClass(FlightOrderEntities.class)
			                 .buildSessionFactory();
    
    public List<FlightOrder> getFlightOrder() {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<FlightOrder> list = session.createQuery("from flightorder").getResultList();
		return list;
	}
    public void addFlightOrder(FlightOrderEntities flightorder) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(flightorder);
		session.getTransaction().commit();

	}
    public void updateFlightOrder(FlightOrderEntities updatedFlightOrder) {
		int FlightOrderNum = updatedFlightOrder.getFlightOrderNum();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		FlightOrderEntities flightorder = session.get(FlightOrderEntities.class, FlightOrderNum);
		flightorder = updatedFlightOrder;
		session.getTransaction().commit();
	}
    
    public void deleteBrand(int FlightOrderNum) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		FlightOrderEntities flightorder = session.get(FlightOrderEntities.class, FlightOrderNum) ;
		session.delete(flightorder);
		session.getTransaction().commit();
		
	}
}
