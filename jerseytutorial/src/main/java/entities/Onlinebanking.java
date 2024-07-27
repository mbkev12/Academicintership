    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author x18208746
 */
public class Onlinebanking {
    
    private String thebank;
    private String firstname;
    private String lastname;
    private String pin;
    private String account;
    private String userID;
    private Integer fromAcc;
    private Integer toAcc;
    private Integer amount;
    private Integer Accbalance;
    private String memo;    
    
    public Onlinebanking(){
        
    }
    
    public String getThebank(){
        return thebank;
    }
     public void setThebank(String thebank){
         this.thebank = thebank;
     }
     public String getfirstname(){
         return firstname;
     }
    public void setfirstname(String firstname){
        this.firstname = firstname;
    }
    public String getlastname(){
        return lastname;
    }
    public void setlastname(String lastname){ 
        this.lastname = lastname;
    }
    public String getpin(){
        return pin;
    }
    public void setpin(String pin){
this.pin = pin;
}
public String getaccount(){
    return account;
}
public void setaccount(String account){
    this.account = account;
  
}   
public String getuserID(){
    return userID;
}
public void setuserID(String userID){
    this.userID = userID;
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
    public Integer getamount(){
        return amount;
    }
    public void setamount(Integer amount){
        this.amount = amount;
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
}

