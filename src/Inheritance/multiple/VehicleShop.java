package Inheritance.multiple;

public class VehicleShop implements VehicleProperties,VehicleCalculation {
    String color, model, type;
    int price, units;

    VehicleShop(String color, String model, String type, int price, int units) {
        this.color = color;
        this.model = model;
        this.type = type;
        this.price = price;
        this.units = units;
    }

    @Override
    public void showdetails(){
        System.out.println("Vehicle Type: "+type);
        System.out.println("Vehicle Color: "+color);
        System.out.println("Vehicle Model: "+model);
    }

    @Override
    public void calculatePrice() {
        int result = price*units;
        System.out.println("Total Price: "+result);
    }
}
