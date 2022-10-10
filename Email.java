import java.util.*;
  public class Email{
     
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String alternateEmail;
    private String department;
    private int passwordLength = 10;
    private int mailboxcapacity = 500;
    private String companySuffix = "randomcompany";


    // Step 1: Constructor to receive firstname and last name
    public Email(String firstName, String lastName){
      this.firstName = firstName;
      this.lastName = lastName;
      System.out.println(this.firstName + " " + this.lastName);

      //Step 4: Call a method that asks for the department.
      this.department = setDepartment();
      System.out.println(this.department);

      //Step 6: Call a method that returns a random password
      this.password = randomPassword(passwordLength);
      System.out.println("Your password is: " + this.password);

      //combine elements to create an email address
      email = firstName.substring(0,1) + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix + ".com";
      System.out.println(email);
    }

    // Step 3: Ask for the department
    private String setDepartment() {
    System.out.println("DEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 For none.\nEnter Department Code: ");
    Scanner in = new Scanner(System.in); 
    int departmentChoice = in.nextInt();
    if( departmentChoice == 1) {return "sales"; }
    if( departmentChoice == 2) {return "development";}
    if( departmentChoice == 3) {return "accounting";}
    else { return "";}
    }

    // Step 5: Generate a random password
    private String randomPassword(int length){
      String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@$#%";
      //array
      char[] password = new char[length];
      for (int i = 0; i<length; i++)
      {
          int rand = (int) (Math.random() * passwordSet.length());
          password[i] = passwordSet.charAt(rand);
      }
      return new String(password);
      
    }

    // Step 4:  Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
      this.mailboxcapacity = capacity;
    }

    // Step 5:  Set the alternate email
    public void setAlternativeEmail(String altEmail){
      this.alternateEmail = altEmail;
    }
    // Step 6:  Change the password
     public void changePassword(String password){
      this.password = password;
    }  

    public int getMailboxCapacity() {return mailboxcapacity;}
    public String getAlternativeEmail() {return alternateEmail;}
    public String getPassword() {return password;}

    public String showInfo() {
      return "DISPLAY NAME: " + firstName + " " + lastName + "\n" +
             "COMPANY EMAIL: " + email + "\n" + 
             "MAILBOX CAPACITY: " + mailboxcapacity;
    }

}
