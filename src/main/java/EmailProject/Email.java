package EmailProject;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String secondName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    //Constructor to receive first name and second name of user
    public Email(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;

        //Call a method asking for the department - return the department
        this.department = setDepartment();
    }

    //Method to setting up the department
    private String setDepartment() {
        System.out.print("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None" +
                "\nDepartment code: ");
        Scanner sc = new Scanner(System.in);
        int whatDepartmentIs = sc.nextInt();
        String department = null;
        switch (whatDepartmentIs) {
            case (1):
                department = "Sales";
                break;
            case (2):
                department = "Development";
                break;
            case (3):
                department = "Accounting";
                break;
            case (0):
                department = "";
                break;
        }
        return department;
    }

    //Random password

    //Set mailbox capacity

    //Set the alternate Email

    //Change the password
}
