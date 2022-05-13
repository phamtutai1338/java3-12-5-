package jdbcdemo.weatherapp;

public class WeatherRoot {
    private Coord coord;
    private Weather[] weathers;
    private Main main;
    private Wind wind;

    public WeatherRoot(Coord coord,Weather[] weathers, Main main){
        this.coord = coord;
        this.weathers = weathers;
        this.main = main;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public Weather[] getWeathers() {
        return weathers;
    }

    public void setWeathers(Weather[] weathers) {
        this.weathers = weathers;
    }
}
