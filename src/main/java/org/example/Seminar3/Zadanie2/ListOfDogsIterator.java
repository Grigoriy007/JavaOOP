package org.example.Seminar3.Zadanie2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOfDogsIterator implements Iterator<Dog> {
    private List<Dog> listOfDogIterable = new ArrayList<>();

    private int count = -1;


    public ListOfDogsIterator(List<Dog> listOfDogIterable) {
        this.listOfDogIterable = listOfDogIterable;
    }

    @Override
    public boolean hasNext() {
        this.count++;
        return count < listOfDogIterable.size();
    }

    @Override
    public Dog next() {
        return listOfDogIterable.get(count);
    }
}
