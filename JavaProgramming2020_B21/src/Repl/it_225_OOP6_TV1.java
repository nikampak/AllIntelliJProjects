package Repl;

public class it_225_OOP6_TV1 {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;
    String brand = "undefined";

    public it_225_OOP6_TV1(){
        System.out.println("Creating TV object using no Args- constructor");
    }

    public it_225_OOP6_TV1(String brand){
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if (isOn () && volumeLevel >= 1 && volumeLevel <= 6) {
            this.volumeLevel = volumeLevel;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (isOn() && channel >= 1 && channel <= 119) {
            this.channel = channel;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void channelUp() {
        if (isOn() && channel <= 119) {
            channel += 1;
        }
    }

    public void channelDown() {
        if (isOn() && channel >= 2) {
            channel -= 1;
        }
    }

    public void volumeUp() {
        if (isOn() && volumeLevel <= 6) {
            volumeLevel += 1;
        }
    }

    public void volumeDown() {
        if (isOn() && volumeLevel >= 2) {
            volumeLevel -= 1;
        }
    }

    public boolean isOn() {
        if(on){
            return true;
        }else{
            return false;
        }

    }

    public void turnOn() {
        if (on) {
            System.out.println("TV is already ON");
        } else {
            on = true;
        }
    }

    public void turnOff() {
        if (!on) {
            System.out.println("TV is already OFF");
        } else {
            on = false;
        }
    }
}