package addressbooksystem;

import java.util.Scanner;

public class AddressbookUc6 {
	 static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws Exception 
	    {
	        AddressBook addressBook = new AddressBook();
	        while (true) 
	        {
	            System.out.println("--------------ENTER-------------");
	            System.out.println("c for creating a new contact");
	            System.out.println("f for filling contact details");
	            System.out.println("p for printing all contacts");
	            System.out.println("v for viewing  contact information");
	            System.out.println("e for editing contact information");
	            System.out.println("d for deleting contact information");
	            System.out.println("q for quitting");
	            System.out.print("enter option:");
	            String option = scanner.nextLine().trim().toLowerCase();
	            switch (option) 
	            {
	                case "c":
	                    addressBook.createNewContact();
	                    break;
	                case "f":
	                    addressBook.fillContactDetails();
	                    break;
	                case "p":
	                    addressBook.displayAllContacts();
	                    break;
	                case "v":
	                    addressBook.viewContactInfo();
	                    break;
	                case "e":
	                    addressBook.editContactInfo();
	                    break;
	                case "d":
	                    addressBook.deleteContact();
	                    break;
	                case "q":
	                    System.out.println("quiting....!");
	                    System.exit(0);
	                default:
	                    System.out.println("please enter the correct choice");
	                    break;
	            }

	        }
	    }

}
