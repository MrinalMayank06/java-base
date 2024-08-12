class onee {
    public void greet() {
        System.out.println("Good morning");
    }

    public void one() {
        System.out.println("my name is Lunar 1");
    }
}

class twoo extends onee {
    public void Swagat() {
        System.out.println("Apka swagat hai");
    }

    @Override
    public void one() {
        System.out.println("my name is Lunar 2");
    }
}

public class km_dynamic_dispatch {
    public static void main(String[] args) {
        System.out.println("Dynamic Dispatch");

        // Uncomment the following lines to create objects and call methods
        // onee obj = new onee();
        // twoo tobj = new twoo();

        onee obj = new twoo(); // Creating an instance of the subclass
        obj.greet(); // This will call the greet() method of the subclass
    }
}
