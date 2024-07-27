/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utils.DbUtil;
/**
 *
 * @author x18208746
 */
public class JdbcCustomerDao implements CustomerDao{
    
    public Customer addCutomer (Customer customer) throws DaoException {
        
        String sql = "insert into customer(userID, thebank, firstname, lastname, pin, account, fromAcc, toAcc, amount, Accbalance, memo) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
     
  	
		try(
				Connection conn = DbUtil.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		) {
			stmt.setString(1, customer.getBank());
                        
			stmt.setString(3, customer.getFirstname());
			stmt.setString(4, customer.getLastname());
			stmt.setString(5, customer.getPin());
                        stmt.setString(6, customer.getaccount());
                        stmt.setString(7, customer.getmemo());
                        
			
			stmt.executeUpdate();
			ResultSet keys = stmt.getGeneratedKeys();
			keys.next();
			customer.setID(keys.getInt(1));
                        customer.setamount(keys.getInt(2));
                        customer.settoAcc(keys.getInt(3));
                        customer.setAccbalance(keys.getInt(4));
                        
                        
                        
                        
			
			return customer;
		}
		catch(Exception ex) {
			throw new DaoException(ex);
		}
		
	}

	public Customer findByOrder(Integer userID) throws DaoException {
		String sql = "select * from customer where userID = ?";
		
		try(
				Connection conn = DbUtil.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql);
		) {
			stmt.setInt(1, userID);
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				Customer c = toCustomer(rs);
				rs.close();
				return c;
			}
			
			rs.close();
		}
		catch(Exception ex) {
			throw new DaoException(ex);
		}
		
		return null;
	}

	private Customer toCustomer(ResultSet rs) throws SQLException {
		Customer c = new Customer();
	c.setID(rs.getInt("userID")); 
		c. setBank(rs.getString("thebank"));
	c.setFirstname(rs.getString("firstname"));
		c.setFirstname(rs.getString("lastname"));
		c.setPin(rs.getString("pin")); 
		 
                
		return c;   
	}

    @Override
	public Customer updateCustomer(Customer customer) throws DaoException {
		String sql = "update customer set thebank=?, firstname=?, lastname=?, pin=?, account=?, userID=? where id=?";
		
		try(
				Connection conn = DbUtil.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql);
		) {
			stmt.setString(1, customer.getBank());
			stmt.setString(2, customer.getFirstname());
			stmt.setString(3, customer.getPin());
			stmt.setString(4, customer.getaccount());
			stmt.setInt(5, customer.getID());
			
			int count = stmt.executeUpdate();
			if(count==0) {
				throw new DaoException("No records updated; invalid id supplied - " + customer.getID());
			}
		}
		catch(Exception ex) {
			throw new DaoException(ex);
		}
		return customer;
	}
    @Override
	public void deleteCustomer(Integer userID) throws DaoException {
		String sql = "delete from contacts where id = ?";
		
		try(
				Connection conn = DbUtil.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql);
		) {
			stmt.setInt(1, userID);
			int count = stmt.executeUpdate();
			if(count==0) {
				throw new DaoException("No records deleted; invalid id supplied - " + userID);
			}
		}
		catch(Exception ex) {
			throw new DaoException(ex);
		}

	}

	public List<Customer> findAll() throws DaoException {
		String sql = "select * from contacts";
		List<Customer> list = new ArrayList<>();
		
		try(
				Connection conn = DbUtil.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery();
		){
			while(rs.next()) {
				Customer c = toCustomer(rs);
				list.add(c);
			}
		}
		catch(Exception ex) {
			throw new DaoException(ex);
		}
		return list;
	}

	public List<Customer> findByCity(String city) throws DaoException {
		String sql = "select * from contacts where city = ?";
		List<Customer> list = new ArrayList<>();
		
		try(
				Connection conn = DbUtil.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql);
				
		){
			stmt.setString(1, city);
                    try (ResultSet rs = stmt.executeQuery()) {
                        while(rs.next()) {
                            Customer c = toCustomer(rs);
                            list.add(c);
                        }
                    }
		}
		catch(Exception ex) {
			throw new DaoException(ex);
		}
		return list;
	}

	public List<Customer> findByCountry(String country) throws DaoException {
		String sql = "select * from contacts where country = ?";
		List<Customer> list = new ArrayList<>();
		
		try(
				Connection conn = DbUtil.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql);
				
		){
			stmt.setString(1, country);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Customer c = toCustomer(rs);
				list.add(c);
			}
			rs.close();
		}
		catch(Exception ex) {
			throw new DaoException(ex);
		}
		return list;
	}

    @Override
    public Customer addCustomer(Customer customer) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Customer findbyOrderId(Integer id) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Customer> viewAll() throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Customer> findByName(String name) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Customer> findByProduct(String product) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Customer addUser(Customer customer) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Customer addAccount(Customer customer) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Customer findAccountBalance(Integer balance) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Customer findMemo(Customer customer) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Customer addAccountBalance(Integer id) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
