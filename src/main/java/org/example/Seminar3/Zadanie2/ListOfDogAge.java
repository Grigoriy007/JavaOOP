package org.example.Seminar3.Zadanie2;

import java.util.Comparator;

public class ListOfDogAge implements Comparator<Dog> {
    @Override
    public int compare(Dog dog1, Dog dog2) {
        if(dog1.getAge() == dog2.getAge()){
            return 0;
        }
        if(dog1.getAge() < dog2.getAge()){
            return -1;
        }
        return 1;
    }
}
