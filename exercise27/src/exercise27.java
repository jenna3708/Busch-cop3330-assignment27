import java.util.Scanner;
import java.util.regex.Pattern;

public class exercise27 {

    static int validateFName(String firstName)
    {

        if(firstName.length() == 0)
        {
            return 2;
        }
        else if(firstName.length() < 2 )
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }

    static int validateLName(String lastName)
    {

        if(lastName.length() == 0)
        {
            return 2;
        }
        else if(lastName.length() < 2)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }

    static int validateZip(String zip)
    {
        if(zip.matches("[0-9]+") && zip.length() == 5)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    static int validateID(String employeeID)
    {
        if(employeeID.matches("(^[A-Z]{2})-\\d{4}$"))
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    static void validateInput(String fName, String lName, String zip, String ID)
    {
        //call the functions put results in variables
        int fNameResult;
        int lNameResult;
        int zipResult;
        int IdResult;

        fNameResult = validateFName(fName);
        lNameResult = validateLName(lName);
        zipResult = validateZip(zip);
        IdResult = validateID(ID);

        if(fNameResult == 0)
        {
            System.out.println("The first name must be at least 2 characters long.");
        }
        if(fNameResult == 2)
        {
            System.out.println("The first name must be filled in.");
        }
        if(lNameResult == 0)
        {
            System.out.println("The last name must be at least 2 characters long.");
        }
        if(fNameResult == 2)
        {
            System.out.println("The last name must be filled in.");
        }
        if(zipResult == 0)
        {
            System.out.println("The zipcode must be a 5 digit number.");
        }
        if(IdResult == 0)
        {
            System.out.println("The employee ID must be in the format of AA-1234.");
        }
        if(fNameResult == 1 && lNameResult == 1 && zipResult == 1 && IdResult == 1)
        {
            System.out.println("There were no errors found.");
        }

    }



    public static void main(String[] args) {

        //create a scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first name:");
        String fName = input.next();

        System.out.println("Enter the last name:");
        String lName = input.next();

        System.out.println("Enter the ZIP code:");
        String zip = input.next();

        System.out.println("Enter the employee ID:");
        String ID = input.next();

        validateInput(fName, lName, zip, ID);


    }
}
