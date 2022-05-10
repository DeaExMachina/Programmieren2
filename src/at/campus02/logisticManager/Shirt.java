package at.campus02.logisticManager;

public class Shirt implements Moveable {
    private String brand;
    private String size;
    private String color;

    public Shirt(String brand, String size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void move(String destination){
        System.out.println("Shirt " + brand + " " + color + " wird nach " + destination + " gebracht.");

    }
}
