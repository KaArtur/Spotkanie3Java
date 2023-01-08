package pl.edu.wszib.jwd.pl.niedziela;

public class VisitCounterTester {

    public static void main(String[] args) {

        VisitCounter visitCounter = new VisitCounter();
        visitCounter.increment();
        visitCounter.increment();
        visitCounter.increment();
/*        visitCounter.counter++;
        visitCounter.counter=-13;*/
        System.out.println(visitCounter.getCounter());
    }
}
