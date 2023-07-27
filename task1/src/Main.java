import Task2.Rectangle;
import Task4.Computer;
import Task5.Address;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(4, 5);
        Scanner input = new Scanner(System.in);
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        rect.setSide1(side1);
        rect.setSide2(side2);
        System.out.println("Enter side1 and side2 for class rectangle:");
        System.out.println(rect.perimeterCalculator(rect.getSide1(), rect.getSide2()));
        System.out.println( rect.areaCalculator(rect.getSide1(), rect.getSide2()));
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
        Computer comp = new Computer();
        Computer comp1 = new Computer();
        Computer comp2 = new Computer();
        Computer comp3 = new Computer();
        Computer comp4 = new Computer();
        Computer comp5 = new Computer();
        for (int i=0; i<comp.getComputers().length; i++ ){
            String name = "comp"+i;
            //comp.setComputers(1);
        }

    }
}