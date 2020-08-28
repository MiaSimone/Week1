package dto;

public class CarDTO {
    private String make;
    private double price;
    private int year;

    public CarDTO(String make, double price, int year) {
        this.make = make;
        this.price = price;
        this.year = year;
    }
    public CarDTO(){} //Required for the automatic demo
    
    //Getters and Setters ....
}
