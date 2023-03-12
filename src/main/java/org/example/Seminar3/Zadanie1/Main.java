package org.example.Seminar3;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListOfCats cats = new ListOfCats();
        cats.setCatList(List.of(new Cat("barsik"), new Cat("murzik")));
        System.out.println(cats.iterator().next().toString());
        while (cats.iterator().hasNext()){
            System.out.println(cats.iterator().next().getName());
    }
    }
}

