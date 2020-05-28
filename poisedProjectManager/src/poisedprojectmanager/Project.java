
package poisedprojectmanager ;

public class Project {
    //Attributes
    Person customer;
    Person contractor;
    Person architect;
    int projectNumber;
    String projectName;
    String buildingType;
    String buildingAddress;
    int erfNumber;
    double totalFee;
    double amountPaid;
    String dueDate;
    String finalise;
    
    //Methods
    public Project(Person customer, Person contractor, Person architect, int projectNumber, String projectName, String buildingType, String buildingAddress, int erfNumber, double totalFee, double amountPaid, String dueDate, String finalise){
        this.customer = customer;
        this.contractor = contractor;
        this.architect = architect;
        this.projectNumber = projectNumber;
        this.projectName = projectName;
        this.buildingType = buildingType;
        this.buildingAddress = buildingAddress;
        this.erfNumber = erfNumber;
        this.totalFee = totalFee;
        this.amountPaid = amountPaid;
        this.dueDate = dueDate;
        this.finalise = finalise;
    }
    
     public Person getCustomer(){
        return customer;
    }
      public Person getContractor(){
        return contractor;
    }
      public void setContractor(Person contractor){
        this.contractor = contractor;
      }
       public Person getArchitect(){
        return architect;
    }
 
    public double getAmountPaid(){
        return amountPaid;
    }
     public void setAmountPaid(double amountPaid){
        this.amountPaid = amountPaid;
     }

     public void setDueDate(String dueDate){
        this.dueDate = dueDate;
    }

    public String toString(){
        String output = "\nProject Number:" + projectNumber;
       output += "\nproject Name: " +projectName ;
       output+= "\nBuilding Type: " + buildingType;
       output += "\nProject Address: " + buildingAddress;
       output += "\nProject ERF Number: " + erfNumber;
       output += "\nTotal Fee: " + totalFee;
       output += "\nAmount Paid: " + amountPaid;
       output += "\nProject Due Date: " + dueDate;
       output += "\nProject finalised(Y/N): " + finalise;
       output += "\n\nCustomer\n"+customer;
       output += "\n\nContractor\n"+ contractor;
       output += "\n\nArchitect\n"+ architect;
       return output;
    }
}
