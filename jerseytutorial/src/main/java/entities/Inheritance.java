/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author livex
 */
public class Inheritance {
  protected String BankName = "Bank of Ireland";        // attribute
  public void name() {                    //  method
    System.out.println("Dublin1,Ireland");
  }
}

class Accounts extends Inheritance {
  private String AccountholderName = "Account holder: Kevin Mbiyavanga ";    //  attribute
  public static void main(String[] args) {

    //  object
    Accounts bank = new Accounts();

    // Call the name() method (from the Bankname class) on the bank object
    bank.name();
    
    class Employee1 {
  public void bank() {
    System.out.println("Employee1: Kevin Mbiyavanga");
  }
}

class Employee2 extends Employee1 {
  public void bank() {
    System.out.println("Employee2: Karl");
  }
}

class Bank extends Employee1 {
  public void bank() {
    System.out.println("Kevin is an employee at bank of ireland");
  }

   abstract class Employee3 {
   public void bank(){
    System.out.println("Employee3: Olumide");
    
    
  
  }

 
    }
  
}

    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(bank.BankName + " " + bank.AccountholderName);
     Employee1 Kevin = new Employee1();  // Created a employee1 object
    Employee2 Karl = new Employee2();  // Created a employee2 object
      
    
    
     Kevin.bank();
     Karl.bank();
    
   
  }
}