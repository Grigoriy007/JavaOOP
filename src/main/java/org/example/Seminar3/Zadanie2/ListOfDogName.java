package org.example.Seminar3.Zadanie2;
import java.util.Comparator;

public class ListOfDogName implements Comparator<Dog> {
    @Override
    public int compare(Dog dog1, Dog dog2) {
        if(dog1.getName().length() == dog2.getName().length()){
            return 0;
        }
        if(dog1.getName().length() < dog2.getName().length()){
            return -1;
        }
        return 1;

    }
}
