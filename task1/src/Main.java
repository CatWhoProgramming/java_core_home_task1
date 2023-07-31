import Task2.Rectangle;
import Task4.Computer;
import Task5.Address;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side1 and side2 for class rectangle:");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        Rectangle rect = new Rectangle(side1, side2);
        System.out.println(rect.perimeterCalculator());
        System.out.println(rect.areaCalculator());
        input.close();

        fillComputerArray();
        fillAddress();

    }

    private static void fillAddress() {
        Address address = new Address();
        System.out.println("Address old");
        System.out.println(address.getIndex());
        System.out.println(address.getCountry());
        System.out.println(address.getCity());
        System.out.println(address.getStreet());
        System.out.println(address.getHouse());
        System.out.println(address.getApartment());
        address.setIndex(12);
        address.setCountry("Poland");
        address.setCity("Varshava");
        address.setStreet("Polska");
        address.setHouse(23);
        address.setApartment(56);
        System.out.println("Address new");
        System.out.println(address.getIndex());
        System.out.println(address.getCountry());
        System.out.println(address.getCity());
        System.out.println(address.getStreet());
        System.out.println(address.getHouse());
        System.out.println(address.getApartment());

    }

    private static void fillComputerArray() {
        Computer[] comp = new Computer[]{new Computer("comp1"), new Computer("comp2"),
                new Computer("comp3"), new Computer("comp4"), new Computer("comp5")};

        for (Computer i : comp) {
            System.out.println(i.show());
        }
    }
}