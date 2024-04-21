package EmailApp;

import java.util.Scanner;
public class Email {
    private String genEmail;
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPWlength = 12;
    private String department;
    private String altEmail;
    private int mailCapacity = 100;

    //Constructor for First & Last name
    public Email(String firstName, String lastName) {
        System.out.println("Please Enter Employee Name: ");
        Scanner in = new Scanner(System.in);
        String fName = in.next();
        String lName = in.next();
        this.firstName = fName;
        this.lastName = lName;
        System.out.println("Email Created: " + this.firstName + " " + this.lastName);

        //method asking for department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        //Presenting Business email
        this.genEmail = this.firstName + this.lastName + "@company" + this.department + ".com";
        System.out.println("Your Business Email is: " + this.genEmail);

        //method asking for password
        this.password = setPassword(defaultPWlength);
        System.out.println("Your Auto Generated Password is: " + this.password);
    }

    //Ask for Department
    private String setDepartment() {
        System.out.println("Enter the Department ID:\n 1 for Sales\n 2 for Engineering\n 3 for HR");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "Sales";
        } else if (depChoice == 2) {
            return "Engineering";
        } else if (depChoice == 3) {
            return "HR";
        } else {
            return "invalid option";
        }
