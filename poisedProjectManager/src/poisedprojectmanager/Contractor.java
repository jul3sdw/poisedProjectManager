
package poisedprojectmanager;

public class Contractor {
     //Attributes
    String contractorName;
    int contractorTelephone;
    String contractorEmail;
    String contractorAddress;
    
    
    //Methods
     public Contractor(String contractorName, int contractorTelephone, String contractorEmail,  String contractorAddress){
        this.contractorName = contractorName;
        this.contractorTelephone = contractorTelephone;
        this.contractorEmail = contractorEmail;
        this.contractorAddress = contractorAddress;
    }
    public String getContractorName(){
        return contractorName;
    }
    
    public void setContractorName(String contractorName){
        this.contractorName = contractorName;
    }
    
    public int getContractorTelephone(){
        return contractorTelephone;
    }
    
    public String getContractorEmail(){
        return contractorEmail;
    }
    
    public String getContractorAddress(){
        return contractorAddress;
    }
    
    public String toString(){
       String output = "\nContractor Name:" + contractorName;
       output += "\nContractor Telephone: " + contractorTelephone;
       output+= "\nContractor Email: " + contractorEmail;
       output += "\nContractor Address: " + contractorAddress;
       return output;
    }
}
