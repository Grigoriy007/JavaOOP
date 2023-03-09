package org.example.Seminar1.hw1;

public class HotDrink extends Product {

    private String name;
    private int price;
    private int temperature;
    private int volume;


    public HotDrink(String name, int price, int temperature, int volume) {
        this.name = name;
        this.price = price;
        this.temperature = temperature;
        this.volume = volume;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }



    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", temperature=" + temperature +
                ", volume=" + volume +
                '}';
    }
}
