package org.example.Seminar6hw.model;
import com.google.gson.Gson;
import org.example.Seminar6hw.model.weather.Weather;

public class Formatter {
    public Weather parse(String info) {
        Gson gson = new Gson();
        Weather weather = gson.fromJson(info, Weather.class);
        return weather;
    }
}
