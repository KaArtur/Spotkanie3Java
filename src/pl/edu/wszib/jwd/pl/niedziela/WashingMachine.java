package pl.edu.wszib.jwd.pl.niedziela;

public class WashingMachine {

    private int temperature;
    private int spining;

    public void modeForSensitiveClothes(){
        temperature = 30;
        spining = 800;
    }

    public void modeForTowelsAndBedLinen(){
        temperature=90;
        spining=1200;
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "temperature=" + temperature +
                ", spining=" + spining +
                '}';
    }
}
