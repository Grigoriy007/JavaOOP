package org.example.Seminar5hw.model;

public class Dogs extends Animals{
    private int age;
    private String color;

    public Dogs(String name, int age, String color) {
        super(name);
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Собака: " + super.getName() + ", " +
                "возраст: " + age + ", " +
                "раскрас: " + color + ".";
    }
}
