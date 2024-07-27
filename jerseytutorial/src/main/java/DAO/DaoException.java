/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author x18208746
 */
public class DaoException extends Exception {

private static final long serialVersionUID = 1L;

public DaoException() {
    super();
}
    public DaoException(String message) { 
        super (message);
    }
    public DaoException(Throwable cause){ 
        
        super(cause);
    }
}
