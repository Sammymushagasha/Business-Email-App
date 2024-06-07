package BusinessEmail;

import java.util.Random;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int mailboxCapacity;

    public Email(){
        this("John", "Doe");
    }

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstNameName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public String randomPassword(){
        String password = "";
        int count = 0;

        char[] list = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        while(count < 4){
            Random random = new Random();
            int randomNum = random.nextInt(26);

            for(int i = 0; i < 1; i++){
                password += list[randomNum];
                password += randomNum;
            }

            count++;
        }

        return password;
    }

    public void setPassword(){
        this.password = randomPassword();
    }

    public String getPassword(){
        setPassword();
        return password;
    }


    public int randomMailboxCapacity(){
        return (int) (Math.random() * 500);
    }

    public void setMailboxCapacity(){
        this.mailboxCapacity = randomMailboxCapacity();
    }

    public int getMailboxCapacity(){
        setMailboxCapacity();
        return mailboxCapacity;
    }

    public int userChoice(){
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a department \n1 for sales \n2 for development \n" +
                "3 for accounting \n4 for none \nEnter Here:");
        choice = input.nextInt();
        return choice;
    }

    public String getDepartment(){
        int userChoice = userChoice();
        String returnString;

        if(userChoice == 1){
            returnString = "sales";
        }
        else if (userChoice == 2) {
            returnString = "dev";
        }
        else if (userChoice == 3){
            returnString = "acc";
        }
        else{
            returnString = "";
        }
        return returnString;
    }

    public String emailHelperFunction(){
        String department = getDepartment();
        String returnString;

        if(department.length() > 0){
            returnString = department + ".company.com";
        }
        else{
            returnString = "company.com";
        }
        return returnString;
    }

    public String toString(){
        return "Name: " + firstName + " " + lastName + "\n" +
                "Your Email: " + firstName + "." + lastName + "@" + emailHelperFunction() + "\n" +
                "Your Password: " + getPassword() + "\n" +
                "Your Mailbox Capacity: " + getMailboxCapacity() + "gb";

    }

}
