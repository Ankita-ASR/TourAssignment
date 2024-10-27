class WeatherForecast {
    String day;
    double temperature;
    String condition;

    WeatherForecast(String day, double temperature, String condition) {
        this.day = day;
        this.temperature = temperature;
        this.condition = condition;
    }
}

public class ForecastPrinter {
    public static void main(String[] args) {
        WeatherForecast[] forecasts = {
                new WeatherForecast("Day 1", 29.5, "Sunny"),
                new WeatherForecast("Day 2", 27.3, "Rainy")
        };

        for (WeatherForecast forecast : forecasts) {
            System.out.println(forecast.day + " - " + forecast.temperature + "°C, " + forecast.condition);
        }
    }
}
