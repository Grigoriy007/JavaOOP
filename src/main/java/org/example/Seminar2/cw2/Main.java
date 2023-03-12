package org.example.Seminar2.cw2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberOfPeople = 5;
        Human hm = new Human();
        Market market = new Market();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numberOfPeople; i++) {
            System.out.print("Зашёл покупатель, введите его имя: ");
            hm.name = scanner.nextLine();
            market.acceptToMarket(hm);
        }
        System.out.println("Список всех покупателей, находящихся в магазине: ");
        int count = 1;
        for (String s: market.actors) {
            System.out.println(count + ". " + s);
            count++;
        }

        market.takeInQueue(hm);
        market.releaseFromMarket(hm);
        market.giveOrder(hm);
        market.releaseFromMarket(hm);
        market.update();
        if (market.actors.isEmpty()) System.out.println("Теперь магазин пуст");
    }
}
