package Homework4.A3;

public class LampDemo {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();

        lamp.turnOn();
        lamp.setBrightness(80);
        lamp.dimToHalf();

        System.out.println("Current Brightness: " + lamp.getBrightness());
        lamp.turnOff();
        lamp.setBrightness(100);

    }
}