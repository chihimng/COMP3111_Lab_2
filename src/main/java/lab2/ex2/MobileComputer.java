package lab2.ex2;

public class MobileComputer extends Computer implements Chargable{
    private int battery;

    public MobileComputer() {
        secret = "MobileComputer secret";
        battery = 5;
    }

    @Override
    public void work() {
        if (battery > 0) {
            System.out.println("It is working on my lap.");
            battery -= 1;
        } else {
            System.out.println("Running out of battery");
        }
    }

    @Override
    public void charge() {
        if (battery < 10) {
            battery += 1;
        }
    }
}
