
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saad
 */
public class Email 
{
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private String email;
    private int defaultPasswordLength=12;
    private int mailBoxCapacity=500;
    private String alternateEmail;
    private String companySuffix="saadahmad.com";
    
    //Constructor to take firstName & lastName
    public Email(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
       // System.out.println("Email Created: "+this.firstName+" "+this.lastName);
        //call for a method that ask for a department;return the department.
        this.department=setDepartment();
        System.out.println("Department: "+this.department);
        //call method that returns a random password
        this.password=randomPassword(defaultPasswordLength);
        System.out.println("Your Password is: " + this.password);
        
        //combine elements to generate email.
        email= firstName.toLowerCase()+"."+ lastName.toLowerCase()+"@"+department+"."+companySuffix;
       // System.out.println("Your Email is: "+email);
    }
    //ask for Department
    private String setDepartment()
    {
        System.out.print("New worker: "+ firstName + "Enter Department\n1 for Accounting\n2 for Sales\n3 for Management\n4 for Marketing\n0 for none\nEnter Department Code: ");
        Scanner in=new Scanner(System.in);
        int deptChoice=in.nextInt();
        
        if(deptChoice==1){return "House Stark";}
        else if(deptChoice==2){return "House Lannister";}
        else if(deptChoice==3){return "House Targeryan";}
        else if(deptChoice==4){return "House Baratheon";}
        else{return "";}
        
    }
    //Generate password
    private String randomPassword(int length)
    {
     String passwordSet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ$_,.!@#" ;
     char [] pass=new char[length];
     for(int i=0;i<length;i++)
     {
         int rand=(int)(Math.random()*passwordSet.length());
         pass[i]=passwordSet.charAt(rand);
         
     }
     return new String(pass);
    }
    //mailbox capacity
    public void setMailboxCapacity (int capacity)
    {
        this.mailBoxCapacity=capacity;
    }
    //alternate email
    public void setAlternateEmail(String altEmail)
    {
        this.alternateEmail=altEmail;
    }
    //change password
    public void changePassword(String password)
    {
        this.password=password;
    }
    
    //retrieve set method output with get methods
    public int getMailboxCapacity(){return mailBoxCapacity;}
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword(){return password;}
    
    //show info 
    public String showInfo()
    {
        return "Display Name: "+firstName+" "+lastName+" "+
                "\nCompany Email: "+ email+" "+
                "\nMailbox Capacity: "+mailBoxCapacity+"MB";
    }
}
