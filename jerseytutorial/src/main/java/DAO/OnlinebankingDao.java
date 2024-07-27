/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import entities.Onlinebanking;
import java.util.List;

/**
 *
 * @author x18208746
 */
public interface OnlinebankingDao {
    public Onlinebanking addBankuser(Onlinebanking onlinebanking) throws DaoException;
    public Onlinebanking addAccunt(Onlinebanking onlinebanking) throws DaoException;
    public Onlinebanking findAccountBalance(Integer balance) throws DaoException;
    public Onlinebanking findMemo(Onlinebanking onlinebanking) throws DaoException;
    public Onlinebanking  findbyOrderId(Integer id) throws DaoException;
    public Onlinebanking    addAccountBalance(Integer id) throws DaoException;
    public Onlinebanking   updateCustomer(  Onlinebanking onlinebanking) throws DaoException;
    public void deleteOnlinebanking(Integer id) throws DaoException;
    
    public List<Onlinebanking> viewAll() throws DaoException; 
    public List<Onlinebanking> findByfirstname(String firstname) throws DaoException;
    public List<Onlinebanking> findByuserID (String userID) throws DaoException;
    
}
