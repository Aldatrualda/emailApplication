package EmailProject;

import java.security.SecureRandom;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String secondName;
    private String password;
    private int defaultLengthOfPassword = 10;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    //Constructor to receive first name and second name of user
    public Email(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;

        //Call a method asking for the department - return the department
        this.department = setDepartment();

        //Call a method what create a random password
        this.password = createRandomPassword(defaultLengthOfPassword);
        System.out.println(password);
    }

    //Method to setting up the department
    private String setDepartment() {
        System.out.print("""
                Enter the department
                1 for Sales
                2 for Development
                3 for Accounting
                0 for None
                Department code:\s""");
        Scanner sc = new Scanner(System.in);
        int whatDepartmentIs = sc.nextInt();
        return switch (whatDepartmentIs) {
            case (1) -> "Sales";
            case (2) -> "Development";
            case (3) -> "Accounting";
            case (0) -> "";
            default -> null;
        };
    }

    //Random password
    private String createRandomPassword(int length) {

        //ASCII range - alphanumeric (0-9, a-z, A-Z)
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^";

        //Create the object to use methods of java.security.SecureRandom package
        SecureRandom random = new SecureRandom();
        //Create the variable of StringBuilder adding random char symbols to there
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++)
        {
            //Create the variable to choose a random index not more than a length of Char
            int randomIndex = random.nextInt(chars.length());
            //Add a char to password
            password.append(chars.charAt(randomIndex));
        }
        return password.toString();
    }


    //Set mailbox capacity

    //Set the alternate Email

    //Change the password
}
