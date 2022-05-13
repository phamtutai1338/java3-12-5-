package jdbcdemo.weatherapp;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


public class WeatherAPI {
    private static String keys;
    private static String city;
    private String country;

    Gson gson = new Gson();

    public WeatherAPI(String keys, String city, String country) {
        this.keys = keys;
        this.city = city;
        this.country = country;
    }
    public static String  getJsonApi(String link) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        URL url = new  URL(link);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        while ((line = bufferedReader.readLine())!=null){
            stringBuilder.append(line);

        }
        return stringBuilder.toString();

    }
    public static String  getLink(){


        String link="https://api.openweathermap.org/data/2.5/weather?q="+city+"&appid="+keys+"";

        return link;
    }
    public WeatherRoot getWeatherData() throws IOException {
       WeatherRoot weatherRoot = gson.fromJson(getJsonApi(getLink()), WeatherRoot.class);
       return weatherRoot;

    }
    public static void main(String[]args)throws IOException{
        String data = getJsonApi(getLink());
        System.out.println(data);
    }

}
