package Inheritance.multiple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String type,color,model;
        int price,units;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter vehicle type:");
        type=in.nextLine();
        System.out.println("Enter vehicle color:");
        color=in.nextLine();
        System.out.println("Enter vehicle model:");
        model=in.nextLine();
        System.out.println("Enter number of units:");
        units=in.nextInt();
        System.out.println("Enter price of single unit:");
        price=in.nextInt();

        VehicleShop car1 = new VehicleShop(type,color,model,price,units);
        VehicleProperties car = car1;
        VehicleCalculation cost = car1;
        car.showdetails();
        cost.calculatePrice();
    }
}
