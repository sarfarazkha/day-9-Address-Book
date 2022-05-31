package com.bridgelab.addressbook;

import java.util.Scanner;
import java.util.ArrayList;

class AddressBook5
{
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        
        
        
        abstract  class ContactPerson{
          abstract ContactPerson getInput();


            public void addressbook(ArrayList<ContactPerson> contactDetails) {
            }

            public void updateData(String name, ArrayList<ContactPerson> contactDetails) {
            }

            public void deleteRecord(String name, ArrayList<ContactPerson> contactDetails) {
            }
        }
        ContactPerson contactPersonDetails = new ContactPerson() {
            @Override
            ContactPerson getInput() {

                return null;
            }
        };
        ArrayList<ContactPerson> contactDetails = new ArrayList<>();
        String name;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int userChoice = 1;
        // User Choose the Option
        while (flag) {
            System.out.print(" 1 - Add more contact \n2 - Edit Contact \n3 - Delete Person Contact \n4 - Show AddressBook " + "\n0 - for exist \n Enter your choice");
            userChoice = sc.nextInt();

            switch (userChoice) {
                case 1:
                    contactDetails.add(contactPersonDetails.getInput());
                    break;
                case 2:
                    System.out.println("Enter first name that you want to edit contactDetails");
                    name = sc.next();
                    contactPersonDetails.updateData(name, contactDetails);
                    break;
                case 3:
                    System.out.println("Enter the first name that you want to delete Contact details ");
                    name = sc.next();
                    contactPersonDetails.deleteRecord(name, contactDetails);
                    break;
                case 4:
                    System.out.println("contactDetails : " + contactDetails.size());
                    contactPersonDetails.addressbook(contactDetails);
                    break;
                case 0:
                    flag = false;
                    break;
            }
        }
    }
}
