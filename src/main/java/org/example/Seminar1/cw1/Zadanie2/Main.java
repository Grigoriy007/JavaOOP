/**
 * Сделать класс Товар абстрактным, создать нескольких наследников
 * (к примеру: БутылкаВоды), сделать интерфейсом ТорговыйАвтомат и реализовать класс
 * какого-то одного
 * типа ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат
 */

package org.example.Seminar1.cw1.Zadanie2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        VendingMachine1 vm = new VendingMachine1();
        List<BottleOfWater> bw = new ArrayList<>(Arrays.asList(new BottleOfWater("pepsi", 42),
                new BottleOfWater("sprite", 67), new BottleOfWater("cola", 70),
                new BottleOfWater("sprite", 90),new BottleOfWater("sprite", 150)));

        vm.initProduct(bw);
        System.out.println(vm.getProduct("sprite", 91).toString());

    }

}
