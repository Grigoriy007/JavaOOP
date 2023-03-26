package org.example.Seminar6hw.service;

import org.example.Seminar6hw.model.Service;
import org.example.Seminar6hw.view.View;

public class PresrnterService {
    private View view;
    private Service service;

    public PresrnterService(View view, Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }

    public void onClick(String city){
        String answer = service.get(city);
        view.print(answer);
    }
}
