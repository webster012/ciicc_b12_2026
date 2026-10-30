interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        // put gorilla food into cage
        if (timeToEat) {
            System.out.println("Feeding the gorilla.");
            return true;
        }
        System.out.println("It is not time to eat.");
        return false;
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Grooming the gorilla.");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("Be careful when petting the gorilla!");
    }
}

public class Task16 {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();

        gorilla.feed(true);
        gorilla.groom();
        gorilla.pet();
    }
}