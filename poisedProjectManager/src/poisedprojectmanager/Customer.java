
package poisedprojectmanager;

public class Customer {
     //Attributes
    String customerName;
    int customerTelephone;
    String customerEmail;
    String customerAddress;
    
    //Metods
    public Customer(String customerName, int customerTelephone, String customerEmail,  String customerAddress){
        this.customerName = customerName;
        this.customerTelephone = customerTelephone;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
    }
    public String getCustomerName(){
        return customerName;
    }
    
    public int getCustomerTelephone(){
        return customerTelephone;
    }
    
    public String getCustomerEmail(){
        return customerEmail;
    }
    
    public String getCustomerAddress(){
        return customerAddress;
    }
    
    public String toString(){
       String output = "Customer Name:" + customerName;
       output += "\nCustomer Telephone: " + customerTelephone;
       output+= "\nCustomer Email: " + customerEmail;
       output += "\nCustomer Address: " + customerAddress;
       return output;
    }
}
