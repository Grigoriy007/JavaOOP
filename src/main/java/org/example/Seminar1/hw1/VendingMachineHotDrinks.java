package org.example.Seminar1.hw1;
import java.util.*;

public class VendingMachineHotDrinks extends VendingMachine {

    List<HotDrink> drinks = new ArrayList<>();

    void initDrink(List<HotDrink> dr) {
        this.drinks = dr;
    }


    @Override
    String getProduct(String name, int temp, int volume) {
        List<HotDrink> hd = new ArrayList<>();
        for (HotDrink drink : drinks) {
            if ((drink.getName().contains(name) && drink.getTemperature() == temp && drink.getVolume() == volume)) {
                hd.add(drink);
            }
        }
        if (!hd.isEmpty()){
            return hd.toString();
        }
        else return new HotDrink("По заданным критериям ничего не найдено",0, 0, 0).toString();
    }
}
