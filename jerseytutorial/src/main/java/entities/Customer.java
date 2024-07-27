/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;


/**
 *
 * @author x18208746
 */
public class Customer {
    
    private Integer userID; 
    private String thebank;
    private String firstname;
    private String lastname;
    private String pin; 
    private String account;
    private String city; 
    private String country;
    private Integer fromAcc;
    private Integer toAcc;
    private Integer amount;
    private Integer Accbalance;
    public String memo;
    


public Customer(){
  }

public Integer getID() {
    return userID;
   

}

public void setID (Integer ID){ 
       this.userID = ID; 
}


public String getBank() { 
    return thebank;
}   

    /**
     *
     * @param thebank
     */
    public void setBank(String thebank){
    this.thebank = thebank;
}
public String getLastname(){
    return lastname;
}

public void setLastname(String lastname){
    this.lastname = lastname;

}
public String getPin(){
    return pin;
}
public void setPin(String pin){
    this.pin = pin;
}
public String getCity(){ 
    return city;
}
public void setCity(String city){
    this.city = city; 
    
}
public String getCountry(){
    return country;
}
public void setCountry(String country){
    this.country = country;
}
public String getFirstname() {
    return firstname;
}

public void setFirstname(String firstname){
    
  this.firstname = firstname;
}
public String getaccount(){
    return account;
}
public void setaccount(String account){
    this.account = account;
}

public Integer getfromAcc(){
    return fromAcc;
}
public void setfromAcc(Integer fromAcc){
    this.fromAcc = fromAcc;
}
public Integer gettoAcc(){
    return toAcc;
}
    public void settoAcc (Integer toAcc){
        this.toAcc = toAcc;
    }
     public Integer getAccbalance(){
        return Accbalance;
    }
    public void setAccbalance(Integer Accbalance){
        this.Accbalance = Accbalance;
    }
    
    public String getmemo(){
        return memo;
    }
    public void setmemo(String memo){
        this.memo = memo;
    }
      public Integer getamount(){
        return amount;
    }
    public void setamount(Integer amount){
        this.amount = amount;
    }


}

