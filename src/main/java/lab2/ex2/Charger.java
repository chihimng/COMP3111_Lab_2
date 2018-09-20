package lab2.ex2;

interface Chargable {
    public void charge();
}

public class Charger {
    public void charge(Chargable c) {
        c.charge();
    }
}
