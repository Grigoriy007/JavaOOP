package org.example.Seminar1.hw1;
import java.util.*;



public class Main {
    public static void main(String[] args) {
        VendingMachine vmHdr = new VendingMachineHotDrinks();
        Vending<HotDrink> productTake = new Vending<HotDrink>();

        productTake.addProduct(new HotDrink("coffee", 30,55, 200));
        productTake.addProduct(new HotDrink("tea", 25, 50,200));
        productTake.addProduct(new HotDrink("chocolate", 45, 45,350));
        productTake.addProduct(new HotDrink("kisel", 35, 45,200));
        productTake.addProduct(new HotDrink("latte", 75, 55,400));
        productTake.addProduct(new HotDrink("coffee", 55, 55,350));
        productTake.addProduct(new HotDrink("tea", 45, 50,300));
        productTake.addProduct(new HotDrink("mokiato", 75, 55,400));
        productTake.addProduct(new HotDrink("tea", 25, 50,200));

        System.out.println(productTake.allProducts().toString());

        vmHdr.initDrink(productTake.allProducts());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите наименование напитка: ");
        String nameDrink = scanner.nextLine();
        System.out.print("Введите температуру напитка: ");
        int tempDrink = scanner.nextInt();
        System.out.print("Введите объем напитка: ");
        int volDrink = scanner.nextInt();

        System.out.println(vmHdr.getProduct(nameDrink, tempDrink, volDrink));
    }

}
