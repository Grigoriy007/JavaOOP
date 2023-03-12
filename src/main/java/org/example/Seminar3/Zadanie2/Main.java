package org.example.Seminar3.Zadanie2;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ListOfDogs listOfDogs = new ListOfDogs();
        listOfDogs.setListDogs(Arrays.asList(
                new Dog("Рыжий Ап", 2),
                new Dog("Рон Уизли", 3),
                new Dog("Шкурка Хлебная", 9),
                new Dog("Шар", 6),
                new Dog("Дизоксирибонуклиотид", 12)));


        System.out.println("Список собак через Iterator: ");
        Iterator<Dog> we = listOfDogs.iterator();
        while (we.hasNext()) {
            System.out.println("Кличка собаки: " + we.next().getName() + ", " + "возраст собаки: " + we.next().getAge());
        }

        System.out.println("\nСписок собак и их возрастов для использования Comparable: ");
        Collections.sort(listOfDogs.getListDogs());
            for(Dog dogs: listOfDogs){
                System.out.println(dogs);
            }

        System.out.println("\nСписок собак по возрасту через Comparator: ");
        listOfDogs.getListDogs().sort(new ListOfDogAge());
        for (Dog dogs: listOfDogs){
            System.out.println(dogs);
        }

        System.out.println("\nСписок собак по кличке через Comparator: ");
        listOfDogs.getListDogs().sort(new ListOfDogName());
        for (Dog dogs: listOfDogs) {
            System.out.println(dogs);
        }
    }

}
