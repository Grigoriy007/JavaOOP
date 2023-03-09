package org.example.Seminar1.hw1;

import java.util.List;

public abstract class VendingMachine {
    abstract String getProduct(String name, int temp, int volume);

    abstract void initDrink(List<HotDrink> dr);
}
