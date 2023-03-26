package org.example.Seminar6hw.view;

import org.example.Seminar6hw.service.PresrnterService;

public interface View {
    void setPresenter(PresrnterService presenter);
    void start();
    void print(String text);
}
