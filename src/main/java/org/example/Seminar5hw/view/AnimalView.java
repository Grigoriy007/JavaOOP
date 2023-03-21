package org.example.Seminar5hw.view;

import org.example.Seminar5hw.model.Animals;
import org.example.Seminar5hw.service.AnimalServiceImpl;
import org.example.Seminar5hw.service.AnimalsService;

public class AnimalView {

    private final AnimalsService animalsService = new AnimalServiceImpl();

    public void saveAnimal (Animals animal){
        animalsService.save(animal);
    }
}
