package org.example.Seminar2.cw2;

import java.util.*;

public class Market implements MarketBehavior, QueueBehaviour {

    List<String> actors = new LinkedList<>();
    List <String> actorsQueue = new LinkedList<>();
    List<String> actorsOutFirst = new LinkedList<>();

    @Override
    public void acceptToMarket(Buyer actor) {
        System.out.println(actor.getName() + " зашел в магазин");
        actors.add(actor.name);
    }


    @Override
    public void releaseFromMarket(Buyer actor) {
        if (!actorsOutFirst.isEmpty()) {
            System.out.println(actorsOutFirst + " вышли из магазина без покупок");
            actorsOutFirst.clear();
        } else {
            for (int i = 0; i < actors.size(); i++) {
                if (!actorsQueue.contains(actors.get(i))) {
                    System.out.println(actors.get(i) + " вышел из магазина");
                    actors.remove(i);
                    i--;
                }
            }
        }

    }

    @Override
    public void update() {
    }

    @Override
    public void takeInQueue(Buyer actor) {
        for (String q: actors){
           int choosing = (int) (Math.random() * 2);
           if (choosing == 1){
               actorsQueue.add(q);
               System.out.println(q + " положил покупки в корзину и встал в очередь");
           }
        }
        System.out.println("Список всех покупателей в очереди: " + actorsQueue);
        for (int i = 0; i < actors.size(); i++) {
            if(!actorsQueue.contains(actors.get(i))) {
                actorsOutFirst.add(actors.get(i));
                actors.remove(i);
                i--;
            }

        }
    }


    @Override
    public void giveOrder(Buyer actor) {
        for (int i = 0; i < actorsQueue.size(); i++) {
            System.out.println(actorsQueue.get(i) + " сделал заказ");
            takeOrder(actorsQueue.get(i));
            releaseFromQueue(actorsQueue.get(i));
            actorsQueue.remove(i);
            i--;
            releaseFromMarket(actor);

        }

    }

    @Override
    public void takeOrder(String takeAc) {
        System.out.println(takeAc + " забрал заказ");
    }


    @Override
    public void releaseFromQueue(String takeAc) {
        System.out.println(takeAc + " покинул очередь");
    }

}
