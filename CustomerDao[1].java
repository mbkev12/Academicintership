/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import entities.Customer;
import java.util.List;
/**
 *  
 * @author x18208746
 */
public interface CustomerDao {
    
    public Customer addCustomer(Customer customer) throws DaoException;
    public Customer addUser(Customer customer) throws DaoException;
    public Customer addAccount(Customer customer) throws DaoException;
    public Customer findAccountBalance(Integer balance) throws DaoException;
    public Customer findMemo(Customer customer) throws DaoException;
    public Customer  findbyOrderId(Integer id) throws DaoException;
    public Customer addAccountBalance(Integer id) throws DaoException;
    public Customer  updateCustomer(Customer customer) throws DaoException;
    public void deleteCustomer(Integer id) throws DaoException;
   
   
   public List<Customer> viewAll() throws DaoException;
   public List<Customer> findByName (String name) throws DaoException;
   public List<Customer> findByProduct (String product) throws DaoException;
   
}   