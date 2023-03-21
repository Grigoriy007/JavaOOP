package org.example.Seminar5hw.service;

import org.example.Seminar5hw.model.Animals;
import java.io.FileWriter;

public class AnimalServiceImpl implements AnimalsService {
    @Override
    public void save(Animals animal) {

        try (FileWriter fileWriter = new FileWriter("C:\\IdeaProjects\\OOPJavaGB\\src\\main\\java\\org\\example\\Seminar5hw\\Shelter.txt", true)) {
            fileWriter.write(animal.toString() + "\n");
        } catch (Exception e) {
            System.out.println("Невозможно сохранить");
            e.printStackTrace();
        }
    }
}
