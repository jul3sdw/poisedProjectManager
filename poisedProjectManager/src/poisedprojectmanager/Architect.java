
package poisedprojectmanager;

public class Architect {
     //Attributes
    String architectName;
    int architectTelephone;
    String architectEmail;
    String architectAddress;

    //Methods
    public Architect(String architectName, int architectTelephone, String architectEmail, String architectAddress){
        this.architectName = architectName;
        this.architectTelephone = architectTelephone;
        this.architectEmail = architectEmail;
        this.architectAddress = architectAddress;
    }
    
    public String getArchitectName(){
        return architectName;
    }
    
    public int getArchitectTelephone(){
        return architectTelephone;
    }
    
    public String getArchitectEmail(){
        return architectEmail;
        
    }
    
    public String getArchitectAddress(){
        return architectAddress;
    }
}

