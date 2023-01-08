package pl.edu.wszib.jwd.pl.niedziela;

public class InstanceCounter {

    private static int numInstances = 0;

    public static int getNumInstances() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }

    public InstanceCounter() {
        addInstance();
    }

    public static void main(String[] args) {
        System.out.println("Na początku " + InstanceCounter.getNumInstances());

        for (int i = 0; i < 1000; i++) {
            new InstanceCounter();
        }
        System.out.println("Na utworzono " + InstanceCounter.getNumInstances());



    }

}
