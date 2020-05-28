//PoisedProjectManager
//Written by Julian de Wet
//Written on: 20/04/2020
//Program creates projects for a construction firm



package poisedprojectmanager;
//import
import java.util.Scanner;

           
       


public class PoisedProjectManager {
    //Method to change contractor details
public static Person ContractorEditDetails(){
           System.out.print("Name of Contractor:");
           Scanner sContractorName = new Scanner(System.in);
           String contractorName = sContractorName.nextLine();
           
           System.out.print("Email of Contractor:");
           Scanner sContractorEmail = new Scanner(System.in);
           String contractorEmail = sContractorEmail.nextLine();
           
           System.out.print("Address of Contractor:");
            Scanner sContractorAddress = new Scanner(System.in);
           String contractorAddress = sContractorAddress.nextLine();
           
           System.out.print("Telephone number of Contractor:");
           Scanner sContractorTelephone = new Scanner(System.in);
           String contractorTelephone = sContractorTelephone.nextLine();
           
           Person contractor = new Person(contractorName, contractorTelephone, contractorEmail, contractorAddress);
           return contractor;
       }

//Method creates new cusomer
public static Person newCustomer(){
     System.out.print("Name of Customer:");
           Scanner sCustomerName = new Scanner(System.in);
           String customerName = sCustomerName.nextLine();
           
           System.out.print("Email of Customer:");
           Scanner sCustomerEmail = new Scanner(System.in);
           String customerEmail = sCustomerEmail.nextLine();
           
           System.out.print("Address of Customer:");
            Scanner sCustomerAddress = new Scanner(System.in);
           String customerAddress = sCustomerAddress.nextLine();
           
           System.out.print("Telephone number of Customer:");
           Scanner sCustomerTelephone = new Scanner(System.in);
           String customerTelephone = sCustomerTelephone.nextLine();
           
           Person customer = new Person(customerName, customerTelephone, customerEmail, customerAddress);
           return customer;

}
//Method creates new Contractor
public static Person newContractor(){
     System.out.print("Name of Contractor:");
           Scanner sContractorName = new Scanner(System.in);
           String contractorName = sContractorName.nextLine();
           
           System.out.print("Email of Contractor:");
           Scanner sContractorEmail = new Scanner(System.in);
           String contractorEmail = sContractorEmail.nextLine();
           
           System.out.print("Address of Contractor:");
            Scanner sContractorAddress = new Scanner(System.in);
           String contractorAddress = sContractorAddress.nextLine();
           
           System.out.print("Telephone number of Contractor:");
           Scanner sContractorTelephone = new Scanner(System.in);
           String contractorTelephone = sContractorTelephone.nextLine();
           
           Person contractor = new Person(contractorName, contractorTelephone, contractorEmail, contractorAddress);
           return contractor;
}
//Method creates new Architect
public static Person newArchitect(){
    System.out.print("Name of Contractor:");
           Scanner sArchitectName = new Scanner(System.in);
           String architectName = sArchitectName.nextLine();
           
           System.out.print("Email of Architect:");
           Scanner sArchitectEmail = new Scanner(System.in);
           String architectEmail = sArchitectEmail.nextLine();
           
           System.out.print("Address of Architect:");
            Scanner sContractorAddress = new Scanner(System.in);
           String architectAddress = sContractorAddress.nextLine();
           
           System.out.print("Telephone number of Architect:");
           Scanner sArchitectTelephone = new Scanner(System.in);
           String architectTelephone = sArchitectTelephone.nextLine();
           
           Person architect = new Person(architectName, architectTelephone, architectEmail, architectAddress);
           return architect;
}
//Method creates new Project
public static Project ProjectDetails(int projectNumber){
    
           //Calling all the methods to create people objects
           Person customer = newCustomer();
           Person architect = newArchitect();
           Person contractor = newContractor();
           
           //Gives number to project
           projectNumber++;
           
           //Inputs for project details
           System.out.print("Project Name:");
           Scanner sProjectName = new Scanner(System.in);
           String projectName = sProjectName.nextLine();
           
           System.out.print("Building Type:");
           Scanner sBuildingType = new Scanner(System.in);
           String buildingType = sBuildingType.nextLine();
           
           System.out.print("Building Address:");
           Scanner sBuildingAddress = new Scanner(System.in);
           String buildingAddress = sBuildingAddress.nextLine();
           
           System.out.print("ERF Number:");
           Scanner sErfNumber = new Scanner(System.in);
           int erfNumber = sErfNumber.nextInt();
           
           System.out.print("Total Fee: R");
           Scanner sTotalFee = new Scanner(System.in);
           double totalFee = sTotalFee.nextDouble();
           
           System.out.print("Amount Paid: R");
           Scanner sAmountPaid = new Scanner(System.in);
           double amountPaid = sAmountPaid.nextDouble();
           
           System.out.print("Due Date:");
           Scanner sDueDate = new Scanner(System.in);
           String dueDate = sDueDate.nextLine();
           
           System.out.print("Finalise Project:");
           Scanner sFinalise = new Scanner(System.in);
           String finalise = sFinalise.nextLine();
           
           
          //If statement to set the name of the Project
           if (projectName.equals("")){
               String[] custName = customer.getName().split(" ");
               String newProjectName = custName[1] + " " + buildingType;
               Project newProject = new Project(customer, architect, contractor, projectNumber, newProjectName, buildingType, buildingAddress, erfNumber, totalFee, amountPaid, dueDate, finalise); 
               double toPay = totalFee - amountPaid;
               //If statement to finalise project
               if (finalise.equals("Y")){
                   
               if (toPay != 0){
                   
                   //Outputs invoice
                   System.out.println("Invoice:\n"+customer + "\n"+toPay);
               }
               //Input to edit or not
               System.out.println("\n"+newProject+"\n Are the details correct(Y/N)?");
           Scanner sFinalDetails = new Scanner(System.in);
           String finalDetails = sFinalDetails.nextLine();
           
           //If you dont want to edit
           if (finalDetails.equals("Y")){
               System.out.println("Project created");
               return newProject;
           }
           //If you do want to edit
           else if (finalDetails.equals("N")){
               //Menu of what to edit
               System.out.println("What details must be edited\nCD - Contractor Details\nDD-Due date\nFP-Fee Paid\nC-Cancel");
               Scanner sEditMenu = new Scanner(System.in);
               String editMenu = sEditMenu.nextLine();
               
               while(!editMenu.equals("C")){
               System.out.println("What details must be edited\nCD - Contractor Details\nDD-Due date\nFP-Fee Paid\nC- Cancel");
               sEditMenu = new Scanner(System.in);
               editMenu = sEditMenu.nextLine();
               
               //Edit contractor
               if (editMenu.equals("CD")){
                   contractor = ContractorEditDetails();
                   newProject.setContractor(contractor);
               }
               //Edit due date
                else if (editMenu.equals("DD")){
                    System.out.print("Enter the new Due Date:");
                    Scanner sNewDueDate = new Scanner(System.in);
                    String newDueDate = sNewDueDate.nextLine();
                    newProject.setDueDate(newDueDate);
                     }
                //Edit Amount paid
                else if (editMenu.equals("FP")){
                    System.out.print("Enter the new Amount Paid:");
                    Scanner sNewFeePaid= new Scanner(System.in);
                    double newAmountPaid = sNewFeePaid.nextDouble();
                    newProject.setAmountPaid(newAmountPaid);
                }
               //Outputs edited details
               System.out.println("New Project Details:\n"+newProject);
               }
           }
               }
               //Not finalised
               else if (finalise.equals("N")){
                    System.out.println("\n"+newProject+"\n Are the details correct(Y/N)?");
           Scanner sFinalDetails = new Scanner(System.in);
           String finalDetails = sFinalDetails.nextLine();
           
           //If you dont want to edit
           if (finalDetails.equals("Y")){
               System.out.println("Project created");
               return newProject;
           }
           //If you do want to edit
           else if (finalDetails.equals("N")){
               //Menu of what to edit
               System.out.println("What details must be edited\nCD - Contractor Details\nDD-Due date\nFP-Fee Paid\nC-Cancel");
               Scanner sEditMenu = new Scanner(System.in);
               String editMenu = sEditMenu.nextLine();
               
               while(!editMenu.equals("C")){
               System.out.println("What details must be edited\nCD - Contractor Details\nDD-Due date\nFP-Fee Paid\nC- Cancel");
               sEditMenu = new Scanner(System.in);
               editMenu = sEditMenu.nextLine();
               
               //Edit contractor
               if (editMenu.equals("CD")){
                   contractor = ContractorEditDetails();
                   newProject.setContractor(contractor);
               }
               //Edit due date
                else if (editMenu.equals("DD")){
                    System.out.print("Enter the new Due Date:");
                    Scanner sNewDueDate = new Scanner(System.in);
                    String newDueDate = sNewDueDate.nextLine();
                    newProject.setDueDate(newDueDate);
                     }
                //Edit Amount paid
                else if (editMenu.equals("FP")){
                    System.out.print("Enter the new Amount Paid:");
                    Scanner sNewFeePaid= new Scanner(System.in);
                    double newAmountPaid = sNewFeePaid.nextDouble();
                    newProject.setAmountPaid(newAmountPaid);
                }
               //Outputs edited details
               System.out.println("New Project Details:\n"+newProject);
               }
               }
               }
           
               System.out.println(newProject);
               return newProject;
           }
           //Project with name
           else{
               //Create new project object
           Project newProject = new Project(customer, contractor, architect, projectNumber, projectName, buildingType, buildingAddress, erfNumber, totalFee, amountPaid, dueDate, finalise);  
           System.out.println(newProject);
           //Check if you want to edit the project
           System.out.println("\n Are the details correct(Y/N)?");
           Scanner sFinalDetails = new Scanner(System.in);
           String finalDetails = sFinalDetails.nextLine();
           //Choosing not to edit
           if (finalDetails.equals("Y")){
               System.out.println("Project created");
               System.out.println("\n"+newProject);
               return newProject;
           }
           //Choose to edit project
           else if (finalDetails.equals("N"))
               System.out.println("What details must be edited\nCD - Contractor Details\nDD-Due date\nFP-Fee Paid\nC- Cancel");
               Scanner sEditMenu = new Scanner(System.in);
               String editMenu = sEditMenu.nextLine();
               
              
               //Edit contractor
               if (editMenu.equals("CD")){
                   contractor = ContractorEditDetails();
                   newProject.setContractor(contractor);
                   System.out.println(newProject);
               }
               //edit due date
                else if (editMenu.equals("DD")){
                    System.out.print("Enter the new Due Date:");
                    Scanner sNewDueDate = new Scanner(System.in);
                    String newDueDate = sNewDueDate.nextLine();
                    newProject.setDueDate(newDueDate);
                     }
                //Edit amount Paid
                else if (editMenu.equals("FP")){
                    System.out.print("Enter the new Amount Paid:");
                    Scanner sNewFeePaid= new Scanner(System.in);
                    double newAmountPaid = sNewFeePaid.nextDouble();
                    newProject.setAmountPaid(newAmountPaid);
                }
               //Output editted project
               System.out.println("New Project Details:\n"+newProject);
               
               return newProject;
           }
         
           
           
          
           
}

  
//Main menu Method
public static String Menu(){
    
    System.out.println("\nMenu:\n Create new project- CP\nExit-E ");
       Scanner newProjectCheck = new Scanner(System.in);
       String projectCreateCheck = newProjectCheck.next();
       return projectCreateCheck;
}

    public static void main(String[] args) {
        //Sets project numbers to start at 0
        int projectNumber = 0;
        //Welcome screen
       System.out.println("Welcome to the Poised Project Manager");
       for (int i = 0; i<38;i++){
           System.out.print("=");
       }
       boolean exit = true;
       while (exit==true){
       //Calls main menu method
       String menuChoice = Menu();
       //If statement to create a new project or close the program
       if (menuChoice.equals("CP")){
          ProjectDetails(projectNumber);
           
           
       }
       //Exits the program
       else if (menuChoice.equals("E")){
           System.out.println("Closing program...");
           exit = false;
       }
       
    }
    }
       
}
