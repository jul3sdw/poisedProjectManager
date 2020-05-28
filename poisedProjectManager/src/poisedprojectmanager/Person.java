
package poisedprojectmanager;

public class Person {
     //Attributes
     String name;
     String telephone;
     String email;
     String address;
    
    //Methods
    public Person(String name, String telephone, String email, String address){
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.address = address;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        String output = "Name:" + name;
       output += "\nTelephone: " + telephone;
       output+= "\nEmail: " + email;
       output += "\nAddress: " + address;
       return output;
    }
}