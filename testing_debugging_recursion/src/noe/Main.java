package noe;

import noe.models.RoomTemperatureSensor;

public class Main {
    public static void main(String[] args) {
        roomTemperatureSensorTest();
    }
    public static void roomTemperatureSensorTest(){
        System.out.println("temp is 20 and is normal: "
                +RoomTemperatureSensor.getStatus(20).equals("normal"));
        System.out.println("temp is 30 and is hot: "
        + RoomTemperatureSensor.getStatus(30).equals("hot"));
        System.out.println("temp is 40 and is danger: "
        + RoomTemperatureSensor.getStatus(40).equals("danger"));
    }
}
