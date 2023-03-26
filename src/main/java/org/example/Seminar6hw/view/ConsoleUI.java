package org.example.Seminar6hw.view;

import org.example.Seminar6hw.service.PresrnterService;
import java.util.Scanner;

public class ConsoleUI implements View {
    private PresrnterService presenter;
    private Scanner scanner;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void setPresenter(PresrnterService presenter){
        this.presenter = presenter;
    }

    @Override
    public void start() {
        String city = scan();
        presenter.onClick(city);
    }

    private String scan() {
        System.out.println("Введите город: (например: moscow)");
        return scanner.nextLine();
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
