package jdbcdemo.weatherapp;

import java.io.IOException;

public class WeatherApplication {
    public static void main(String [] args) throws IOException{
        WeatherAPI weatherAPI = new WeatherAPI("1de0c59aebbf5ebe6f6536d1b0f73ac9","Hanoi","VN");
        System.out.println(weatherAPI.getWeatherData().getCoord().lon);
        System.out.println(weatherAPI.getWeatherData().getCoord().lat);
        System.out.println(weatherAPI.getWeatherData().getMain().temp);
        System.out.println(weatherAPI.getWeatherData().getMain().feels_like);
        System.out.println(weatherAPI.getWeatherData().getMain().temp_min);
        System.out.println(weatherAPI.getWeatherData().getMain().pressure);
        System.out.println(weatherAPI.getWeatherData().getMain().humidity);
        System.out.println(weatherAPI.getWeatherData().getMain().sea_level);
        System.out.println(weatherAPI.getWeatherData().getMain().grnd_level);
        System.out.println(weatherAPI.getWeatherData().getWind().speed);
        System.out.println(weatherAPI.getWeatherData().getWind().deg);
        System.out.println(weatherAPI.getWeatherData().getWind().gust);




    }


}
