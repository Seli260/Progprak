package Homework4.A3;

public class Lamp implements Switchable, Dimmable{
    boolean isOn;
    int brightness;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Lamp turned on.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Lamp turned off.");
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setBrightness(int level) {
        if(isOn){
            brightness = Math.min(MAX_BRIGHTNESS,Math.max(0,level));
            System.out.println("Brightness set to: " + brightness);
        }else{
            System.out.println("Cannot adjust brightness - Lamp is off!");
        }
    }

    @Override
    public int getBrightness() {
        return brightness;
    }
}

