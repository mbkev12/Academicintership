/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author x18208746
 */
public final class DaoFactory {
    
    private static final String IMPL_TYPE = "jdbc";
            private DaoFactory() { 
                
               
            }
            public static CustomerDao getCustomerDao() throws DaoException {
             switch (IMPL_TYPE) {
                 case "jdbc":
                     return new JdbcCustomerDao();
                 default:
                     throw new DaoException("Not available");
             }
}
}