package week2.c1_from_java_to_kotlin;

import java.awt.*;

import static java.awt.Color.*;

public class WeatherJava {

    public void updateWeather(int degrees) {
        String description;
        Color color;

        if (degrees < 10) {
            description = "cold";
            color = BLUE;
        } else if(degrees < 25) {
            description = "mild";
            color = ORANGE;
        } else {
            description = "hot";
            color = RED;
        }

        System.out.println("out: " + description + color);
    }

}
