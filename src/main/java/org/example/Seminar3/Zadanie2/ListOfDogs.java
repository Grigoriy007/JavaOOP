package org.example.Seminar3.Zadanie2;

import java.util.Iterator;
import java.util.List;

public class ListOfDogs implements Iterable<Dog>{
    private List<Dog> listDogs;

    @Override
    public Iterator<Dog> iterator() {
        return new ListOfDogsIterator(listDogs);
    }

    public List<Dog> getListDogs() {
        return listDogs;
    }

    public void setListDogs(List<Dog> listDogs) {
        this.listDogs = listDogs;
    }
}
