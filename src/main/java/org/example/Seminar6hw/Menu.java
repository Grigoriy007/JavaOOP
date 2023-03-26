package org.example.Seminar6hw;

import org.example.Seminar6hw.model.Service;
import org.example.Seminar6hw.model.WeatherService;
import org.example.Seminar6hw.service.PresrnterService;
import org.example.Seminar6hw.view.*;

public class Menu {
    public static void startApp() {
        View view = new DesktopUI();
        Service service = new WeatherService();
        PresrnterService presenter = new PresrnterService(view, service);

        view.start();
    }
}
