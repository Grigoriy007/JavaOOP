package org.example.Seminar3.Zadanie2;

public class Dog implements Comparable<Dog>{
    private String name;

    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Кличка собаки: " + name + ", " + "возраст собаки: " + age;
    }

    public int compareTo (Dog dog){
        if(age == dog.getAge()){
            return name.compareTo(dog.getName());
        }
        if (age < dog.getAge()){
            return -1;
        }
        return 1;

    }
}
