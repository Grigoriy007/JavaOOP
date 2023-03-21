package org.example.Seminar5hw.model;

import org.example.Seminar5.model.User;

import java.util.ArrayList;
import java.util.List;

public class AnimalsList {
    private List<Animals> animalsList = new ArrayList<>();

    public AnimalsList(List<Animals> animalsList) {
        this.animalsList = animalsList;
    }

//    public Animals getAnimals(String name) {
//        for (Animals animal : animalsList) {
//            if (animal.getName().equalsIgnoreCase(name)) return animal;
//        }
//        return new Animals("Такого пользователя нет");
//    }

}
