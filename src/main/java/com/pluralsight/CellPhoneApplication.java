package com.pluralsight;
import java.util.Scanner;
public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone xPhone = new CellPhone();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello Person");

        System.out.print("Please enter your serial number:");
        xPhone.setSerialNumber(scanner.nextLong());
        scanner.nextLine();

        System.out.print("Please enter your phone number: ");
        xPhone.setPhoneNumber(scanner.nextLine());

        System.out.print("Please enter your phone model: ");
        xPhone.setModel(scanner.nextLine());

        System.out.print("Please enter your phone carrier: ");
        xPhone.setCarrier(scanner.nextLine());

        System.out.print("Please enter phone owner: ");
        xPhone.setOwner(scanner.nextLine());

        // System.out.println(xPhone.getSerialNumber() + " " + xPhone.getPhoneNumber() + " " + xPhone.getCarrier() + " " + xPhone.getModel() + " " + xPhone.getOwner());

        CellPhone zPhone = new CellPhone();

        System.out.print("Please enter your serial number:");
        zPhone.setSerialNumber(scanner.nextLong());
        scanner.nextLine();

        System.out.print("Please enter your phone number: ");
        zPhone.setPhoneNumber(scanner.nextLine());

        System.out.print("Please enter your phone model: ");
        zPhone.setModel(scanner.nextLine());

        System.out.print("Please enter your phone carrier: ");
        zPhone.setCarrier(scanner.nextLine());

        System.out.print("Please enter phone owner: ");
        zPhone.setOwner(scanner.nextLine());

        display(xPhone);
        display(zPhone);
        xPhone.dial( zPhone.getPhoneNumber() );
        zPhone.dial( xPhone.getPhoneNumber() );
    }
    public static void display(CellPhone phone) {
        System.out.println(phone.getSerialNumber() + " " + phone.getPhoneNumber() + " " + phone.getCarrier() + " " + phone.getModel() + " " + phone.getOwner());
    }
    }

