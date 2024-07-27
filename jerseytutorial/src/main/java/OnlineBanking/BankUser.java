
package OnlineBanking;
// ArrayList 
/**
 *
 * @author livex
 * 
 */
public class BankUser {
    protected String firstname;
    protected String name;
    protected Double Balance;
    
    //default constructor
    public BankUser(){
        firstname = "";
        name = "";
        Balance = 0.0d;
        
        
    }
    //overloaded constructor

    public BankUser(String firstname, String name, Double Balance) {
        this.firstname = firstname;
        this.name = name;
        this.Balance = Balance;
    }


    public String getId() {
        return firstname;
    }

    public void setId(String id) {
        this.firstname = id;
    }
    
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDob() {
        return Balance;
    }

    public void setDob(Double dob) {
        this.Balance = Balance;
    }
    //print details from instantiable to console
    /*public void printDetails(){
        System.out.println("Employee Details:"+id+","+name+","+dob);
    }*/
    //return string to app class for printing there
    //public String printDetails(){
        //return "Employee Details:"+id+","+name+","+dob;
   // }
    
    
    
}

