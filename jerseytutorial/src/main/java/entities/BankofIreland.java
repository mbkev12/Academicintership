/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author x18208746
 */
public class BankofIreland {
    

    
    private Integer order;
    private String BankCompany_name;
    private String firistName;
    private String lastName;
    private String Acc_type; 
    private String userID; 
    private String pin;
    private Integer fromAcct;
    private Integer toAcct;
    private Double amount;
    private Double acctBal;
    private String memo;
    


public BankofIreland(){
  }

public Integer getOrder() {
    return order;
   

}

public void setOrder (Integer order){ 
       this.order = order;
}


public String getBankName() { 
    return BankCompany_name;
}

public void setBankName(String BankCompany_name){
    this.BankCompany_name = BankCompany_name;
}
public String getFirstname(){
    return firistName;
}

public void setFirstname(String firistName){
    this.firistName = firistName;

}
public String getlastName(){
    return lastName;
}
public void setlastName(String lastName){
    this.lastName = lastName;
}
public String getAccount(){ 
    return Acc_type;
}
public void setAccount(String Acc_type){
    this.Acc_type = Acc_type; 
    
}
public String getUserID(){
    return userID;
}
public void setUserID(String userID){
    this.userID = userID;
}
public String getPincode() {
    return pin;
}

public void setPincode(String pin){
    
  this.pin = pin;
  
}
public Integer getAccountinfo(){
    
return fromAcct;

}

public void setAccountinfo(Integer fromAcct) {
    this.fromAcct = fromAcct;
    
}

public Integer getToAccountinfo(){
    
    return toAcct;
}
public void setToAccoutinfo(Integer toAcct){
    this.toAcct = toAcct;
}
public Double getAmount(){
    
    return amount;
}

public void setAmount(Double amount){
    
    this.amount = amount;
}

public Double getBalance(){
    
    return acctBal;
}
public void setBalance(Double acctBal){
    this.acctBal = acctBal;
}

public String getMemo(){
    return memo;
}
public void setMemo(String memo){
    this.memo = memo;
}
}



