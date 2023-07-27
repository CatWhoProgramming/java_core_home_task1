import Task2.Rectangle;

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

    }
}