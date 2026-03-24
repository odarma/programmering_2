package noe.models;

public abstract class RoomTemperatureSensor {
    public static String getStatus(double temperature) {
        if (temperature >= 25 && temperature < 35) {
            return "hot";
        }
        else if (temperature>=35){
            return "danger";
        }
        return "normal";
    }
}
