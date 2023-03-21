package org.example.Seminar5hw;

import org.example.Seminar5hw.model.Animals;
import org.example.Seminar5hw.model.Cats;
import org.example.Seminar5hw.model.Dogs;
import org.example.Seminar5hw.view.AnimalView;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean endOrNot = true;

        while (endOrNot) {
            System.out.println("Кто поступил? Кошка или собака?");
            String ward = scanner.next().toLowerCase();
            if (ward.equals("кошка")) {
                System.out.print("Введите кличку: ");
                String name = scanner.next();
                System.out.print("Введите возраст: ");
                int age = scanner.nextInt();
                System.out.print("Введите окрас: ");
                String color = scanner.next();
                Animals cats = new Cats(name, age, color);
                System.out.println(cats + " поступил(а) в приют");
                AnimalView animalView = new AnimalView();
                animalView.saveAnimal(cats);
            }
            if (ward.equals("собака")) {
                System.out.print("Введите кличку: ");
                String name = scanner.next();
                System.out.print("Введите возраст: ");
                int age = scanner.nextInt();
                System.out.print("Введите окрас: ");
                String color = scanner.next();
                Animals dogs = new Dogs(name, age, color);
                System.out.println(dogs + " поступил(а) в приют");
                AnimalView animalView = new AnimalView();
                animalView.saveAnimal(dogs);
            }
            endOrNot = controlEnd();
        }

    }


    public static boolean controlEnd() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Вы хотите внести ещё какое то животное? Ответьте Да или Нет: ");
        String answer = sc.next().toLowerCase();
        if (answer.equals("да")) {
            return true;
        }

        return false;
    }

}
